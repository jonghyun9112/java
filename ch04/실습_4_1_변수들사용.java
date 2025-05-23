package com.ruby.java.ch04;

/*
 * 배열 사용없이 변수 5개를 사용하여 5명 점수의 평균 구하기
 * int score1,score2,score3, score4, score5;
 */

public class 실습_4_1_변수들사용 {

	public static void main(String[] args) {
		int score1 = 49;
		int score2 = 91;
		int score3 = 87;
		int score4 = 67;
		int score5 = 73;

		int max = score1;
		if (max < score2)
			max = score2;
		if (max < score3)
			max = score3;
		if (max < score4)
			max = score4;
		if (max < score5)
			max = score5;
		System.out.println("최대값:" + max);

		int min = score1;
		if (min > score2)
			min = score2;
		if (min > score3)
			min = score3;
		if (min > score4)
			min = score4;
		if (min > score5)
			min = score5;
		System.out.println("최소값:" + min);

		int average = (score1 + score2 + score3 + score4 + score5) / 5;
		System.out.println("평균값:" + average);
		
		System.out.println("평균:" + avg(score1, score2, score3, score4, score5));
		System.out.println("최대:" + max(score1, score2, score3, score4, score5));
		System.out.println("최소:" + min(score1, score2, score3, score4, score5));

	}
	static int max(int...v) { 
		int result = 0;
		for(int x : v) {
	}
	

}
