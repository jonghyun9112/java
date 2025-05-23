package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.HashMap;

class Item {
	String name; 
	Integer pid;
	
	Item(String name, Integer pid) {
		super();
		this.name = name;
		this.pid = pid;
	}

	@Override
	public String toString() {
		return name + pid;
	} 
	
}

class ItemA extends Item { 
	String size;

	ItemA(String name, Integer pid, String size) {
		super(name, pid);
		this.size = size;
	} 
	
	
}

class ItemB extends Item { 
	String color;

	ItemB(String name, Integer pid, String color) {
		super(name, pid);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + color;
	} 
	
	
}

public class Test11 { 
	public static void main(String[] args) {
		
		ArrayList<Item> list = new ArrayList<>();
		list.add(new ItemA ("aa", 100, "XXL"));
		list.add(new ItemB ("BB", 150, "red"));
		
		for(Item item : list) { 
			System.out.println(item);
		}
		
		System.out.println();
		
		HashMap<String, Item> map = new HashMap<String, Item>();
		map.put("ItemA",  new ItemA("Name", 100, "XXL"));
		map.put("ItemB",  new ItemB("Name", 10, "XL"));
		
		System.out.println(map.get("ItemB"));
		
	}

}
