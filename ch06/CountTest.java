package com.ruby.java.ch06;

class Count {
	public static int totalCount;
	int count;
}

public class CountTest {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;
		Count.totalCount++;
		Count.totalCount++;
		Count.totalCount++;
		c2.count++;
		c3.count++;
		Count.totalCount+=20;
		Count.totalCount++;
		Count.totalCount++;
		Count.totalCount++;
		Count.totalCount++;

		
		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);
	}
}
