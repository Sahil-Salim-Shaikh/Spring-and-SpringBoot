package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		
		 return userRepository.save(user);
	
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}


	@Override
	public Optional<User> getUserById(int id) {
		// TODO Auto-generated method stub
		
	return userRepository.findById(id);
		
	}


	


	

	


	
	


	



	

	


	

}
