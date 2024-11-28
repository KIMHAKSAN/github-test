package Kiosk4;

public class MenuItem {
    private String name; // 메뉴 항목의 이름
    private double price; // 메뉴 항목의 가격
    private String priceInfo; // 가격에 대한 설명

    /**
     * MenuItem 객체 생성 시 이름, 가격, 가격 설명을 설정하는 생성자
     * @param name 메뉴 항목의 이름
     * @param price 메뉴 항목의 가격
     * @param priceInfo 가격에 대한 설명
     */
    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    /**
     * 메뉴 항목의 이름을 반환하는 메서드
     * @return 메뉴 항목의 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 메뉴 항목의 가격을 반환하는 메서드
     * @return 메뉴 항목의 가격
     */
    public double getPrice() {
        return price;
    }

    /**
     * 메뉴 항목의 가격 설명을 반환하는 메서드
     * @return 가격 설명
     */
    public String getPriceInfo() {
        return priceInfo;
    }
}