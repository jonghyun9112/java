package com.ruby.java.ch07.상속;

class Order {
    private Customer customer; // 고객
    private Item[] items; // 주문 제품들
    private int[] quantities; // 주문 제품 수량들
    private String []orderDates;
    private int count; // 아이템 개수
    

    public Order(Customer customer, Item[] items, int[] quantities, String[] orderDates, int count) {
		super();
		this.customer = customer;
		this.items = items;
		this.quantities = quantities;
		this.orderDates = orderDates;
		this.count = count;
		
		
		
	}

	// 아이템 추가 메소드
    public void addItem(Item item, int orderQuantity) {
    	
    	

    }

    // 총액 계산 메소드
    public double calculateTotal() {
  
    }

    // 주문 요약 출력 메소드
    public void printOrderSummary() {

    }
}