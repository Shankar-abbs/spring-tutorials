package com.exam;

public class Doctor {
	int id;
	String name;
	String specialization;
	int salary;
	
	public Doctor() {
		
	}

	public Doctor(int id, String name, String specialization, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return name+" specialized in "+specialization+" with id "+id+" ";
	}
	
}
