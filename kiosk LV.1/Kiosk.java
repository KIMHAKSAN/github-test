package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        // 메뉴 아이템 데이터 (이름, 가격, 설명)
        String[][] menuItems = {
                {"ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
                {"SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
                {"Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
                {"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"}
        };

        Scanner in = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, menuItems[i][0], Double.parseDouble(menuItems[i][1]), menuItems[i][2]);
            }
            System.out.println("0. 종료      | 종료");

            // 입력 받기
            System.out.print("메뉴를 선택하세요: ");
            String input = in.nextLine();

            // 종료 조건
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력된 값이 유효한 메뉴 번호인지 확인
            try {
                int choice = Integer.parseInt(input);
                if (choice > 0 && choice <= menuItems.length) {
                    String name = menuItems[choice - 1][0];
                    double price = Double.parseDouble(menuItems[choice - 1][1]);
                    String description = menuItems[choice - 1][2];
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", name, price, description);
                } else {
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        in.close();
    }
}