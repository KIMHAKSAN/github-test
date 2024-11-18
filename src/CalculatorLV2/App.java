package CalculatorLV2;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    private Queue<Double> results = new LinkedList<>();

    // 사칙연산 수행 메서드
    public double calculate(double num1, double num2, String operator) throws IllegalArgumentException {
        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "x":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산 기호입니다.");
        }

        // 결과 저장
        results.offer(result);
        return result;
    }

    // 결과 가져오기
    public Queue<Double> getResults() {
        return new LinkedList<>(results);
    }

    // 결과 삭제 메서드 (FIFO 방식)
    public void removeResult() {
        if (!results.isEmpty()) {
            results.poll();
        }
    }
}