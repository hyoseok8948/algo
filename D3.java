import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			String input = sc.next();
			int N = input.length();
			int K = sc.nextInt();
			
			int[] nums = new int[N];
			for(int i = 0; i < N; i++) {
				nums[i] = input.charAt(i) - '0';
			}
			
			int maxS = Integer.MIN_VALUE;
			int curS = 0;
			
			for(int i = 0; i < K; i++) {
				curS += nums[i];
			}
			
			maxS = curS;
			
			for(int i = K; i < N; i++) {
				curS = curS + nums[i] - nums[i-K];
				if(curS > maxS) {
					maxS = curS;
				}
			}
			System.out.println("#" + tc + " " + maxS);
		}
	}

}
