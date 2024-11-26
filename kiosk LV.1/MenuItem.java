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

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceInfo() {
        return priceInfo;
    }

    // Setter (필요하다면 추가)
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo;
    }
}