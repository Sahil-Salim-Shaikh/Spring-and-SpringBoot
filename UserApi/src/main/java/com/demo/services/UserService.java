package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.entities.User;
import com.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}
	
	public Optional<User> getuserById(int id)
	{
	  return userRepository.findById(id);
	  
	}
	
	
	public List<User> getAllUser()
	{
		return userRepository.findAll();
	}
	
	public void deletebyId(int id)
	{
		userRepository.deleteById(id);;
	}
	
	
	public Optional<User> getUserByEmail(String email)
	{
		return Optional.ofNullable(userRepository.findByEmail(email));
	}

}
