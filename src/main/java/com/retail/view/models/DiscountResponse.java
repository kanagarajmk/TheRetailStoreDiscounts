package com.retail.view.models;

public class DiscountResponse {

	private Double groceriesTotal;
	private Double nonGroceriesTotal;
	private String discount;
	private Double discountTotal;
	private Double discountForAll;
	private Double total;

	public Double getNonGroceriesTotal() {
		return nonGroceriesTotal;
	}

	public void setNonGroceriesTotal(Double nonGroceriesTotal) {
		this.nonGroceriesTotal = nonGroceriesTotal;
	}

	public Double getGroceriesTotal() {
		return groceriesTotal;
	}

	public void setGroceriesTotal(Double groceriesTotal) {
		this.groceriesTotal = groceriesTotal;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Double getDiscountTotal() {
		return discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getDiscountForAll() {
		return discountForAll;
	}

	public void setDiscountForAll(Double discountForAll) {
		this.discountForAll = discountForAll;
	}

}
