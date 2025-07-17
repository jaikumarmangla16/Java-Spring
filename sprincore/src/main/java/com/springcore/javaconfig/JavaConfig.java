package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean
	public Student getStudent() {
		Student s=new Student(getSamosa());
		return s;
	}
}
