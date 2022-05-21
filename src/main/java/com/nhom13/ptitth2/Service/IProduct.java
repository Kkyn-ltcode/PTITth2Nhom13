package com.nhom8.ptitthchanh2.service;

import com.nhom8.ptitthchanh2.model.Product;

public interface IProduct {
	public Product findProductById(Long id);
	public boolean deleteProductById(Long id);
}
