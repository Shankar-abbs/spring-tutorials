package com.spring.tuto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	@SuppressWarnings({ "unused", "resource"})
	public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/tuto/Sample1.xml");
//        Transport transport = context.getBean(Transport.class);
//        System.out.println(transport);
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/codinghub/config.xml");
    	  
    	
    }
}
