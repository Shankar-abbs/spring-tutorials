package com.spring.tuto;

public class Bus {

	private String name;
	private int milage;
	private int capacity;
	
	public Bus(String name, int milage, int capacity) {
		super();
		this.name = name;
		this.milage = milage;
		this.capacity = capacity;
	}
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Bus [name=" + name + ", milage=" + milage + ", capacity=" + capacity + "]";
	}
	
}
