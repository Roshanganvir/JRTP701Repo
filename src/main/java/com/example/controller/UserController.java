package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/user")
	public ResponseEntity<User> crete(@RequestBody User user) {

		return service.create(user);

	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> allUser() {

		return service.getAllUsers();
	}

//	@GetMapping("/login")
//	public ResponseEntity<String> login(String email, String password) {
//		return service.login(email, password);
//
//	}

}
