package com.N13.ptitTh2.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.N13.ptitTh2.Repository.ProductRepository;
import com.N13.ptitTh2.model.Product;

@Service
public class ProductImpl implements IProduct {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product findProductById(Long id) {
		Product productEntity = new Product();

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
