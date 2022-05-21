package com.N13.ptitTh2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.N13.ptitTh2.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
