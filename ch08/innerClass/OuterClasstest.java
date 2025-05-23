package com.ruby.java.ch08.innerClass;

import com.ruby.java.ch07.abstraction.Messenger;

public class OuterClasstest {
	
	public static void main(String[] args) {
		
		
		Messenger test = new Messenger() {
			
			public String getMessage() {
				return "test" ; 
			}
			
			public void setMessage (String msg) { 
				System.out.println("test에 메시지를 설정합니다.:" + msg);
			}
		};
		System.out.println(test.getMessage());
		test.setMessage("have a nive day");
	}

}
