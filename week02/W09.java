package week02;
//        주의 사항) 연산 전에 피연산자의 타입을 일치시키는 것
//        - 두 피연산자의 타입을 같게 일치시킨다. (둘중에 저장공간 크기가 더 큰 타입으로 일치
//        - 피연산자의 타입이 `int` 보다 작은 `short` 타입이면 `int`로 변환
//        - 피연산자의 타입이 `long` 보다 작은 `int`, `short` 타입이면 `Long`으로 변환
//        - 피연산자의 타입이 `float`보다 작은 `long`, `int`, `short` 타입이면 `float`으로 변환
//        - 피연산자의 타입이 `double` 보다 작은 `float`, `long`, `int`, `short` 타입이면 `double`으로 변환
//        - 이처럼, 변수 여러 개를 연산했을 때 결괏값은 피연산자 중 표현 범위가 가장 큰 변수 타입을 가지게 됩니다.
public class W09 {
    public static void main(String[] args) {
        short x = 10;
        int y = 20;

        int z = x + y;

        long lx = 30L;
        Long lz = z + lx;

        float fx = x;
        float fy = y;
        float fz = z;

        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);

    }
}
