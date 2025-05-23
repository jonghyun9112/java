package com.ruby.java.ch04;

import java.util.Random;

public class 실습_4_4_배열생성최대값 {

	public static void main(String[] args) {

		int[] price = new int[10];
		Random rd = new Random();

		for (int i = 0; i < price.length; i++) {
			price[i] = rd.nextInt(101);

		
		}
		
		
		int min, max ,sum;
		min = max = sum = price[0];

		for (int i = 0; i < price.length; i++) {
			if(max < price[i])
				max = price[i];
			if(min > price[i])
				min = price[i];
				sum += price.length;
		}
				System.out.println("최대값:" + max);
				System.out.println("최소값:" + min);
				System.out.println("평균값:" + sum/price.length);
			
		
	}
}
