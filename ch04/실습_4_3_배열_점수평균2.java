package com.ruby.java.ch04;



import java.util.Random;

public class 실습_4_3_배열_점수평균2 {
	public static void main(String[] args) {
		int []score = new int[10];
		Random rd = new Random();
		
		
		for(int i=0 ; i < score.length; i++) {
		score[i] = rd.nextInt(100);
		System.out.print(score[i] + " , ");
		
		int max = 0 ; 
		int min = 100 ; 
		int avg = 0; 
		
		if(score[i] < 101) System.out.println("최대값" + "=" + max);
		if(score[i] >0) System.out.println("최소값" + "=" + max);
				
			
		}
		
	
	}


	
}
