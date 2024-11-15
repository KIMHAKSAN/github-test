package week03.sample;

// 지역변수
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
        // 상수로 불변하는 값을 입력 하려면
        // static final String COMPANY = "GENESIS"; 이러한 형태로 하면 된다.
    }

    // 기본 생성자
//  public Main () {}

    public int getNumber () {
        // 지역변수 <-> 전역변수
        // 해당 메서드가 실행될 때 마다 독립적인 값을 저장하고 관리합니다.
        // 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1; //number = number + 1
        return number;
    }
}
