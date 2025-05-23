package com.ruby.java.ch07.abstraction;

public class IPhoneMessenger extends GraphicIOS implements Messenger, WorkFile {

	@Override
	public String getMessage() {
		return "xe";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메시지를 설정합니다:" + msg);

	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("file을 다운로드합니다");
		
	}

	@Override
	public void filedownload() {
		System.out.println("file을 업로드합니다.");
		
	}

}
