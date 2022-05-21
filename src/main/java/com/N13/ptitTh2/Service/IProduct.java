package com.N13.ptitTh2.Service;

import com.N13.ptitTh2.model.Product;

public interface IProduct {
	public Product findProductById(Long id);

	public boolean deleteProductById(Long id);
}
