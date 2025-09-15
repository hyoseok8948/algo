package relay;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc =1; tc <= T; tc++) {
			String input = sc.next();
			
			StringBuilder sb = new StringBuilder(input);
			
			while(true) {
				boolean check = false; // 중복찾기
				
				for(int i = 0; i < sb.length(); i++) {
					int j = i;
					while(j + 1 < sb.length() && sb.charAt(j+1) == sb.charAt(i)) {
						j++;
					}
					if(j > i) {
						sb.delete(i, j+1);
						check = true;
						break;
					}
				}
				if(!check) {
					break;
				}
			}
			System.out.println("#" + tc + " " + sb.toString());
		}

	}

}
