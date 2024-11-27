# LV1, LV2 계산기 김학산

## LV1. 계산기 설계 (클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기)
- 양의 정수(0 포함)를 입력받기
- 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
- 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
- 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

### Main.java
```js
package com.example.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("계산기를 실행합니다!!!");

    double a = 0, b = 0;
    try {
    System.out.print("첫 번째 숫자를 입력하세요: ");
    a = sc.nextDouble();

    System.out.print("두 번째 숫자를 입력하세요: ");
    b = sc.nextDouble();
} catch (Exception e) {
    System.out.println("오류: 숫자를 입력해야 합니다.");
    return;
}

System.out.print("사칙연산 기호를 입력하세요(+, -, x, /) : ");
String c = sc.next();
double result = 0;

if (c.equals("+")) {
    result = a + b;
} else if (c.equals("-")) {
    result = a - b;
} else if (c.equals("x")) {
    result = a * b;
} else if (c.equals("/")) {
    if (b == 0) {
        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        return;
    }
    result = a / b;
} else {
    System.out.println("잘못된 사칙연산 기호를 입력하였습니다.");
    return;
}
System.out.println("결과: " + result);

while(true) {
    System.out.print("숫자를 입력하세요 (또는 'exit'를 입력하여 종료): ");
    String input = sc.next();

    if (input.equals("exit")) {
        System.out.println("계산기를 종료합니다.");
        break;
    }

    double d;
    try {
        d = Double.parseDouble(input); //String을 double로 변환
    } catch (Exception e) {
        System.out.println("유효한 숫자를 입력해야 합니다.");
        continue;
    }

    System.out.print("사칙연산 기호를 입력하세요(+, -, x, /) : ");
    String e = sc.next();
    double result2 = 0;

    if (e.equals("+")) {
        result2 = result + d;
    } else if (e.equals("-")) {
        result2 = result - d;
    } else if (e.equals("x")) {
        result2 = result * d;
    } else if (e.equals("/")) {
        if (d == 0) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            continue;
        }
        result2 = result / d;
    } else {
        System.out.println("잘못된 사칙연산 기호를 입력하였습니다.");
        continue;
    }

    System.out.println("결과: " + result2);
    result = result2;
        }
    }
}
```

## LV1. 계산기 설명 (클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기)
- Scanner을 사용하여 입력을 받을 수 있게 코드를 작성 하였습니다. 이 때 다른 값을 입력하면 오류를 찾아 출력 할 수 있도록
  try-catch 문을 사용하여 예외처리를 하였습니다.

- 조건문(if)를 사용하여 사칙연산을 받을 수 있도록 하였습니다. 그리고 나눗셈 연산에는 두 번째 정수 값이 0이면 값이 출력 될 수 없기 때문에
  이중 if문을 사용하여 에러 메시지를 출력 할 수 있도록 하였습니다. 또한 모든 조건문에 조건을 만족하지 못하면 에러 메세지를 출력하게 하였습니다.

- 위 결과를 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행하여  출력을 받을 수 있도록 하였습니다.
- 추가 연산을 위해 while 반복문을 사용하여 기존 result값에 추가로 연산 할 수 있도록 코드를 작성하였습니다. 
  while문 전에 사용했던 기능들을 대부분 넣었습니다. 그리고 exit 를 입력시 코드를 종료하기 위해서 조건문에 equals를 넣었고 exit가 
  입력되면 코드가 종료되게 하기 위해 break;를 기입하였습니다.

## LV1. Trouble Shooting
- 예외처리를 위한 메서드의 이해도가 부족하여 강의, 인터넷을 참조하는 시간이 좀 길었습니다. 

- 현황파악을 못한 점도 코드에 존재한다고 생각합니다. LV2를 진행하면서 추가연산의 기능이 기존 값에 추가로 연산
  하는 것이 아닌 새로운 연산을 하는 것임을 알게 되었습니다. 

- 계산기를 작성할 때 if문 보단 switch문이 더욱 가독성이 좋다고 생각하였습니다. LV2 에서는 switch문을 사용하였습니다.

- 추가 연산에서 exit를 구현하기 위해 input에 string으로 값을 입력받고 if문을 통해 탈출할 수 있게 하고 if문에
  부합하지 않으면 다시 string을 double형으로 변환해야하는데 그 과정을 제대로 숙지하지 않아 많이 곤란을 겪었습니다.


