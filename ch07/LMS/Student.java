package com.ruby.java.ch07.LMS;

public class Student extends Person 	{
	
	private String major;
	
	public Student() {
		super();
		System.out.println("Student 생성자 실행");
	}
	

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}



	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() { 
		return super.toString() + ":" + major;
	}

}
