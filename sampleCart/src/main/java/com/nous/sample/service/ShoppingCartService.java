package com.nous.sample.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nous.sample.dao.ProductRepository;
import com.nous.sample.dao.ShoppingCartRepository;
import com.nous.sample.dao.UserRepository;
import com.nous.sample.dto.ShoppingCartDTO;
import com.nous.sample.model.Product;
import com.nous.sample.model.ShoppingCart;


@Service
@Transactional
public class ShoppingCartService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	public ShoppingCart saveProducts(ShoppingCartDTO shoppingCartDTO) {
		ShoppingCart shoppingCart = new ShoppingCart();
		Product product = productRepository.getOne(shoppingCartDTO.getProductId().longValue());
		shoppingCart.setProduct(product);
		shoppingCart.setUser(userRepository.findById(1L).get());
		shoppingCart.setStatus(shoppingCartDTO.getStatus());
		shoppingCart.setDate(new Date());
		shoppingCart.setStock(shoppingCartDTO.getStock());
		shoppingCart.setAmount(product.getUnitPrice() * shoppingCartDTO.getStock());

		return shoppingCartRepository.save(shoppingCart);
	}

	public List<ShoppingCart> findAll() {
//        return shoppingCartRepository.findAll();
		return shoppingCartRepository.findByStatus("NOT_PURCHASED");
	}

	public ShoppingCart updateProduct(ShoppingCartDTO shoppingCartDTO, Long id) {
		ShoppingCart updateItem = shoppingCartRepository.getOne(id);
		updateItem.setStock(shoppingCartDTO.getStock());
		updateItem.setAmount(updateItem.getProduct().getUnitPrice() * shoppingCartDTO.getStock());
		return shoppingCartRepository.save(updateItem);
	}

	public void deleteProduct(Long id) {
		shoppingCartRepository.deleteById(id);
	}

	public void clearShoppingCart(Object object) {
		shoppingCartRepository.deleteAll(findAll());
	}

	public List<ShoppingCart> findByPurchased() {
		return shoppingCartRepository.findByStatus("PURCHASED");
	}

	public void purchaseProducts(Long id) {
		ShoppingCart shoppingCart = shoppingCartRepository.getOne(id);
		shoppingCart.setStatus("PURCHASED");
		shoppingCartRepository.save(shoppingCart);
	}
}
