package com.nous.sample.model.abstractFactoryPattern;

public class Electronic extends Product {

	private Long id;
	private String name;
	private String description;
	private Integer quantity;
	private Double unitPrice;

	public Electronic(Long id, String name, String description, Integer quantity, Double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public Integer getQuantity() {
		return this.quantity;
	}

	@Override
	public Double getUnitPrice() {
		return this.unitPrice;
	}

}
