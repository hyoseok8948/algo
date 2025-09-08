package test;

import java.util.Scanner;

public class 연속 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        for (int tc = 1; tc <= T; tc++) {
	            String input = sc.next();
	            String result = solve(input);
	            System.out.println("#" + tc + " " + result);
	        }
	        sc.close();
	    }


	 public static String solve(String s) {
	        for (int i = 0; i < s.length() - 1; i++) {
	            // 연속된 문자를 찾으면
	            if (s.charAt(i) == s.charAt(i+1)) {
	                // 해당 문자를 제외한 나머지 문자열로 재귀 호출
	                String nextString = s.substring(0, i) + s.substring(i + 2);
	                return solve(nextString); // 재귀적으로 다시 탐색
	            }
	        }
	        // 더 이상 제거할 문자가 없으면 그대로 반환
	        return s;
	    }

}
