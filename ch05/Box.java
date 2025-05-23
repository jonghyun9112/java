package com.ruby.java.ch05;

public class Box {
	double width;
	double height;
	double depth;
	
	
	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	//부피계산 메소드
	double getVolume() {
	        return width * height * depth;
	    }

		// 둘레 길이 계산 메소드
	    double getPerimeter() {
	    	return (width + height) * 2.0;
	    }
	    
	    // 박스 크기 조정 (메소드 오버로딩)
	    void resize(double newWidth, double newHeight, double newDepth) {
	    	width = newWidth;
	    	height = newHeight;
	    	depth = newDepth;
	    	return ; 
	        //박스의 가로,세로,높이를 변경
	    }

	    void resize(double scale) {
	        width = width * scale;
	        height = height * scale;
	        depth = depth * scale;
	        return ;
	    }
	    
	    void show() {
	    	System.out.println("width="+width+ ", height = " + height + ", depth = " + depth);
	    }
	    
	    
	    public String toString() {
	       return "width="+width+ ", height = " + height + ", depth = " + depth;
	    }

	    
	 
}