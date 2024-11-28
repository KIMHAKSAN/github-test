package Kiosk2;

/**
 * 개별 메뉴 항목을 관리하는 클래스입니다.
 * 각 메뉴는 이름, 가격, 설명 데이터를 포함합니다.
 */
public class MenuItem {
    private String name; // 메뉴 이름
    private double price; // 메뉴 가격
    private String priceInfo; // 메뉴 설명

    /**
     * 생성자
     * @param name      메뉴 이름
     * @param price     메뉴 가격
     * @param priceInfo 메뉴 설명
     */
    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    /**
     * 메뉴 이름을 반환합니다.
     * @return 메뉴 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 메뉴 가격을 반환합니다.
     * @return 메뉴 가격
     */
    public double getPrice() {
        return price;
    }

    /**
     * 메뉴 설명을 반환합니다.
     * @return 메뉴 설명
     */
    public String getPriceInfo() {
        return priceInfo;
    }
}