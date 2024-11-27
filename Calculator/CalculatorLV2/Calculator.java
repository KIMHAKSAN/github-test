package CalculatorLV2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장할 컬렉션 (외부에서 직접 접근할 수 없도록 private으로 선언)
    private List<Double> results;

    // 기본 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 결과를 추가하는 메서드
    public void addResult(double result) {
        this.results.add(result); // 결과 저장
    }

    // 저장된 결과를 반환하는 Getter 메서드
    public List<Double> getResults() {
        return new ArrayList<>(this.results);
    }

    // 저장된 결과 중 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void setremoveResult() {
        if (!results.isEmpty()) {
            this.results.remove(0); // 첫 번째 요소 삭제
        } else {
            System.out.println("결과가 없습니다. 삭제할 수 없습니다.");
        }
    }
}