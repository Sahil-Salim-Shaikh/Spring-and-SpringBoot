package com.demo;

import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.Flow.Publisher;

public interface StudentService {

	public Student addStudent(Student student);
	public List<Student> getallStudentsList();
	public Student findStudentbyid(int id);
	public void updateStudent(int id,Float marks);
	public void deletestudentById(int id);
	
}
