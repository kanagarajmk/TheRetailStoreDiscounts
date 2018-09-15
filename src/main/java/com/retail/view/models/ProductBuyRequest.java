package com.retail.view.models;

public class ProductBuyRequest {

	private Long id;
	private Long quantity;

	public ProductBuyRequest() {
	}

	public ProductBuyRequest(Long id, Long quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
