package com.nous.sample.model.abstractFactoryPattern;

public abstract class Product {

	public abstract Long getId();

	public abstract String getName();

	public abstract String getDescription();

	public abstract Integer getQuantity();

	public abstract Double getUnitPrice();

	@Override
	public String toString() {
		return "Product [Id=" + getId() + ", Name=" + getName() + ", Description=" + getDescription()
				+ ", Quantity=" + getQuantity() + ", UnitPrice=" + getUnitPrice() + ", Class="
				+ getClass() + ", hashCode=" + hashCode() + ", toString=" + super.toString() + "]";
	}

}
