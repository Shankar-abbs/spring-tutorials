package com.codinghub.tightcoupling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Special {
	int id;
	String name;
	int a[];
	List<Integer> list = new ArrayList<>();
	Student student;
	Employee employee;
	Products products;
	public Special() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Special(int id, String name, int[] a, List<Integer> list, Student student, Employee employee,
			Products products) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
		this.list = list;
		this.student = student;
		this.employee = employee;
		this.products = products;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Special [id=" + id + ", name=" + name + ", a=" + Arrays.toString(a) + ", list=" + list + ", student="
				+ student + ", employee=" + employee + ", products=" + products + "]";
	}
	
	
}
