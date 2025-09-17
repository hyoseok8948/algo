

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10815_김효석_이분탐색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] mycard = new int[N];
		for(int i = 0; i < N; i++) {
			mycard[i] = sc.nextInt();
		}
		
		//1.카드를 정렬
		Arrays.sort(mycard);
		
		int M = sc.nextInt();
		//StringBuilder 사용하여 출력 효율화
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M;i++) {
			int target = sc.nextInt();
			
			//2. 정렬된 mycard 배열에서 target을 이분 탐색으로 찾는다.
			//arrays.binarySearch는 찾으면 해당 인덱스/못찾으면 음수를 반환
			if(Arrays.binarySearch(mycard, target) >= 0) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		
		
		System.out.println(sb.toString());
	}

}
