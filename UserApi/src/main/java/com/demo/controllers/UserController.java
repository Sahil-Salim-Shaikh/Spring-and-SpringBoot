package com.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.User;
import com.demo.services.UserService;

@RestController

public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id)
	{
		     Optional<User>userOptional= userService.getuserById(id);
		     
		     if (userOptional.isPresent()) {
		    	 		return ResponseEntity.ok(userOptional.get());
			} else {
					return ResponseEntity.notFound().build();
			}
	}
	
	
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User updateduser)
	{
		  Optional<User>userOptional= userService.getuserById(id);
		  
		  if (userOptional.isPresent()) {
			  updateduser.setId(id);
			  return ResponseEntity.ok(userService.saveUser(updateduser));
			
		} else {
				return ResponseEntity.notFound().build();
		}
	}
	
	
	@DeleteMapping("/{id}")
	public void deletebyId(@PathVariable int id)
	{
		 Optional<User> useropOptional= userService.getuserById(id);
		 if (useropOptional.isPresent()) {
			 userService.deletebyId(id);
			ResponseEntity.noContent().build();
		}else {
			ResponseEntity.notFound().build();
		}
	}
	
	
	@GetMapping("/email/{email}")
	public  ResponseEntity<User> getUserbyEmail(@PathVariable String email)
	{
		Optional<User> userOptional=userService.getUserByEmail(email);
		if (userOptional.isPresent()) {
		return	ResponseEntity.ok(userOptional.get());
		}
		else {
		return	ResponseEntity.notFound().build();
		}
	}
	
	
}
