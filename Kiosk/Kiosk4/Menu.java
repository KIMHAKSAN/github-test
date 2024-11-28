package Kiosk4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName; // 메뉴 카테고리 이름
    private List<MenuItem> menuItems; // 카테고리에 포함된 메뉴 항목들

    /**
     * Menu 객체 생성 시 카테고리 이름을 설정하는 생성자
     * @param categoryName 메뉴 카테고리 이름
     */
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    /**
     * 카테고리 이름을 반환하는 메서드
     * @return 메뉴 카테고리 이름
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 메뉴 항목을 추가하는 메서드
     * @param item 추가할 메뉴 항목
     */
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    /**
     * 메뉴 항목 리스트를 반환하는 메서드
     * @return 메뉴 항목 리스트
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * 카테고리에 포함된 메뉴 항목들을 출력하는 메서드
     */
    public void displayMenuItems() {
        System.out.printf("[ %s MENU ]\n", categoryName.toUpperCase());
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}