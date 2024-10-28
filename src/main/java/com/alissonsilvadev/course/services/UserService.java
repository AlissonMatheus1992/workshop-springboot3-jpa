package com.alissonsilvadev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonsilvadev.course.entities.User;
import com.alissonsilvadev.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		System.out.println("Passei aqui 03");
		return repository.findAll();
	}
	
	public User findById(Long id) {
		System.out.println("Passei aqui 04");
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
