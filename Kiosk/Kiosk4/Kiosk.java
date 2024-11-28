package Kiosk4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus; // 전체 메뉴 카테고리를 관리하는 리스트

    /**
     * Kiosk 객체 생성 시 전체 메뉴를 전달받아 초기화하는 생성자
     * @param menus 전체 메뉴 리스트
     */
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    /**
     * Kiosk 프로그램을 시작하는 메서드
     * - 사용자가 메뉴를 선택하고 카테고리별 메뉴를 출력
     * - 잘못된 입력 처리 및 종료 조건 구현
     */
    public void start() {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        while (true) {
            /**
             * 메인 메뉴 출력
             * - 카테고리별 메뉴를 나열하고, 종료 옵션을 제공
             */
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                // 각 메뉴 카테고리 이름 출력
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            // 사용자 입력 받기
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            /**
             * 종료 조건: "0"을 입력하면 프로그램 종료
             */
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            /**
             * 입력 처리: 숫자 입력이 유효한지 확인
             * - 숫자가 아닌 입력은 예외 처리
             */
            try {
                int choice = Integer.parseInt(input); // 입력받은 값을 정수로 변환
                if (choice > 0 && choice <= menus.size()) {
                    // 선택된 메뉴 카테고리를 가져와서 해당 메뉴 항목을 처리
                    Menu selectedMenu = menus.get(choice - 1);
                    handleMenuSelection(scanner, selectedMenu);
                } else {
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 입력을 받았을 경우 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        scanner.close();
    }

    /**
     * 카테고리별 메뉴 선택을 처리하는 메서드
     * @param scanner 사용자 입력을 받기 위한 Scanner 객체
     * @param selectedMenu 사용자가 선택한 카테고리 메뉴
     */
    private void handleMenuSelection(Scanner scanner, Menu selectedMenu) {
        while (true) {
            /**
             * 선택된 카테고리 메뉴 출력
             * - 해당 카테고리의 메뉴 항목들을 나열
             */
            selectedMenu.displayMenuItems();

            // 사용자 입력 받기
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            /**
             * 뒤로가기 조건: "0"을 입력하면 메인 메뉴로 돌아감
             */
            if (input.equals("0")) {
                System.out.println("메인 메뉴로 돌아갑니다.\n");
                break;
            }

            /**
             * 입력 처리: 메뉴 항목을 선택하면 해당 항목의 정보를 출력
             * - 잘못된 입력 처리
             */
            try {
                int choice = Integer.parseInt(input); // 입력받은 값을 정수로 변환
                List<MenuItem> items = selectedMenu.getMenuItems();
                if (choice > 0 && choice <= items.size()) {
                    // 선택된 메뉴 항목 정보 출력
                    MenuItem selectedItem = items.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n",
                            selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());

                    /**
                     * 선택 후 MAIN MENU로 이동
                     * - 메뉴 항목을 출력한 후 MAIN MENU로 돌아가기 위해 메서드 종료
                     */
                    return;
                } else {
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 입력을 받았을 경우 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }
    }
}