## LV2. 계산기 설계 (클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기)
- 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
- App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
- Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정

### Main.java
```js
package CalculatorLV2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator calculator = new Calculator();

    while (true) {
    double first = 0;
    double second = 0;

    while (true) {
    try {
    System.out.print("첫 번째 값을 입력하세요: ");
    first = sc.nextDouble();
    break;
} catch (InputMismatchException e) {
    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
    sc.next();
}
}

while (true) {
    try {
        System.out.print("두 번째 값을 입력하세요: ");
        second = sc.nextDouble();
        break; // 입력이 성공하면 반복 종료
    } catch (InputMismatchException e) {
        System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
        sc.next(); // 버퍼에 남아 있는 잘못된 입력 제거
    }
}

// 연산자 입력
System.out.print("연산자를 입력하세요 (+, -, *, /): ");
String operation = sc.next();

// 사칙연산 수행
double result = 0;
try {
    switch (operation) {
        case "+":
            result = first + second;
            break;
        case "-":
            result = first - second;
            break;
        case "*":
            result = first * second;
            break;
        case "/":
            if (second != 0) {
                result = first / second;
            } else {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            break;
        default:
            throw new IllegalArgumentException("잘못된 연산자입니다: " + operation);
    }

    // 결과를 Calculator에 저장
    calculator.addResult(result);
    System.out.println("결과: " + result);

} catch (ArithmeticException | IllegalArgumentException e) {
    System.out.println("오류 발생: " + e.getMessage());
}

// 저장된 결과 출력
System.out.println("저장된 결과: " + calculator.getResults());

// 결과 삭제 옵션
System.out.print("저장된 결과 중 가장 오래된 결과를 삭제하시겠습니까? (yes / no): ");
sc.nextLine();
String deleteInput = sc.nextLine();


if (deleteInput.equalsIgnoreCase("yes")) {
    calculator.setremoveResult();
    System.out.println("가장 오래된 결과가 삭제되었습니다.");
}

// 추가 연산 실행
System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
String input = sc.nextLine();

if (input.equalsIgnoreCase("exit")) {
    System.out.println("프로그램을 종료합니다.");
    break; // 루프 종료
            }
        }
    }
}

```

### Calculator.java
```js
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

```

## LV2. 계산기 설명 (클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기)

- 기존 LV1과 비슷하게 사칙연산을 수행하지만 switch문을 사용하였습니다. 선언을 통해 메서드를 구현하고 
  연산 결과를 저장하는 컬렉션 필드를 가진 Calculator를 생성하였습니다.

- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정하였습니다.

- 컬렉션 필드에 private로 선언하여 외부에서 직접 컬렉션에 접근 할 수 없도록 코드를 작성하였습니다.

- 가장 먼저 기록된 정보를 삭제 할 수 있도록 메인 코드에서 yes가 입력되면 Calculator에서 삭제 할 수
  있도록 코드를 작성 하였습니다.

## LV2. Trouble Shooting
- 저장된 결과 출력, 추가 연산 입력 부분에서 enter를 누르면 바로 다음 구문이 출력되도록 설계를 하고 싶었
  지만 결과 삭제 옵션을 수정하면 추가 연산 실행 쪽에서 안되고 반대로 추가 연산 실행에서 수정하면 
  반대로 결과 삭제 옵션에서 사용이 불가능 하여 추가 연산 실행 부분 만 enter를 누르게 하고 결과 
  삭제 옵션에서는 yes와 no을 입력 받도록 메세지를 설정 하였습니다.

- LV.1과 마찬가지로 예외처리를 위한 메서드의 이해도가 부족하여 강의, 인터넷을 참조하는 시간이 좀 길었습니다.

- 컬렉션의 개념이 부족하여 제가 정리한 velog글을 찾고 안되면 인터넷서칭을 통해 값을 입력 하였습니다.
  이 부분은 좀더 많은 숙달이 필요 할 것 같습니다.

- 클래스의 기본 구조와 오버로딩에 대한 이해가 어느 정도 되었으나 코드 작성에 이해가 부족하여 시간이 
  더욱 걸린것 같습니다. 추가적인 학습이 필요 할 것 같습니다.
