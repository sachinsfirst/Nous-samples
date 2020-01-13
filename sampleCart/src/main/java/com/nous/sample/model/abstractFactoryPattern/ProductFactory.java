package com.nous.sample.model.abstractFactoryPattern;

public class ProductFactory {

	public static Product getProduct(ProductAbstractFactory productAbstractFactory) {
		return productAbstractFactory.createProduct();

	}

}
