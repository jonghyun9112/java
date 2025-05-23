package com.ruby.java.ch06;

public class Car2 {
	// 필드 (속성)
	String made;  //제조사
	String model;  //모델
	int weight;   //중량
	int length; //전장
	int width; //전폭
	int speed; //속도 
	
	
	public Car2(String made, String model, int weight, int length, int width, int speed) {
		super();
		this.made = made;
		this.model = model;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.speed = speed;
	}
	
		
//    C-세그먼트 (준중형, 소형 패밀리카) > 4,200mm ~ 4,600mm > 약 1,750mm > 현대 아반떼, 기아 K3, 폭스바겐 골프, 도요타 코롤라
//    D-세그먼트 (중형차, 패밀리 세단) > 4,600mm ~ 4,900mm > 약 1,800mm ~ 1,850mm > 현대 쏘나타, 기아 K5, BMW 3시리즈, 벤츠 C클래스
//    E-세그먼트 (대형차, 고급 세단) > 4,900mm ~ 5,100mm > 약 1,850mm ~ 1,900mm > 현대 그랜저, 기아 K8, BMW 5시리즈, 벤츠 E클래스
//    F-세그먼트 (초대형차, 플래그십 세단) > 5,100mm 이상 > 1,900mm 이상 > 제네시스 G90, 벤츠 S클래스, BMW 7시리즈, 아우디 A8
//    
	// 전장 기준으로 차급 세그먼트 분류
	
	String getSegment() { 
		if(length < 4200) {
			return "B세그먼트 소형차";
		} else if (length < 4600) {
			return "C세그먼트 준중형차";
		} else if (length < 4900) {
			return "D세그먼트 중형차";
		} else if (length < 5100) {
			return "E세그먼트 대형차";
		} else {
			return "F세그먼트 초대형차";
		}
	}
	

	//과속여부 판단 메소드 
	
	void checkSpeeding(int speedLimit) {
		if(speed > speedLimit) {
			System.out.println("과속 경고"); }
		else { 
			System.out.println("정상주행");
		}
	}
	

	// toString() 메소드 재정의
	
	public String toString() { 
		return "제조사=" + made +" " + "모델=" + model + " " + "중량=" + weight + " " + "전장=" + length + " " + "전폭=" + width + " " + "속도=" + speed ; 
	}
	
}
