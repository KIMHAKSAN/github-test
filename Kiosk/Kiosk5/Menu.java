package Kiosk5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;       // 메뉴 카테고리 이름
    private List<MenuItem> menuItems;  // 해당 카테고리의 메뉴 아이템들

    /**
     * Menu 객체를 생성하고 카테고리 이름을 설정합니다.
     *
     * @param categoryName 메뉴 카테고리 이름
     */
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // Getter
    /**
     * 메뉴 카테고리 이름을 반환합니다.
     *
     * @return 카테고리 이름
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 메뉴 항목 목록을 반환합니다.
     *
     * @return 메뉴 항목 목록
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Setter
    /**
     * 카테고리 이름을 설정합니다.
     *
     * @param categoryName 카테고리 이름
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 메뉴 항목을 추가합니다.
     *
     * @param item 메뉴 항목
     */
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    /**
     * 메뉴 항목을 출력합니다.
     */
    public void displayMenuItems() {
        System.out.printf("[ %s MENU ]\n", categoryName);
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s\n",
                    i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}