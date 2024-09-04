package com.exam;

public class Hospital {

	String name;
	String location;
	int distance;
	Doctor doctor;
	Patient patient;
	public Hospital(String name, String location, int distance, Doctor doctor, Patient patient) {
		super();
		this.name = name;
		this.location = location;
		this.distance = distance;
		this.doctor = doctor;
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Welcome to " + name + " you are in " + location + " distance of " + distance + " iam doctor " + doctor
				+ " and you are " + patient + "";
	}
	
}
