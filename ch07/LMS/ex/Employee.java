package com.ruby.java.ch07.LMS.ex;

public class Employee extends Person {
	
	private String Dept; 
	
	public Employee(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		System.out.println("Employee(name, age, dept) 생성자 실행");
	}


	public void setDept(String dept) {
		Dept = dept;
	}
	
	
	public String toString() { 
		return super.toString() + ":" + Dept ; 
		
	}
	
}
	

