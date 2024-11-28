package Kiosk5;

public class MenuItem {
    private String name;        // 이름
    private double price;       // 가격
    private String priceInfo;   // 설명

    /**
     * MenuItem 객체를 생성하고 메뉴 아이템의 정보를 설정합니다.
     *
     * @param name 메뉴 이름
     * @param price 메뉴 가격
     * @param priceInfo 메뉴 설명
     */
    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    // Getter
    /**
     * 메뉴 이름을 반환합니다.
     *
     * @return 메뉴 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 메뉴 가격을 반환합니다.
     *
     * @return 메뉴 가격
     */
    public double getPrice() {
        return price;
    }

    /**
     * 메뉴 설명을 반환합니다.
     *
     * @return 메뉴 설명
     */
    public String getPriceInfo() {
        return priceInfo;
    }

    // Setter
    /**
     * 메뉴 이름을 설정합니다.
     *
     * @param name 메뉴 이름
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 메뉴 가격을 설정합니다.
     *
     * @param price 메뉴 가격
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 메뉴 설명을 설정합니다.
     *
     * @param priceInfo 메뉴 설명
     */
    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo;
    }
}