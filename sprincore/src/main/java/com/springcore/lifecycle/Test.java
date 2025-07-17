package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/samconfig.xml");
//			Samosa s= (Samosa) context.getBean("p1");
//			System.out.print(s);
//		
		context.registerShutdownHook();
//		
//		System.out.println("+=+++++++++++++++++++++++");
////		AbstractApplicationContext context1 =new ClassPathXmlApplicationContext("com/springcore/lifecycle/samconfig.xml");
//		Pepsi p=(Pepsi)context.getBean("s1");
//		System.out.println(p);
		
		
		Example exam=(Example) context.getBean("e1");
		System.out.println(exam);
	}
}	
