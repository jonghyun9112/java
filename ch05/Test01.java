package com.ruby.java.ch05;

public class Test01 {
	public static void main(String[] args) {
		addNumber(1, 2);
		addNumber(1, 2, 3);
		addNumber(1, 2, 3, 4);
		addNumber(1, 2, 3, 4, 5);

	}

	private static int addNumber(int...v) {
		System.out.println(v.length + " : ");
		int sum = 0;
		for (int x :v) {
			sum += x;
			System.out.print(x + " ");
			
		}
		
		System.out.print(" ==> ");
		return sum;
		

		
	}

}
