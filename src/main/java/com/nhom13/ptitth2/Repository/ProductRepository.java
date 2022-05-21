package com.nhom8.ptitthchanh2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nhom8.ptitthchanh2.Entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, String>  {
	
}
