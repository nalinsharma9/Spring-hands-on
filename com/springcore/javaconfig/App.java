package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s1 = (Student)con.getBean("getStudent");
		
		System.out.println(s1);
		s1.study();
		

	}

}
