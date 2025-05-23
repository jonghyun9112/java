package com.ruby.java.ch06;

public class 실습_5_1_클래스자동차정의2 {

	public static void main(String[] args) {
		
	// 자동차 객체 생성 
		
		Car2 car1 = new Car2("Hyundai", "Sonata", 1400, 4600, 1800, 95);
		Car2 car2 = new Car2("BMW", "M3", 1200, 4500, 1700, 80);
		Car2 car3 = new Car2("kIA", "K5", 1200, 4500, 1700, 70);
		Car2 car4 = new Car2("KIA", "K8", 1200, 6000, 1700, 150);
		
	// 자동차 유형 	
		System.out.println("\n");
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		
    // 자동차 세그먼트 분류 
		System.out.println("\n");
		System.out.println(car1.getSegment());
		System.out.println(car2.getSegment());
		System.out.println(car3.getSegment());
		System.out.println(car4.getSegment());
		
	//과속 기준 설정 
		
		int city = 70;
		int hightway = 110;
				
		
		
	 //도심주행 과속 여부 
		System.out.println("\n");
		System.out.println("도심주행 과속 여부");
		car1.checkSpeeding(city);
		car2.checkSpeeding(city);
		car3.checkSpeeding(city);
		car4.checkSpeeding(city);
		
	// 고속도로 과속 여부 
		System.out.println("\n");
		System.out.println("고속도로 주행 과속 여부");
		car1.checkSpeeding(hightway);
		car2.checkSpeeding(hightway);
		car3.checkSpeeding(hightway);
		car4.checkSpeeding(hightway);

		
		

		
	}

	}

