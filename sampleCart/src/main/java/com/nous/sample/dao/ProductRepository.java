package com.nous.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.sample.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
