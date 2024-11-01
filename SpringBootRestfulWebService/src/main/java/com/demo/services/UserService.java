package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entities.User;


public interface UserService {
	

	public User createUser(User user);

	public List<User> getAllUsers();
	
	public Optional<User> getUserById(int id);

	


}
