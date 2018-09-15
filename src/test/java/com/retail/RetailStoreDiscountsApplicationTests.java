package com.retail;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.retail.services.DiscountService;
import com.retail.view.models.DiscountRequest;
import com.retail.view.models.ProductBuyRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetailStoreDiscountsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	DiscountService discountService;
	
	@Test
	public void checkEmptyProductTest() {
		DiscountRequest discountRequest = new DiscountRequest(0L, null); 
		assertNull(discountService.getDiscount(discountRequest));
	}
	
	
	@Test
	public void employeeProductTest() {
		DiscountRequest discountRequest = new DiscountRequest(1L, getProductsWithGroceries()); 
		assertNotNull(discountService.getDiscount(discountRequest));
	}
	
	@Test
	public void otherUserProductTest() {
		DiscountRequest discountRequest = new DiscountRequest(3L, getProductsWithGroceries()); 
		assertNotNull(discountService.getDiscount(discountRequest));
	}
	
	@Test
	public void employeeProductWOGTest() {
		DiscountRequest discountRequest = new DiscountRequest(1L, getProductsWithoutGroceries()); 
		assertNotNull(discountService.getDiscount(discountRequest));
	}
	
	@Test
	public void otherUserProductWOGTest() {
		DiscountRequest discountRequest = new DiscountRequest(3L, getProductsWithoutGroceries()); 
		assertNotNull(discountService.getDiscount(discountRequest));
	}
	
	@Test
	public void employeeProductAllTest() {
		DiscountRequest discountRequest = new DiscountRequest(1L, getProductsWithAll()); 
		assertNotNull(discountService.getDiscount(discountRequest));
	}
	
	@Test
	public void otherUserProductAllTest() {
		DiscountRequest discountRequest = new DiscountRequest(3L, getProductsWithAll()); 
		assertNotNull(discountService.getDiscount(discountRequest));
	}
	
	private List<ProductBuyRequest> getProductsWithGroceries() {
		List<ProductBuyRequest> products= new ArrayList<ProductBuyRequest>();
		products.add(new ProductBuyRequest(2L, 3L));
		products.add(new ProductBuyRequest(3L, 10L));
		products.add(new ProductBuyRequest(5L, 15L));
		return products;
	}
	
	private List<ProductBuyRequest> getProductsWithoutGroceries() {
		List<ProductBuyRequest> products= new ArrayList<ProductBuyRequest>();
		products.add(new ProductBuyRequest(1L, 23L));
		products.add(new ProductBuyRequest(7L, 12L));
		return products;
	}
	
	private List<ProductBuyRequest> getProductsWithAll() {
		List<ProductBuyRequest> products= new ArrayList<ProductBuyRequest>();
		products.add(new ProductBuyRequest(3L, 12L));
		products.add(new ProductBuyRequest(5L, 5L));
		products.add(new ProductBuyRequest(8L, 8L));
		products.add(new ProductBuyRequest(4L, 3L));
		products.add(new ProductBuyRequest(9L, 10L));
		return products;
	}
}
