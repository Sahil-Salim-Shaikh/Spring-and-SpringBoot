package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        // Start the Spring Boot application and create the application context
        ApplicationContext context = SpringApplication.run(App.class, args);
        
        // Get the StudentService bean from the application context
        StudentService studentService = context.getBean(StudentServiceImpl.class);
        
        // Uncomment to insert a new student
        // Create a new Student object and set its properties
        // Student student = new Student();
        // student.setName("sahil");
        // student.setRollno(80);
        // student.setMarks(90.5f);
        // studentService.addStudent(student); // Call the service to add the student
        
        // Fetch all students and print their details
        // List<Student> studentsList = studentService.getallStudentsList();
        // for (Student s : studentsList) {
        //     System.out.println("Id :" + s.getId());
        //     System.out.println("Name : " + s.getName());
        //     System.out.println("Marks : " + s.getMarks());
        //     System.out.println("Roll No : " + s.getRollno());
        //     System.out.println("-------------------------------------------------------------------------------------------------");
        // }
        
        // Find a student by ID (e.g., ID 8) and print their details
        // Student s = studentService.findStudentbyid(8);
        // System.out.println("Id :" + s.getId());
        // System.out.println("Name : " + s.getName());
        // System.out.println("Marks : " + s.getMarks());
        // System.out.println("Roll No : " + s.getRollno());
        // System.out.println("------------------------------------------------------");
        
        // Uncomment to update a student's marks (e.g., update ID 1 to 99)
        // studentService.updateStudent(1, 99f);
        
        // Delete a student by ID (e.g., delete student with ID 2)
        studentService.deletestudentById(8);
    }
}
