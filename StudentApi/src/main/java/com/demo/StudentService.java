package com.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student>  getStudent()
	{
		return studentRepository.findAll();
	}
	
	public Student getstudentbyId(int id)
	{
	Optional<Student> optional=	studentRepository.findById(id);
	
	
		if(optional.isPresent())
		{
			return optional.get();
		
		}
		else {
				throw new RuntimeException("student not found");
		}
		
	}

}
