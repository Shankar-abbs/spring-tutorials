package com.exam;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Sample {
	public Sample() {
		System.out.println("Bean Created");
	}
	@PostConstruct
	public void flag() {
		System.out.println("Hii Init called");
	}
	@PreDestroy
	public void closeContainer() {
		System.out.println("Bye i am going");
	}
}
