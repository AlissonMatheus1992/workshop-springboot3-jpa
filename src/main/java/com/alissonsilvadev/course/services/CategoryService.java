package com.alissonsilvadev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonsilvadev.course.entities.Category;
import com.alissonsilvadev.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		System.out.println("Passei aqui 03");
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		System.out.println("Passei aqui 04");
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
