package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
  ApplicationContext context=SpringApplication.run(App.class, args);
  StudentDao studentDao=context.getBean(StudentDao.class);
  
  Student s1=new Student();
  s1.setName("sahil");
  s1.setCity("pune");
  s1.setPercentage(993);
  System.out.println(studentDao.insertStudent(s1));
  
  
  System.out.println(studentDao.deletestudentById(5));
 
	}

}
