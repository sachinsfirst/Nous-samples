package com.nous.sample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.sample.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	List<ShoppingCart> findByStatus(String status);
}
