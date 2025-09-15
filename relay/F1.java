package relay;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt(); // 테스트 케이스 수

	        for (int tc = 1; tc <= T; tc++) {
	            int N = sc.nextInt(); // 배열의 크기
	            int S = sc.nextInt(); // 목표값
	            int[] nums = new int[N];
	            for (int i = 0; i < N; i++) {
	                nums[i] = sc.nextInt();
	            }

	           
	            int minLength = Integer.MAX_VALUE; // 가장 짧은 길이를 저장할 변수, 최대값으로 초기화
	            int currentSum = 0;                // 현재 윈도우의 합
	            int windowStart = 0;               // 윈도우의 시작점(왼쪽 포인터)

	            // windowEnd는 윈도우의 끝점(오른쪽 포인터)
	            for (int windowEnd = 0; windowEnd < N; windowEnd++) {
	                // 1. 윈도우를 오른쪽으로 확장하며 합을 구함
	                currentSum += nums[windowEnd];

	                // 2. 현재 윈도우의 합이 목표값(S) 이상이면, 길이를 갱신하고 윈도우를 왼쪽에서 축소
	                while (currentSum >= S) {
	                    // 현재 길이를 계산하고, 기존의 최소 길이보다 짧으면 갱신
	                    int currentLength = (windowEnd - windowStart) + 1;
	                    minLength = Math.min(minLength, currentLength);
	                    
	                    // 윈도우를 왼쪽에서 축소 (시작점의 값을 빼고, 시작점을 오른쪽으로 한 칸 이동)
	                    currentSum -= nums[windowStart];
	                    windowStart++;
	                }
	            }

	            // 만약 minLength가 한 번도 갱신되지 않았다면, 조건을 만족하는 부분 배열이 없는 것
	            int result = (minLength == Integer.MAX_VALUE) ? 0 : minLength;

	            System.out.println("#" + tc + " " + result);
	        }
	        sc.close();
	    }
	}