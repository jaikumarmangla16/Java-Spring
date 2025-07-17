package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
		Student s=context.getBean("ob",Student.class);
		System.out.println(s);
		System.out.println(s.getAddress());
//		System.out.println(s.getAddress().getClass().getName());
		
		
//		System.out.println(s.hashCode());
//		Student s1=context.getBean("ob",Student.class);
//		System.out.println(s1.hashCode());
		Teacher t=context.getBean("t1",Teacher.class);
		Teacher te=context.getBean("t1",Teacher.class);
		System.out.println(t.hashCode());
		System.out.println(te.hashCode());
	}
}

