package com.codinghub.tightcoupling;

public class Employee {
	int id;
	String name;
	String role;
	double salary;
	public Employee(int id, String name, String role, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
}
