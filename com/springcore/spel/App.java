package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		
		Demo demo1 = (Demo)con.getBean("demo");
		
		System.out.println(demo1);
		
		

	}

}
