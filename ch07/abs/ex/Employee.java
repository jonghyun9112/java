package com.ruby.java.ch07.abs.ex;

abstract class Employee {

	String name;
	int salary;

	public void calcSalary() {

	}

	class Salesman extends Employee {
		public void calcSalary() {
			System.out.println("셀러리맨 급여 = 기본급 + 판매수당");

		}
	}

	class Consultant extends Employee {
		public void calcSalary() {
			System.out.println("컨설턴트 급여 = 기본급 + 컨설팅 특별수당");
		}
	}

	class Manger extends Employee {
		public void clacSalary() {
			System.out.println("매니저 급여 = 기본급 + 성과수당");
		}
	}

	class Director extends Employee {
	}
	
	public class HRSTest{
		public static void main(String[] args) {
			Salesman s = new Salesman();
			Consultant c = new Consultant();
			Manger m = new Manger();
					
		}
	}

}
