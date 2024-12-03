// 평균 구하기
// 제출 내역
// 문제 설명
// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

// 제한사항
// arr은 길이 1 이상, 100 이하인 배열입니다.
// arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
// 입출력 예
// arr	        return
// [1,2,3,4]	2.5
// [5,5]	    5


// Existing CODE
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        return answer;
    }
}
// LOW CODE

class Solution {
    public double solution(int[] arr) {
        double sum = 0; // 합계를 저장할 변수 선언 및 초기화
        for (int i = 0; i < arr.length; i++) { // 반복문 조건 수정
            sum += arr[i]; // 배열의 각 요소를 합산
        }
        return sum / arr.length; // 평균값 반환
    }
}