package day0909;

import java.util.ArrayList;
import java.util.Scanner;

public class 부분연습1 {

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
					int num = input.charAt(i)-'0';
					numList.add(num);
				} else {
					numList.add(input.charAt(i)-'0');
				}
			}
			int[] num = numList.stream().mapToInt(i -> i).toArray();
			
			int maxS = Integer.MIN_VALUE;
			int maxC = 0;
			int curS = 0;
			int start = 0;
			
			for(int i =0; i < num.length; i++) {
				if(curS + num[i] < num[i]) {
					curS = num[i];
					start = i;
					
				} else {
					curS += num[i];
				}
				
				if(curS > maxS) {
					maxS = curS; 
					maxC = (i-start) + 1;
				}
			}
			
			System.out.println("#" + tc + " " + maxC);
		}

	}

}
