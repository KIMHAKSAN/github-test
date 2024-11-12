// 문자 -> 숫자

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("맛있는 컵라면 만들기");
        double a = 4.5;
        int b;
        double c;
        b = (int)a;
        c = (double) 100*b/5;
        System.out.println("별점: " + b + " (" + c + "%)");
        System.out.println("컵라면에 봉지를 뜯어주세요");
        System.out.println("컵라면에 뚜겅을 열고 스프를 넣어주세요");
        System.out.println("컵라면에 뜨거운 물을 넣어줍니다");
        System.out.println("3분 기다려주세요");
        System.out.println("맛있게 드시면 됩니다");

    }

}

