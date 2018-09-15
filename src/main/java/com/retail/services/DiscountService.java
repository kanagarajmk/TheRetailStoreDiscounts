package com.retail.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.db.models.Products;
import com.retail.db.models.Users;
import com.retail.enums.ProductTypes;
import com.retail.enums.UserTypes;
import com.retail.repository.ProductRepository;
import com.retail.repository.UserRepository;
import com.retail.view.models.DiscountRequest;
import com.retail.view.models.DiscountResponse;

@Service
public class DiscountService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductRepository productRepository;

	public DiscountResponse getDiscount(DiscountRequest discountRequest) {
		Double groceriesTotal = new Double(0);
		Double nonGroceriesTotal = new Double(0);
		Double nonGroceriesDiscount = new Double(0);
		Double total = new Double(0);
		Double discountForAll = new Double(0);
		DiscountResponse response = new DiscountResponse();

		Users user = userRepository.findOneById(discountRequest.getUserId());
		int discountByUser = getDisCountByUser(user);

		if (discountRequest.getProducts() == null)
			return null;

		for (int i = 0; i < discountRequest.getProducts().size(); i++) {
			Products product = productRepository.findOneById(discountRequest.getProducts().get(i).getId());
			if (product.getType().getType().equals(ProductTypes.GROCERIES.toString())) {
				groceriesTotal = groceriesTotal
						+ (product.getPrice() * discountRequest.getProducts().get(i).getQuantity());
			} else {
				nonGroceriesTotal = nonGroceriesTotal
						+ (product.getPrice() * discountRequest.getProducts().get(i).getQuantity());
			}
		}

		nonGroceriesDiscount = nonGroceriesTotal * (Double.valueOf(discountByUser) / Double.valueOf(100));
		total = groceriesTotal + (nonGroceriesTotal - nonGroceriesDiscount);
		discountForAll = total * (Double.valueOf(5) / Double.valueOf(100));
		total = total - discountForAll;
		response.setNonGroceriesTotal(nonGroceriesTotal);
		response.setGroceriesTotal(groceriesTotal);
		response.setDiscount(discountByUser + "%");
		response.setDiscountTotal(nonGroceriesDiscount);
		response.setDiscountForAll(discountForAll);
		response.setTotal(total);
		return response;
	}

	private int getDisCountByUser(Users user) {
		if (user == null)
			return 0;

		if (user.getUserType().getType().equals(UserTypes.EMPLOYEE.toString())) {
			return 30;
		} else if (user.getUserType().getType().equals(UserTypes.AFFILIATE.toString())) {
			return 10;
		} else if (user.getRegisteredDate().isBefore(LocalDate.now().minusYears(2))) {
			return 5;
		}

		return 0;
	}
}
