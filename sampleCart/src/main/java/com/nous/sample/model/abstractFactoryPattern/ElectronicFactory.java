package com.nous.sample.model.abstractFactoryPattern;

public class ElectronicFactory implements ProductAbstractFactory {

	private Long id;
	private String name;
	private String description;
	private Integer quantity;
	private Double unitPrice;

	public ElectronicFactory(Long id, String name, String description, Integer quantity, Double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Override
	public Product createProduct() {
		return new Electronic(id, name, description, quantity, unitPrice);
	}

}
