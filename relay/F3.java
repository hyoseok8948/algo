package relay;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int[] nums = new int[N];
			for(int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}
			
			int minL = Integer.MAX_VALUE;
			int curS = 0;
			int start = 0;
			
			for(int end =0; end < N; end++) {
				curS += nums[end];
				
				while(curS >= S) {
					int curL = (end-start) + 1;
					minL = Math.min(minL, curL);
					
					curS -= nums[start];
					start++;
				}
			}
			int result = (minL == Integer.MAX_VALUE) ? 0 : minL;
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
