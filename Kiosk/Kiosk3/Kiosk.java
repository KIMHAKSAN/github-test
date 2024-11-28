package Kiosk3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Kiosk 클래스는 키오스크 프로그램의 흐름을 제어하는 역할을 합니다.
 * - 메뉴 항목을 관리하는 리스트를 필드로 가집니다.
 * - 사용자 입력을 받아 메뉴를 선택하거나 프로그램을 종료합니다.
 * - 입력 및 예외 처리를 통해 유효하지 않은 입력에 대한 메시지를 출력합니다.
 */
public class Kiosk {
    private List<MenuItem> menuItems; // 메뉴 항목을 관리하는 리스트

    /**
     * 생성자: Kiosk 객체를 생성하며 메뉴 항목 리스트를 초기화합니다.
     * @param menuItems 초기화할 메뉴 항목 리스트
     */
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    /**
     * start 메서드는 키오스크 프로그램의 메인 로직을 실행합니다.
     * - 메뉴를 출력하고 사용자 입력을 처리합니다.
     * - 0을 입력하면 프로그램을 종료합니다.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
            }
            System.out.println("0. 종료      | 종료");

            // 사용자 입력 처리
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            // 종료 조건
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 메뉴 선택 처리
            try {
                int choice = Integer.parseInt(input); // 입력 값을 정수로 변환
                if (choice > 0 && choice <= menuItems.size()) {
                    // 선택한 메뉴 출력
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());
                } else {
                    // 메뉴 번호가 범위를 벗어난 경우
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                // 입력값이 숫자가 아닌 경우
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        scanner.close(); // Scanner 자원 해제
    }
}