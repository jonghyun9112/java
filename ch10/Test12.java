package com.ruby.java.ch10;

class User {
	String ssn;
	String name;

	User(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return ssn + ":" + name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(ssn);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		User u = (User) obj;
		if (this.ssn.equals(u.ssn))
			result = true;
		return result;
	}

	public class Test12 {
		
		public static void main(String[] args) {
			
		}

	}

}
