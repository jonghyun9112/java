package com.ruby.java.ch07.abstraction;

public class MessengerTest {
	
	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기" + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기" + Messenger.MAX_SIZE);
		
	iphone.setLooin(false);
	iphone.getMessage();
	iphone.setMessage("hello");
	iphone.clearMessage();
	iphone.draw_textBox();
	iphone.draw_submitButton();
	
	galaxy.setLooin(true);
	galaxy.getMessage();
	galaxy.setMessage("hi");
	galaxy.changeKeyboard();
	galaxy.filedownload();
	galaxy.fileUpload();
	}

}
