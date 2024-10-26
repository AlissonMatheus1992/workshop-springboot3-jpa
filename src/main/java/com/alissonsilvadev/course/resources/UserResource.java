package com.alissonsilvadev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
		return ResponseEntity.ok().body(list);
	}
}