package com.ruby.java.ch07.abstraction;

import com.ruby.java.ch08.polymorphism.Consultant;
import com.ruby.java.ch08.polymorphism.Director;
import com.ruby.java.ch08.polymorphism.Employee;
import com.ruby.java.ch08.polymorphism.Manager;
import com.ruby.java.ch08.polymorphism.Salesman;

abstract class Employee{
	
	String name;
	int salary;
	
	public abstract void calcSalary();	
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}
	
	@Override
	public void calcBonus() {
	 System.out.println("Saleman 보너스 = 기본급 * 12 * 4");
		
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨선팅 특별수당");		
	}
	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee { 
	public void calcSalary() { 
		System.out.println("Mangerr 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager {
	@Override
	public void calcBonus() {
	System.out.println("Director 보너스 = 기본급 * 12 * 6");
		
	}
}

public class HRSTest {
	public static void main(String[] args) {
		
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcSalary();
		c.calcSalary();
		d.calcBonus();
		
	}

}
