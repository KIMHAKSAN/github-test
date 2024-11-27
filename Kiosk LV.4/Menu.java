package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName; // 메뉴 카테고리 이름
    private List<MenuItem> menuItems; // 카테고리에 포함된 메뉴 아이템들

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 카테고리에 포함된 메뉴 아이템 출력
    public void displayMenuItems() {
        System.out.printf("[ %s MENU ]\n", categoryName.toUpperCase());
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}