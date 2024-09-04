package com.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/MyConfig.xml");
//		Hospital h1 = context.getBean(Hospital.class);
//		System.out.println(h1);
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigu.class);
//		Hospital h1 = context.getBean(Hospital.class);
//		System.out.println(h1);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/exam/MyConfig.xml");
//		Sample sample = context.getBean(Sample.class);
		context.close();
//		context.registerShutdownHook();
		
		
	}
}
