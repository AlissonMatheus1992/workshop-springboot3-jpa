package com.alissonsilvadev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alissonsilvadev.course.entities.User;
import com.alissonsilvadev.course.services.UserService;

@RestController
@RequestMapping
public class UserResource {

	@Autowired 
	private UserService service;
	
	@GetMapping(value ="/users")
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		System.out.println("Passei aqui 02");
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/users/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		System.out.println("Passei aqui 01");
		return ResponseEntity.ok().body(obj);
	}
}