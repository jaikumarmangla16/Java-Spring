package com.springcore.springexpressionlang;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springexpressionlang/config.xml");
	Demo d=context.getBean("demo",Demo.class);
	System.out.println(d);
	
	SpelExpressionParser t=new SpelExpressionParser();
//	org.springframework.expression.Expression p = t.parseExpression("2+3");
//	System.out.println(p.getValue());
	}
}
