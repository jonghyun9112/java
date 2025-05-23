package com.ruby.java.ch07.상속;

class Customer {
    private String cname;
    private String city;
    private int age;

    public Customer(String cname, String city, int age) {
        this.cname = cname;
        this.city = city;
        this.age = age;
    }

    // 정보 출력 메소드
    public void show() {
        System.out.println(cname, city, age);
    }

    @Override
    public String toString() {
        return cname, city, age ;
    }
}