package com.ruby.java.ch07.LMS;

public class Employee extends Person {

	private String dept;
	
	public Employee() {
		super();
		System.out.println("Employee 생성자 실행");
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return this.getName()	 + ":" + this.getAge() + ":" + dept; 

	}
	
	
}
