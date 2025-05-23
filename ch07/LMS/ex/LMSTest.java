package com.ruby.java.ch07.LMS.ex;

public class LMSTest {

	public static void main(String[] args) {

		Employee e = new Employee("오정임", 28, "영업팀");
		Professor p = new Professor("신정호", 55, "빅데이터");
		Student s = new Student("이호철", 22, "인공지능");

		e.setName("오정임");
		e.setAge(28);
		e.setDept("영업팀");

		p.setName("신정호");
		p.setAge(55);
		p.setSub("빅데이터");

		s.setName("이호철");
		s.setAge(22);
		s.setMajor("인공지능");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());

	}

}
