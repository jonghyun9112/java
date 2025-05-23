package com.ruby.java.ch05;

public class Box2 {
	double width;
	double height;
	double depth;
	
	//부피계산 메소드
	double getVolume() {
	        return width * height * depth;
	    }

		// 둘레 길이 계산 메소드
	    void getPerimeter() {
	        
	    }
	    
	    // 박스 크기 조정 (메소드 오버로딩)
	    void resize(double newWidth, double newHeight, double newDepth) {
	        //박스의 가로,세로,높이를 변경
	    }

	    void resize(double scale) {
	        //박스의 가로,세로,높이를 scale 비율로 변경
	    }
	    
	    void show() {
	    	System.out.println("width="+width+ ", height = " + height + ", depth = " + depth);
	    }
	    
	    @Override
	    String toString() {
	       return "width="+width+ ", height = " + height + ", depth = " + depth;
	    }
	 
}