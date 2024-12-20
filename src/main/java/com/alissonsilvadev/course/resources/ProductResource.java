package com.alissonsilvadev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alissonsilvadev.course.entities.Product;
import com.alissonsilvadev.course.services.ProductService;

@RestController
@RequestMapping(value ="/products")
public class ProductResource {

	@Autowired 
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		System.out.println("Passei aqui 02");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		System.out.println("Passei aqui 01");
		return ResponseEntity.ok().body(obj);
	}
}