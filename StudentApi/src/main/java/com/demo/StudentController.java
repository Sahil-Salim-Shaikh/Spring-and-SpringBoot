package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/")
	public List<Student> getAllStudents()
	{
		return studentService.getStudent();
	}
	
	
	@GetMapping("/getstudent/{id}")
	
	public Student getStudentbyId(@PathVariable int id)
	{
		return studentService.getstudentbyId(id);
	}

}
