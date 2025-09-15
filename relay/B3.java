package relay;

import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			String input = sc.next();
			
			String result = solve(input);
			
			System.out.println("#" + tc + " " + result);
		}
	}
	static String solve(String s) {
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				String nextString = s.substring(0,i) + s.substring(i+2);
				return solve(nextString);
			}
		}
		return s;
	}
}
