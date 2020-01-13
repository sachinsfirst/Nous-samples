package com.nous.sample;

import com.nous.sample.model.abstractFactoryPattern.ElectronicFactory;
import com.nous.sample.model.abstractFactoryPattern.Product;
import com.nous.sample.model.abstractFactoryPattern.ProductFactory;

public class TestDesignPatterns {
	
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Product electronic = ProductFactory.getProduct(new ElectronicFactory(23837472L, "Gyser", "Electronic", 2, 3000.00));
		Product fashion = ProductFactory.getProduct(new ElectronicFactory(23837473L, "Mens T-Shirt", "Fashion", 3, 1500.00));
		System.out.println("AbstractFactory Electronic Config::"+electronic);
		System.out.println("AbstractFactory Fashion Config::"+fashion);
	}

}
