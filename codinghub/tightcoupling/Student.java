package com.codinghub.tightcoupling;

public class Student {
	int roll;
	String name;
	String dept;
	String colleges;
	double marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getColleges() {
		return colleges;
	}
	public void setColleges(String colleges) {
		this.colleges = colleges;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept + ", colleges=" + colleges + ", marks="
				+ marks + "]";
	}
	
}
