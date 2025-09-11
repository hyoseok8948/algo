package 월말평가;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo2_스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        // 문제 조건이 테트리스처럼 사이에 있는게 터지면
        // 양옆에 있는게 다시 뭉치고 -> 또 연속하는게 있으면 터뜨려라
        // 이런 문제면 이걸로 풀어야함
        
        for (int t = 1; t <= tc; t++) {
            String str = sc.next();

            // 결과를 담을 List (스택처럼 사용)
            List<Character> list = new ArrayList<>();

            // 문자열의 각 문자를 순회
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                // 스택이 비어있지 않고, 마지막 문자가 현재 문자와 같다면
                if (!list.isEmpty() && list.get(list.size() - 1) == currentChar) {
                    // 마지막 문자를 제거 (연속된 문자 제거)
                    list.remove(list.size() - 1);
                } else {
                    // 그렇지 않다면 현재 문자를 스택에 추가
                    list.add(currentChar);
                }
            }

            // List에 남은 문자들을 합쳐서 최종 문자열 생성
            String ans = "";
            for (char c : list) {
                ans += c;
            }

            // "빈문자열이면 뭐를 출력해라" <= 이런 조건 있을수도 있음
            System.out.println("#" + t + " " + ans);
        }
        sc.close(); // 스캐너를 닫아주는 것이 좋습니다.
    }
}