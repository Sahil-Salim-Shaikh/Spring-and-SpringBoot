package com.demo.dao;

import com.demo.model.Student;

public interface StudentDao {
	
	int insertStudent(Student s);
	
	
	int deletestudentById(int id);

}
