package com.ruby.java.ch04;

import java.util.Random;

public class 실습_4_3_배열_점수평균3 {
	public static void main(String[] args) {
		// 랜덤으로 10개 데이터를 저장하는 배열 선언
		int []score = new int[10];

		// 랜덤으로 데이터를 입력하기 위한 객체 생성
		Random rd = new Random();

		// 배열에 랜덤으로 데이터 입력 (i : 0 ~ 9)
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = rd.nextInt(101);	// 0 ~ 100까지
		}

		// 최대값, 최소값 구하기
		int min, max, sum;
		min = max = sum = score[0];
		for(int i = 1 ; i < score.length ; i++) {
			// max보다 score[i]가 크면
			if (max < score[i])
				max = score[i];
			// min보다 score[i]가 작으면
			if (min > score[i])
				min = score[i];
			// 평균계산을 위해 점수 누적
			sum += score[i];
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println("평균값:" + (sum/score.length));
		
//		for(int i=0 ; i < score.length; i++) {
//		score[i] = rd.nextInt(100);
//		System.out.print(score[i] + " , ");
//		
//		int max = 0 ; 
//		int min = 100 ; 
//		int avg = 0; 
//		
//		if(score[i] < 101) System.out.println("최대값" + "=" + max);
//		if(score[i] >0) System.out.println("최소값" + "=" + max);
//		}
	}
}
