package com.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfig {
	
	@Bean
	@Qualifier("s_roll")
	public int roll() {
		return 18;
	}
	
	@Bean
	@Qualifier("s_name")
	public String name() {
		return "Shankar";
	}
	
	@Bean
	public Student s1(@Qualifier("s_roll") int roll_num, @Qualifier("s_name") String stu_name) {
		return new Student(roll_num,stu_name,22);
	}
}
