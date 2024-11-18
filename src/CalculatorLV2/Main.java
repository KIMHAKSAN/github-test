package CalculatorLV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator(); // Calculator 객체 생성

        System.out.println("계산기를 실행합니다!!!");

        double result = 0;
        boolean isFirstOperation = true;

        while (true) {
            double num1, num2;

            try {
                // 첫 번째 연산일 경우, 두 숫자를 입력받음
                if (isFirstOperation) {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = sc.nextDouble();

                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = sc.nextDouble();
                    isFirstOperation = false;
                } else {
                    // 이후에는 이전 결과를 num1으로 사용
                    num1 = result;
                    System.out.print("다음 숫자를 입력하세요: ");
                    num2 = sc.nextDouble();
                }
            } catch (Exception e) {
                System.out.println("오류: 숫자를 입력해야 합니다.");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요(+, -, x, /): ");
            String operator = sc.next();

            try {
                result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
                System.out.println("현재 저장된 결과들: " + calculator.getResults());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            // 추가 연산 또는 종료 여부 확인
            System.out.print("계속 계산하시겠습니까? 계속하기 위해서는 아무 키나 눌러주세요. (exit 입력 시 종료): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }

        sc.close();
    }
}