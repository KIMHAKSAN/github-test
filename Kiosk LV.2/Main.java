package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 MenuItem 객체를 List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
            }
            System.out.println("0. 종료      | 종료");

            // 숫자를 입력받기
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            // 입력된 숫자에 따른 처리
            try {
                int choice = Integer.parseInt(input);

                if (choice == 0) { // 프로그램 종료 조건
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (choice > 0 && choice <= menuItems.size()) { // 선택한 메뉴 출력
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());
                } else { // 잘못된 메뉴 번호
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) { // 숫자가 아닌 입력 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        // Scanner 닫기
        scanner.close();
    }
}