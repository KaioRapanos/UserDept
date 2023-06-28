package com.firstproject.userdept.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.userdept.entities.User;
import com.firstproject.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value= "/{id}")
	public Optional<User> findById(@PathVariable Long id){
		Optional<User> result = Optional.ofNullable(repository.findById(id).get());
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
}
