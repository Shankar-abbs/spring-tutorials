package com.spring.tuto;

public class Train {

	private String name;
	private int milage;
	private int capacity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Train [name=" + name + ", milage=" + milage + ", capacity=" + capacity + "]";
	}
	
}
