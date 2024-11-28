package Kiosk3;

import java.util.ArrayList;
import java.util.List;

/**
 * Main 클래스는 키오스크 프로그램을 실행하는 진입점입니다.
 * - 메뉴 항목을 생성하고 Kiosk 객체를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        // 메뉴 항목 생성 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Kiosk 객체 생성 및 실행
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start(); // 키오스크 프로그램 시작
    }
}