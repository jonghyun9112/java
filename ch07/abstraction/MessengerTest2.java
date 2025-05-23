package com.ruby.java.ch07.abstraction;

public class MessengerTest2 {
	
	
	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger()	;
		GalaxyMessenger gx = new GalaxyMessenger()	;
		
		System.out.println("메신저 최소문자 크기" + Messenger.MIN_SIZE );
		System.out.println("메신저 최소문자 크기" + Messenger.MAX_SIZE );
		
		iphone.clearMessage();
		iphone.draw_submitButton();
		iphone.draw_textBox();
		iphone.filedownload();
		iphone.filedownload();
		
		gx.setMessage("hi");
		gx.changeKeyboard();
		gx.filedownload();
		gx.fileUpload();
		
	
	}
	
	
	
}
	
