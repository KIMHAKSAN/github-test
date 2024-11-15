package collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // 순서가 있는 데이터의 집합 => Array(최초 길이를 알아야 함)
        // 처음에 길이를 몰라도 만들 수 있음!
        // 1) Array -> 정적 배열
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다.)
        // - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        // - 같이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니깐. 상관없다!!

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(2));

        // 2번째 있는 값(15)을 바꿔보자.
        intList.set(1, 10); //1번 배열의 있는 값은 10으로 변경
        System.out.println(intList.get(1)); //따라서 1번 배열에 있는 10이 출력됨

        // 삭제
        intList.remove(0); // 0번 배열의 있는 값을 삭제한다.
        System.out.println(intList.get(0)); // 따라서 실행하면 1번 인덱스에 있는 값이 출력됨


        // 클리어
        System.out.println("클리어 전");
        System.out.println(intList.toString());
        System.out.println("클리어 후");
        intList.clear(); // 리스트의 모든 값을 초기화 한다.
        System.out.println(intList.toString()); // toString은 리스트의 현재 상태를 보여주는 명령어
    }
}
