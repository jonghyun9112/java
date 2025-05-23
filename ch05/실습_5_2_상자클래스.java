package com.ruby.java.ch05;

public class 실습_5_2_상자클래스 {
	public static void main(String[] args) {
        // 박스 객체 생성
        Box box1 = new Box (10, 5, 3);
   

        // 박스 정보 출력
        box1.show();
        System.out.println(box1.getVolume());
        // 박스 크기 변경
        box1.resize(15, 8, 5);
        box1.show();
        System.out.println(box1.getPerimeter());
        // 박스를 2배 확대
        box1.resize(0.5);
        box1.show();
        
        Box box2 = new Box(4, 7, 3);
        System.out.println(box2);
        box2.show();
     // 박스 크기 변경
        box2.resize(9, 3, 8);
        System.out.println(box2);
         
        box2.show();

        // 박스를 2배 확대
        box2.resize(1.5);
        System.out.println(box2);
        box2.show();        
        
	}
	

}
