package com.alissonsilvadev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonsilvadev.course.entities.Product;
import com.alissonsilvadev.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		System.out.println("Passei aqui 03");
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		System.out.println("Passei aqui 04");
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
