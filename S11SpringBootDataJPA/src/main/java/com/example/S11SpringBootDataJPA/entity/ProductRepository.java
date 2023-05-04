package com.example.S11SpringBootDataJPA.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S11SpringBootDataJPA.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	List<Product> findByName(String name);
}
