package week02;

public class W06 {
    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점!
        // ++, --
        int a = 10;
        int b = 10;
        // int val = ++a + b--; //a는 먼저 대입 했기때문에 11이 b는 뒤에 대입했기때문에 10이 출력된다.
        // System.out.println(val); //21
        int val = ++a + --b;
        System.out.println(a); //a를 먼저 대입하면 결과값에 11을 현재 출력하고
        System.out.println(b); //b를 먼저 대입하면 결과값에 9을 현재 출력한다.
        System.out.println(val); //++a는 이미 1이 증가됐으니 그대로 11, b는 먼저 선언된 구문으로 인해 이제 9가 출력된다.
    }
}
