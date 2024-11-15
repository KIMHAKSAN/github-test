package array;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사의 예
//        int[] a = {1, 2, 3, 4};
//        int[] b = a;
//
//        b[0] = 3;   //b를 바꾸면 a의 값이 변경이된다.
//
//        System.out.println(a[0]);
        // 출력결과 : 3

        // 깊은 복사

//        int[] a = { 1, 2, 3, 4 };
//        int[] b = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i]; // 깊은 복사
//        }
//
//        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)
//
//        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.
        // 츨력결과 : 1


    }

}
