package com.ruby.java.ch07.LMS.ex;

public class Student extends Person {
	
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.setMajor(major);
		System.out.println("Student(name, age, major) 생성자 실행");
	}


	public void setMajor(String major) {
		this.major = major;
	}
	
	
	public String toString() {
		return super.toString() + ":" + major;
	}
	}







