package com.ruby.java.ch07.LMS.ex;

public class Person {
	
	private String Name ;
	private int Age ;
	
	public Person() {
		System.out.println("Person 생성자 실행");
	}

	Person(String name, int age) {
		super();
		this.Name = name;
		this.Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}
	
	public String toString() { 
		return Name  + ":" + Age ; 
	} 
	
	}

	
	
	
	