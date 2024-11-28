package Kiosk2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * 프로그램의 진입점 (Entry Point)입니다.
     * 햄버거 메뉴를 관리하고 사용자 입력을 처리합니다.
     */
    public static void main(String[] args) {
        // List 선언 및 초기화
        /**
         * 햄버거 메뉴 데이터를 저장할 List 객체 생성.
         * 각 항목은 MenuItem 객체로 구성됩니다.
         */
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 MenuItem 객체를 List에 삽입
        /**
         * 메뉴 데이터를 MenuItem 객체로 생성하여 리스트에 추가.
         * 메뉴 이름, 가격, 설명 정보를 포함합니다.
         */
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        /**
         * 사용자 입력을 처리하기 위한 Scanner 객체 생성.
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            /**
             * 메뉴 리스트를 화면에 출력.
             * 각 메뉴 항목에 대해 번호, 이름, 가격, 설명을 표시합니다.
             */
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
            }
            System.out.println("0. 종료      | 종료");

            // 숫자를 입력받기
            /**
             * 사용자로부터 메뉴 선택 번호를 입력받습니다.
             * 입력값은 문자열로 처리한 뒤 정수로 변환합니다.
             */
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            // 입력된 숫자에 따른 처리
            try {
                int choice = Integer.parseInt(input); // 문자열을 정수로 변환

                if (choice == 0) { // 프로그램 종료 조건
                    /**
                     * 사용자가 0을 입력한 경우 프로그램 종료 메시지를 출력하고 루프를 종료합니다.
                     */
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (choice > 0 && choice <= menuItems.size()) {
                    /**
                     * 유효한 메뉴 번호를 입력받은 경우:
                     * 선택한 메뉴의 이름, 가격, 설명을 출력합니다.
                     */
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());
                } else {
                    /**
                     * 입력값이 유효하지 않은 메뉴 번호일 경우:
                     * 사용자에게 유효하지 않은 번호임을 알립니다.
                     */
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                /**
                 * 입력값이 정수가 아닌 경우:
                 * 사용자에게 숫자를 입력하도록 요청합니다.
                 */
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        // Scanner 닫기
        /**
         * 프로그램 종료 전 Scanner 객체를 닫아 자원을 해제합니다.
         */
        scanner.close();
    }
}