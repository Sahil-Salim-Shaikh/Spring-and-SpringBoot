package com.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.User;
import com.demo.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user)
	{
	return	userService.createUser(user);
		
	}
	
	//get list of users
	@GetMapping("/users")
	public List<User> getAllUserDetails()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getuserbyid(@PathVariable int id)
	{
		User user =userService.getUserById(id).orElse(null);
		
		if (user!=null) {
			return	ResponseEntity.ok().body(user);
			
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User updateduser)
	{
		Optional< User> user=userService.getUserById(id);
		if(user.isPresent())
		{
			updateduser.setId(id);
			return ResponseEntity.ok(userService.createUser(updateduser));
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	
	
}
