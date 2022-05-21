package com.nhom8.ptitthchanh2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom8.ptitthchanh2.model.Product;
import com.nhom8.ptitthchanh2.repository.ProductRepository;
import com.nhom8.ptitthchanh2.Service.ProductsService;


@Service
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> viewProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.saveAndFlush(product);
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	

}
