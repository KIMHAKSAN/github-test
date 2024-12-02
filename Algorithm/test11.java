// 짝수와 홀수
// 제출 내역
// 문제 설명
// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

// 제한 조건
// num은 int 범위의 정수입니다.
// 0은 짝수입니다.
// 입출력 예
// num	return
// 3	"Odd"
// 4	"Even"

// 예시 코드

class Solution {
    public String solution(int num) {
        String answer = "";
        return answer;
    }
}

// LOW 코드

class Solution {
    public String solution(int num) {
        if (num % 2 == 0) { 
            return "Even"; // 짝수일 때
        } else {
            return "Odd";  // 홀수일 때
        }
    }
}