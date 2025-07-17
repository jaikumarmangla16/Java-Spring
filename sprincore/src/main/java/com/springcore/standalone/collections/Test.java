package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standconfig.xml");
		Person per=context.getBean("p1",Person.class);
		System.out.println(per.getFriends());
		System.out.println(per.getFriends().getClass().getName());
		System.out.println(per.getFeestruct());
		System.out.println(per.getFeestruct().getClass().getName());
	}
	
}
