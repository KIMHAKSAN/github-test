package com.example.kiosk;

public class MenuItem {
    private String name;
    private double price;
    private String priceInfo;

    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceInfo() {
        return priceInfo;
    }
}