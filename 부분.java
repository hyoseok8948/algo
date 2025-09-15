
import java.util.ArrayList;
import java.util.Scanner;

public class 부분 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int tc = 1; tc <= T; tc++) {
            String inputStr = sc.next();

            // --- 1. 음수를 고려하여 문자열을 숫자 리스트로 변환 ---
            // ※ 배열 대신 ArrayList를 사용하면 크기 걱정 없이 유연하게 추가할 수 있습니다.
            ArrayList<Integer> numsList = new ArrayList<>();
            for (int i = 0; i < inputStr.length(); i++) {
                char currentChar = inputStr.charAt(i);

                if (currentChar == '-') {
                    // '-' 다음 문자를 숫자로 변환하여 음수로 만듭니다.
                    // i+1 위치의 문자를 처리했으므로, 바깥쪽 for문에서 건너뛰도록 i를 증가시킵니다.
                    i++; 
                    int num = inputStr.charAt(i) - '0';
                    numsList.add(-num);
                } else {
                    // 일반 숫자는 양수로 변환하여 추가합니다.
                    numsList.add(currentChar - '0');
                }
            }
            
            // ArrayList를 int 배열로 변환 (알고리즘 적용을 위해)
            int[] nums = numsList.stream().mapToInt(i -> i).toArray();

            // --- 2. 최대 합을 만드는 부분 수열의 '개수' 찾기 (이전 코드와 동일) ---
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
            
            int maxCount = 0; 
            int currentStartIndex = 0;

            // nums 배열이 비어있을 경우 예외 처리
            if (nums.length == 0) {
                 System.out.println("#" + tc + " " + 0);
                 continue;
            }

            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxCount = (i - currentStartIndex) + 1; 
                }
                
                // 만약 모든 수가 음수일 경우, 가장 큰 단일 값의 길이는 1이 되어야 합니다.
                // 이 조건을 추가하여 maxSum이 갱신되지 않아도 단일 음수 값이 선택되도록 합니다.
                if (nums[i] > maxSum) {
                    maxSum = nums[i];
                    maxCount = 1;
                    // 단일 값이 더 큰 경우, 여기부터 새로운 시작으로 간주할 수 있습니다.
                    currentSum = maxSum; 
                    currentStartIndex = i;
                }


                if (currentSum < 0) {
                    currentSum = 0;
                    currentStartIndex = i + 1;
                }
            }
            
            System.out.println("#" + tc + " " + maxCount);
        }
	}

}
