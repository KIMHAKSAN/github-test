package array;

public class Arr05 {
    public static void main(String[] args) {
        //문자(char / 1byte), 문자열(string)
        // string = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 소문자로 시작, 반면 참조형 변수는 대문자로 시작함
        // -Wrapper class에서 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 2. 기본형 변수는 값을 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 재정의함(= 주소형 변수)

        // char < String(훨씬 더!)
        // string 가지고 있는 기능이 너무 많아서...!!!!!
        // Wrapper class와도 상당히 비슷..! -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 wrapper을 감행으로써, 추가기능을 더함

        //String 기능 활용 에시
        String str = "ABCD";

        // (1) length
        int strLength = str.length(); // 문자열의 길이를 출력
        System.out.println(strLength); // 출력결과 : 4

        // (2) charAt(int index)
        char strChar = str.charAt(1); // 문자열의 1번째 값 출력
        System.out.println(strChar); // 출력결과 : B

        // (3) substring(int fromIdx, toIdx)
        String strSub = str.substring(0, 3); // 0~3 전까지의 문자열을 출력한다.
        System.out.println(strSub); // 출력결과 : ABC

        // (4) equals(string shr)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // 출력결과 : ture

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> string -> char
        char[] charArray = {'A','B','C'};
        String CharArryString = new String(charArray);
        System.out.println(CharArryString); // ABC

    }
}
