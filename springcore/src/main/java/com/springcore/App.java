package com.springcore;

import java.net.Socket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       
       
       Student student=(Student)context.getBean("student");
       
       System.out.println(student);
       
       
        
    }
}


