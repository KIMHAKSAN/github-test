package array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Arr09 {
    public static void main(String[] args) {
//        자료구조 요리 레시피 메모장 만들기
//        입력값 :
//
//        저장할 자료구조명을 입력합니다. (List / Set / Map)
//        내가 좋아하는 요리 제목을 먼저 입력합니다.
//        이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
//        입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
        Scanner sc = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>(); // 문자열을 저장할 수 있는 Set

        System.out.print("제목 입력 : ");
        String title = sc.nextLine();
        System.out.println("제목: " + title);

        System.out.println("추가할 요리 레시피를 한 문장씩 입력해 주세요 ('끝' 입력 시 종료):");

        while (true) {
            String recipe = sc.nextLine(); // 한 줄 입력받기
            if (recipe.equals("끝")) {
                break; // "끝" 입력 시 종료
            }
            stringSet.add(recipe); // Set에 입력받은 문자열 추가
        }

        System.out.println("저장된 요리 레시피:");
        System.out.println(stringSet); // Set에 저장된 문자열 출력
    }
}

