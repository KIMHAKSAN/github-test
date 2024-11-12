package week02;

public class W08 {
    public static void main(String[] args) {
        // 연산자 우선순위 : 산술 > 비교 > 논리 > 대입
        // - 연산자 여러개가 함께 있는 연산을 계산할때는 우선순위가 있습니다.
        // - 위 우선순위에 따라서 최종적인 응닶이 결정됩니다.
        // 단, 괄호로 감싸주면 괄호안의 연산이 최우선순위로 계산됩니다.

        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result);
        System.out.println("------------");

        result = x + 10 < y && y < z;
        System.out.println(result);
        System.out.println("------------");

        result = x + 2 * 3 > y;
        System.out.println(result);
        System.out.println("------------");

        result = (x + 2) * 3 > y;
        System.out.println(result);
        System.out.println("------------");


//        주의 사항) 연산 전에 피연산자의 타입을 일치시키는 것
//        - 두 피연산자의 타입을 같게 일치시킨다. (둘중에 저장공간 크기가 더 큰 타입으로 일치
//        - 피연산자의 타입이 `int` 보다 작은 `short` 타입이면 `int`로 변환
//        - 피연산자의 타입이 `long` 보다 작은 `int`, `short` 타입이면 `Long`으로 변환
//        - 피연산자의 타입이 `float`보다 작은 `long`, `int`, `short` 타입이면 `float`으로 변환
//        - 피연산자의 타입이 `double` 보다 작은 `float`, `long`, `int`, `short` 타입이면 `double`으로 변환
//        - 이처럼, 변수 여러 개를 연산했을 때 결괏값은 피연산자 중 표현 범위가 가장 큰 변수 타입을 가지게 됩니다.


    }
}
