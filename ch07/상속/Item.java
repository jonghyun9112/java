package com.ruby.java.ch07.상속;

class Item { // 제품
    private String name; // 제품명
    private double price; // 제품 가격
    private int stockQuantity; // 재고량
    
    public Item(String name, double price, int stockOuantity) {
    	
    	this.name = name;
    	this.price = price;
    	this.stockQuantity = stockOuantity;
    			
		
	}

    // 재고 감소 메소드
    public void reduceStock(int quantity) {
    	
    	stockQuantity -= quantity;

    }

    // 재고 증가 메소드
    public void increaseStock(int quantity) {
    	
    	stockQuantity += quantity;

    }

    // 정보 출력 메소드
    public void show() {
        
    }

    @Override
    public String toString() {
        
    }


    // 접근자 메소드
	
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }
	
    
}

