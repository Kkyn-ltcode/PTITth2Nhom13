package com.N13.ptitTh2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.N13.ptitTh2.Repository.ProductRepository;
import com.N13.ptitTh2.Service.ProductsService;
import com.N13.ptitTh2.model.Product;

@Service
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> viewProducts() {

		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

}
