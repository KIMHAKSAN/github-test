package week02;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//
//        // number < 3 인 동안~~
//        while (number < 3) {
//
//            number++;
//            System.out.println(number + "출력!");
//        }
//
//        출력결과 : 1출력!
//                  2출력!
//                  3출력!
        // do ~ while
//        int number = 4;
//        do {
//            // 이 로직을 먼저 수행하겠다!
//            System.out.println(number + "출력!"); // 따라서 4출력!이 선행이되어 출력되고
//        } while (number < 3); // 조건이 넘어간 while문은 수행 되지 않는다.
//
//        출력결과 : 4출력!

         // break(깨부시다)
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단!
//        int number = 0;
//        while (number < 3) {
//            number++;
//            if (number == 2) {
//                break;
//            }
//            System.out.println(number + "출력!");
//        }
//
//          출력결과 : 1출력!

//        for (int i=0; i<10; i++){
//            System.out.println("i:" + i);
//            if(i == 2){
//                break;
//            }
//            for (int j=0; j<10; j++){
//                System.out.println("j:" + j);
//                if(j == 2){
//                    break;
//                }
//            }
//        }
//
//
//
//  출력결과 :
//  i:0
//  j:0
//  j:1
//  j:2
//  i:1
//  j:0
//  j:1
//  j:2
//  i:2
        // continue
        int number = 0;
        while (number < 3){
            number++;
            if (number == 2){
                continue; //위 if문의 조건이 수행되면 수행하지않고 바로 하위 단을 실행한다.
            }
            System.out.println(number + "출력!");
        }
    }
}

//  출력결과 :
//  1출력!
//  3출력!