package Kiosk3;

/**
 * MenuItem 클래스는 개별 메뉴 항목을 관리합니다.
 * - 각 메뉴 항목은 이름, 가격, 설명 필드를 가집니다.
 * - 해당 필드의 값을 반환하는 Getter 메서드를 제공합니다.
 */
public class MenuItem {
    private String name; // 메뉴 이름
    private double price; // 메뉴 가격
    private String priceInfo; // 메뉴 설명

    /**
     * 생성자: MenuItem 객체를 생성하며 필드를 초기화합니다.
     * @param name 메뉴 이름
     * @param price 메뉴 가격
     * @param priceInfo 메뉴 설명
     */
    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    /**
     * Getter 메서드: 메뉴 이름을 반환합니다.
     * @return 메뉴 이름
     */
    public String getName() {
        return name;
    }

    /**
     * Getter 메서드: 메뉴 가격을 반환합니다.
     * @return 메뉴 가격
     */
    public double getPrice() {
        return price;
    }

    /**
     * Getter 메서드: 메뉴 설명을 반환합니다.
     * @return 메뉴 설명
     */
    public String getPriceInfo() {
        return priceInfo;
    }
}