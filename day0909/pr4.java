package day0909;

import java.util.ArrayList;
import java.util.Scanner;

public class pr4 {

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
					numList.add(-num);
				}else {
					numList.add(input.charAt(i)-'0');
				}
			}
			
			int[] num = numList.stream().mapToInt(i -> i).toArray();
			
			int maxS = Integer.MIN_VALUE;
			int maxC = 0;
			int curS = 0;
			int start = 0;
			
			if(num.length == 0) {
				System.out.println("#" + tc + " " + 0);
				continue;
			}
			
			for (int i = 0; i < num.length; i++) {
			    // 1. 현재 숫자를 더했을 때 음수가 되는 등 더 이어가는 게 손해라면,
			    //    현재 위치에서 새로 시작하는 것이 낫다.
			    if (curS + num[i] < num[i]) {
			        curS = num[i];
			        start = i;
			    } else {
			        // 이어가는 게 이득이라면 계속 더해준다.
			        curS += num[i];
			    }
			    
			    // 2. 위에서 결정된 현재 부분합(curS)이 전체 최대합(maxS)보다 크다면 갱신한다.
			    if (curS > maxS) {
			        maxS = curS;
			        maxC = (i - start) + 1;
			    }
			}
			
			System.out.println("#" + tc + " " + maxC);
		}
	}

}
