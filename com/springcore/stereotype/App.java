package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student student = (Student)con.getBean("student");
		//System.out.println(student);
		//System.out.println(student.getAddress());
		System.out.println(student.hashCode());
		
		Student student2 = (Student)con.getBean("student");
		System.out.println(student2.hashCode());
		
		
		
	}

}
