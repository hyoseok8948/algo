package day0909;

import java.util.Scanner;

public class pr9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int K = sc.nextInt();
			String input = sc.next();
			int N = input.length();
			
			int[] num = new int[N];
			for(int i = 0; i < N; i++) {
				num[i] = input.charAt(i) - '0';
			}
			
			int maxS = 0;
			int curS = 0;
			
			for(int i = 0; i < K; i++) {
				curS += num[i];
			}
			maxS = curS;
			
			for(int i = K; i < N; i++) {
				curS = curS + num[i] - num[i-K];
				
				if(curS > maxS) {
					maxS = curS;
				}
			}
			System.out.println("#" + tc + " " + maxS);
		}

	}

}
