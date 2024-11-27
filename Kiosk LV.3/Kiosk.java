package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems; // 메뉴 항목을 관리하는 리스트

    // 생성자: 메뉴 리스트를 초기화
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 프로그램 실행 메서드
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
                int choice = Integer.parseInt(input);
                if (choice > 0 && choice <= menuItems.size()) {
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());
                } else {
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        scanner.close();
    }
}