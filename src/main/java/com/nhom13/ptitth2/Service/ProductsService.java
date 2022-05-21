package com.nhom8.ptitthchanh2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nhom8.ptitthchanh2.model.Product;


@Service
public interface ProductsService {
	List<Product> viewProducts();
	Product saveProduct(Product product);
	void updateProduct(Product product);
	Product findById(Long id);
	
}
