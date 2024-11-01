package com.alissonsilvadev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonsilvadev.course.entities.Order;
import com.alissonsilvadev.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		System.out.println("Passei aqui 03");
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		System.out.println("Passei aqui 04");
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
