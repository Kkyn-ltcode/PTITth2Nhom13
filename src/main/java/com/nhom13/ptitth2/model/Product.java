package com.nhom8.ptitthchanh2.model;

import javax.persistence.*;

import com.fasterxml.jackson.core.sym.Name;

import lombok.Data;
@Data
@Table(name = "products")
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	@Column(name="description", nullable = false)
	private String description;
	@Column(name="price", nullable = false)
	private Long price;
}
