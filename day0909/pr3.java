package day0909;

import java.util.ArrayList;
import java.util.Scanner;

public class pr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			String input = sc.next();
			ArrayList<Integer> numList = new ArrayList<>();
			for(int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				
				if(ch == '-') {
					i++;
					int num = input.charAt(i+1) - '0';
					numList.add(-num);
				} else {
					numList.add(ch - '0');
				}
			}//for
			
			int[] num = numList.stream().mapToInt(i -> i).toArray();
			
			int maxSum = Integer.MIN_VALUE;
			int current = 0;
			int maxCount = 0;
			int start = 0;
			
			if(num.length == 0) {
				System.out.println("#" + tc + " " + 0);
				continue;
			}
			
			for(int i = 0; i < num.length; i++) {
				current += num[i];
				
				if(current > maxSum) {
					maxSum = current;
					maxCount = (i-start) + 1;
				}
				if(num[i] > maxSum) {
					maxSum = num[i];
					maxCount = 1;
					current = maxSum;
					start = i;
				}
				if(current < 0) {
					current = 0;
					start = i+1;
				}
			}
		 System.out.println("#" + tc + " " + maxCount);
		}//tc

	}

}
