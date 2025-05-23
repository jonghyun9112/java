package com.ruby.java.ch06;

public class 실습_5_1_클래스자동차정의 {

	public static void main(String[] args) {
		// 자동차 객체 생성
		Car2 car1 = new Car2("Hyundai", "Sonata", 1400, 4600, 1800, 95);
		Car2 car2 = new Car2("BMW", "M3", 1200, 4500, 1700, 110);
	

		// 도로별 제한 속도 설정
		int cityLimit = 50; // 도심 제한 속도
		int highwayLimit = 100; // 고속도로 제한 속도

		// 과속 여부 확인
		System.out.println("도심 주행 테스트:");
		car1.CheckSpeeding(cityLimit); // 도심에서 주행
		car2.CheckSpeeding(cityLimit);

		
        
        System.out.println("고속도로 주행 테스트:");
        car1.CheckSpeeding(highwayLimit); // 고속도로에서 주행
        car2.CheckSpeeding(highwayLimit);
        
        System.out.println("차량 크기 분류:");
        System.out.println(car1.getSegment());
        System.out.println(car2.getSegment());
        
        System.out.println("차량 객체의 출력:");
        System.out.println(car1);
        System.out.println(car2);
    }
	}

