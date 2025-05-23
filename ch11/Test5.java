package com.ruby.java.ch11;

/*
 * 자료구조에서 사용할 예외처리 > stack과 queue에서 사용 
 */
class NagativeNumberException extends Exception {
	public NagativeNumberException() {
		super("음수는 허용하지 않습니다");//예외 발생시에 출력되는 위치를 확인 필요 
	}
}

public class Test5 {

	int battery = 0;

	void charge(int time) {

		if (time < 0) {
			time = 0;
			try {
				throw new NagativeNumberException();
			} catch (NagativeNumberException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);

	}

	public static void main(String[] args) {

		Test5 test5 = new Test5();
		test5.charge(30);
		test5.charge(20);
		test5.charge(-10);
	}
}
