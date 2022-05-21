package com.N13.ptitTh2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.N13.ptitTh2.model.Product;

@Service
public interface ProductsService {
	List<Product> viewProducts();

	Product saveProduct(Product product);

	void updateProduct(Product product);

	Product findById(Long id);

}
