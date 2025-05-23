package com.ruby.java.ch04;

import java.util.Random;

public class 실습_4_5_행렬연산 {

	public static void main(String[] args) {
		
		//배열 생성 3* 5 
		Random rd = new Random();
		int[][] A = new int[3][5];
		int[][] B = new int[3][5];
		int[][] C = new int[3][5];
		int[][] D = new int[5][4];
		int[][] E = new int[3][4];
		int[][] F = new int[4][3];
	
		
		//표 A 점수 채우기 
		System.out.println("표A:");
		for(int i = 0; i < A.length ; i++) {
			for(int j = 0; j < A[i].length ; j++) {
			A[i][j] = rd.nextInt(100);
			System.out.print(" " + A[i][j]);
			}
			System.out.println("\n"); }
		
		
		//표 B 점수 채우기 
		System.out.println("표B:");
		for(int i = 0; i < B.length ; i++) {
			for(int j = 0; j < B[i].length ; j++) {
			B[i][j] = rd.nextInt(100);
			System.out.print(" " + B[i][j]); 
			}
			System.out.println("\n");
		}
		// 표 C = A + B 
		System.out.println("표C:");
		for(int i = 0; i < C.length ; i++) {
			for(int j = 0 ; j < C[i].length ; j++) {
			C[i][j] = A[i][j] + B[i][j]; 
			System.out.print(" " + C[i][j]); 
			}
			System.out.println("\n"); }
		
	
		// 표 D 생성 
		System.out.println("표D:");
		for(int i = 0; i < D.length; i++) {
			for(int j = 0; j < D[i].length; j++) { 
				D[i][j] = rd.nextInt(100);
				System.out.print(" " + D[i][j]); 
				}
			System.out.println("\n"); }
		
		//표 E 행렬 곱셈 
		System.out.println("표E:" + "\n");
		for(int i = 0 ; i < A.length; i++) {
			for(int j = 0 ; j < D[0].length; j++) { 
				for(int k = 0 ; k < A[0].length; k++) 
				E[i][j] += A[i][k] * D[k][j];
			System.out.print(" " + E[i][j]);
			}
			System.out.println("\n"); }
		
		//전치행렬 
		
		System.out.println("표F:" + "\n");
		
	}
}
