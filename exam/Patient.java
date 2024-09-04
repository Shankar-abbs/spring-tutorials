package com.exam;

public class Patient {
	int pid;
	String name;
	String gender;
	String problem;
	int mobile;
	public Patient(int pid, String name, String gender, String problem, int mobile) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.problem = problem;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return " id " + pid + ", name=" + name + ", gender=" + gender + ", problem=" + problem + ", mobile="
				+ mobile + "]";
	}
	
}
