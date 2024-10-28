package com.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	@Override
	
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	
	@Override
	public List<Student> getallStudentsList() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student findStudentbyid(int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional= studentRepository.findById(id);
		
		return optional.get();
	}


	@Override
	public void updateStudent(int id, Float marks) {
		// TODO Auto-generated method stub
		
		Student s=findStudentbyid(id);
		s.setMarks(marks);
		
		studentRepository.save(s);
		
	}


	@Override
	public void deletestudentById(int id) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(id);
		
	}
	

}
