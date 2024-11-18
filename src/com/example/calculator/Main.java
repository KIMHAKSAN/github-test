package com.example.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("계산기를 실행합니다!!!");

        double a = 0, b = 0;
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("오류: 숫자를 입력해야 합니다.");
            return;
        }

        System.out.print("사칙연산 기호를 입력하세요(+, -, x, /) : ");
        String c = sc.next();
        double result = 0;

        if (c.equals("+")) {
            result = a + b;
        } else if (c.equals("-")) {
            result = a - b;
        } else if (c.equals("x")) {
            result = a * b;
        } else if (c.equals("/")) {
            if (b == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return;
            }
            result = a / b;
        } else {
            System.out.println("잘못된 사칙연산 기호를 입력하였습니다.");
            return;
        }
        System.out.println("결과: " + result);

        while(true) {
            System.out.print("숫자를 입력하세요 (또는 'exit'를 입력하여 종료): ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            double d;
            try {
                d = Double.parseDouble(input); //String을 double로 변환
            } catch (Exception e) {
                System.out.println("유효한 숫자를 입력해야 합니다.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요(+, -, x, /) : ");
            String e = sc.next();
            double result2 = 0;

            if (e.equals("+")) {
                result2 = result + d;
            } else if (e.equals("-")) {
                result2 = result - d;
            } else if (e.equals("x")) {
                result2 = result * d;
            } else if (e.equals("/")) {
                if (d == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
                result2 = result / d;
            } else {
                System.out.println("잘못된 사칙연산 기호를 입력하였습니다.");
                continue;
            }

            System.out.println("결과: " + result2);
            result = result2;
        }
    }
}