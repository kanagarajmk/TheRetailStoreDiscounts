package com.retail.view.models;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DiscountRequest {

	private Long userId;

	@NotNull
	@NotEmpty
	private List<ProductBuyRequest> products;

	public DiscountRequest() {
	}

	public DiscountRequest(Long userId,List<ProductBuyRequest> products) {
		super();
		this.userId = userId;
		this.products = products;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<ProductBuyRequest> getProducts() {
		return products;
	}

	public void setProducts(List<ProductBuyRequest> products) {
		this.products = products;
	}

}
