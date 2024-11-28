package Kiosk1;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        /**
         * 메뉴 아이템 데이터를 2차원 배열로 선언
         * 각 배열의 요소는 {메뉴 이름, 가격, 설명} 순서로 저장됩니다.
         */
        String[][] menuItems = {
                {"ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
                {"SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
                {"Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
                {"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"}
        };

        /**
         * Scanner 객체를 생성하여 사용자 입력을 처리합니다.
         */
        Scanner in = new Scanner(System.in);

        /**
         * 프로그램은 사용자가 종료 명령(0)을 입력할 때까지 반복됩니다.
         */
        while (true) {
            /**
             * 메뉴 출력
             * 메뉴는 1번부터 시작하며, 각 메뉴 항목은 이름, 가격, 설명으로 구성됩니다.
             * 종료 옵션은 항상 0번으로 출력됩니다.
             */
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, menuItems[i][0], Double.parseDouble(menuItems[i][1]), menuItems[i][2]);
            }
            System.out.println("0. 종료      | 종료");

            /**
             * 사용자 입력 요청 및 입력 값 받기
             * 입력 값은 문자열로 받고, 이후 처리에서 숫자로 변환합니다.
             */
            System.out.print("메뉴를 선택하세요: ");
            String input = in.nextLine();

            /**
             * 종료 조건: 사용자가 "0"을 입력하면 반복문을 탈출하고 프로그램을 종료합니다.
             */
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            /**
             * 입력된 값이 유효한 메뉴 번호인지 확인합니다.
             * 유효한 입력(1~menuItems.length)에 따라 메뉴 정보를 출력합니다.
             * 숫자 변환이 실패하거나 유효하지 않은 값일 경우, 적절한 오류 메시지를 출력합니다.
             */
            try {
                int choice = Integer.parseInt(input); // 입력 값을 숫자로 변환
                if (choice > 0 && choice <= menuItems.length) {
                    // 유효한 메뉴 선택
                    String name = menuItems[choice - 1][0];
                    double price = Double.parseDouble(menuItems[choice - 1][1]);
                    String description = menuItems[choice - 1][2];
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", name, price, description);
                } else {
                    // 유효하지 않은 메뉴 번호 처리
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.\n");
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 값 입력 시 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        /**
         * Scanner 객체를 닫아 리소스를 해제합니다.
         */
        in.close();
    }
}