package CalculatorLV2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            double first = 0;
            double second = 0;

            while (true) {
                try {
                    System.out.print("첫 번째 값을 입력하세요: ");
                    first = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                    sc.next();
                }
            }

            while (true) {
                try {
                    System.out.print("두 번째 값을 입력하세요: ");
                    second = sc.nextDouble();
                    break; // 입력이 성공하면 반복 종료
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                    sc.next(); // 버퍼에 남아 있는 잘못된 입력 제거
                }
            }

            // 연산자 입력
            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            String operation = sc.next();

            // 사칙연산 수행
            double result = 0;
            try {
                switch (operation) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        if (second != 0) {
                            result = first / second;
                        } else {
                            throw new ArithmeticException("0으로 나눌 수 없습니다.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("잘못된 연산자입니다: " + operation);
                }

                // 결과를 Calculator에 저장
                calculator.addResult(result);
                System.out.println("결과: " + result);

            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("오류 발생: " + e.getMessage());
            }

            // 저장된 결과 출력
            System.out.println("저장된 결과: " + calculator.getResults());

            // 결과 삭제 옵션
            System.out.print("저장된 결과 중 가장 오래된 결과를 삭제하시겠습니까? (yes / no): ");
            sc.nextLine();
            String deleteInput = sc.nextLine();


            if (deleteInput.equalsIgnoreCase("yes")) {
                calculator.setremoveResult();
                System.out.println("가장 오래된 결과가 삭제되었습니다.");
            }

            // 추가 연산 실행
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // 루프 종료
            }
        }
    }
}