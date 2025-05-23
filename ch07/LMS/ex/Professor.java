package com.ruby.java.ch07.LMS.ex;

public class Professor extends Person {
	
	private String Sub; 
	
	public Professor(String name, int age, String sub) {
		super(name, age);
		this.setSub(sub);
		System.out.println("professor(name, age, sub) 생성자 실행");
	}

	public void setSub(String sub) {
		this.Sub = sub;
	}
	
	public String toString() { 
		return super.toString() + ":" + Sub; 
	}
	
}