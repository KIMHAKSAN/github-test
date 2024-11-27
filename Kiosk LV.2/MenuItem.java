package com.example.kiosk;

public class MenuItem {
    private String name; // 메뉴 이름
    private double price; // 메뉴 가격
    private String priceInfo; // 메뉴 설명

    // 생성자
    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceInfo() {
        return priceInfo;
    }

    // 필요하다면 Setter 메서드 추가 가능
}