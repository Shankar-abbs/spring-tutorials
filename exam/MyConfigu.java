package com.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfigu {
	
	@Bean
	public Hospital h1() {
		Doctor d1 = new Doctor(101,"Shankar","Surgeon",180000);
		Patient p1 = new Patient(001,"UnKnown","male","Bruses",1234);
		return new Hospital("Issmart Hospitals","Ongole",10,d1,p1);
	}
	
}
