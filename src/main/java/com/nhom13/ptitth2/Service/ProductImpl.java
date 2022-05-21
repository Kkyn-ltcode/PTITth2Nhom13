package com.nhom8.ptitthchanh2.service;

import java.util.Optional;

import com.nhom8.ptitthchanh2.model.Product;
import com.nhom8.ptitthchanh2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements IProduct{

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public Product findProductById(Long id) {
		Product productEntity =new Product();
		
		Optional<Product> p = productRepo.findById(id);
		productEntity = p.get();
		return productEntity;
	}

	@Override
	public boolean deleteProductById(Long id) {
		productRepo.deleteById(id);
		return true;
	}
	
}
