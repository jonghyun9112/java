package com.ruby.java.ch07.상속;

//Item 클래스
class Item2 {
	private String name;
	private double price;
	private int stockQuantity;

	public Item2(String name, double price, int stockQuantity) {
		super();
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public void reduceStock(int quantity) {
		
		stockQuantity -= quantity;
	
	}

	public void increaseStock(int quantity) {
		
		stockQuantity += quantity;

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	

}

//Electronics 클래스 (Item 클래스를 상속)
class Electronics extends Item2 {
	private int warranty; // 제품 보증 기간		

	public Electronics(String name, double price, int stockQuantity, int warranty) {
		super(name, price, stockQuantity);
		this.warranty = warranty;
	}

	@Override
	public void show() {

	}

	@Override
	public String toString() {
		
	}
}

//Clothing 클래스 (Item 클래스를 상속)
class Clothing extends Item2 {
	private String size;
	private String color;

	@Override
	public void show() {
		
	}

	@Override
	public String toString() {
		
	}
}

//Customer 추상 클래스 정의
abstract class Customer2 {
	private String cname;
	private String city;
	private int age;

	public void show() {
		
	}

	@Override
	public String toString() {
		
	}

	abstract double applyDiscount(double totalAmount);
}

//RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer extends Customer2 {
	static final double REGULARDISCOUNT_RATE = 0.03;

	public RegularCustomer(String name, String city, int age) {

	}

	@Override
	double applyDiscount(double totalAmount) {
		// 일반 고객 할인 적용

	}
}

//PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer extends Customer2 {
	static final double PREMIUMDISCOUNT_RATE = 0.1;


	@Override
	double applyDiscount(double totalAmount) {
		
	}
}

//Order 클래스
class Order2 {
	private Customer2 customer;
	private Item2[] items;
	private int[] quantities;
	private int itemCount;


	public void addItem(Item2 item, int quantity) {

	}

	public double calculateTotal() {

	}

	public double calculateDiscountedTotal() {

	}

	public void printOrderSummary() {
		/*
		 * 할인된 가격의 합계 출력 할인 금액 합계 출력
		 */

	}
}

public class 실습과제_7장_B2_클래스상속 {

	public static void main(String[] args) {
		// 의류 및 전자제품 생성
		Item2 laptop = new Electronics("노트북", 1200.00, 10, 24);
		Electronics phone = new Electronics("휴대폰", 800.00, 30, 12);
		Clothing tshirt = new Clothing("티셔츠", 20.00, 50, "M", "Blue");
		Clothing jacket = new Clothing("자켓", 80.00, 20, "L", "Black");

		// 고객 생성
		PremiumCustomer premiumCustomer = new PremiumCustomer("홍길동", "부산", 30);
		RegularCustomer regularCustomer = new RegularCustomer("계백", "양산", 25);

		// 주문 생성
		Order2 order1 = new Order2(premiumCustomer, 4);
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);

		Order2 order2 = new Order2(regularCustomer, 4);
		order2.addItem(phone, 1);
		order2.addItem(jacket, 1);

		// 주문 요약 출력
		System.out.println("Premium Customer Order:");
		order1.printOrderSummary();

		System.out.println("Regular Customer Order:");
		order2.printOrderSummary();
	}
}
*/