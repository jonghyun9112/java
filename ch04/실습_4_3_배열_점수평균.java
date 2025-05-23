package com.ruby.java.ch04;

import java.util.Random;

public class 실습_4_3_배열_점수평균 {
	public static void main(String[] args) {
		//학생 10명 성적 저장할 배열 선언 
		int score[] = new int[10];
		Random rd = new Random();
		
		//학생 10명 성적 입력 (Random : 0~ 99) 
		for(int i = 0 ; i < score.length; i++) {
			score[i] = rd.nextInt(100);
		}
		
		// 학생 개개인의 성적 출력 (A~F)
		for(int i = 0 ; i <score.length; i++) {
			System.out.print(score[i] + " : ");
			if (score[i] >= 90)
				System.out.println("A");
			else if(score[i] >= 80) 
				System.out.println("B");
			else if(score[i] >= 70) 
				System.out.println("C");
			else if(score[i] >= 60) 
				System.out.println("D");
			else System.out.println("F");
			
			
			
			
		}
	
	}

}
