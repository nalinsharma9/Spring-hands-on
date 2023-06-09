package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone_config.xml");
		
		Person person1 = (Person)con.getBean("person1");
		Person person2 = (Person)con.getBean("person2");
		System.out.println(person1);
		System.out.println(person2);
		
		
	}

}
