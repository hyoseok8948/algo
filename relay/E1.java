package relay;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String input = sc.next();
            
            // 문자열을 쉽게 수정하기 위해 StringBuilder 사용
            StringBuilder sb = new StringBuilder(input);

            // 더 이상 제거할 중복이 없을 때까지 계속 반복
            while (true) {
                boolean foundDuplicates = false; // 이번 회차에 중복을 찾았는지 여부
                
                // 문자열을 순회하며 2개 이상 연속된 구간 찾기
                for (int i = 0; i < sb.length(); i++) {
                    int j = i;
                    // 현재 문자와 동일한 문자가 끝나는 지점(j)을 찾음
                    while (j + 1 < sb.length() && sb.charAt(j + 1) == sb.charAt(i)) {
                        j++;
                 }

                    // i부터 j까지의 길이가 2 이상이면(중복 구간이면)
                    if (j > i) {
                        // 해당 구간을 삭제
                        sb.delete(i, j + 1);
                        foundDuplicates = true;
                        // 삭제 후에는 처음부터 다시 검사해야 하므로 break
                        break; 
                    }
                }

                // 이번 회차에 한 번도 중복을 찾지 못했다면 루프 탈출
                if (!foundDuplicates) {
                    break;
                }
            }
            
            System.out.println("#" + tc + " " + sb.toString());
        }
        sc.close();
    }
}