import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	
	for(int tc= 1; tc <= T; tc++) {
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//1. (1<<N)은 2^N을 의미. 즉 1뒤에 0이 N개 붙은 이진수
		//2. 위에서 1을 뺴면 1이 N이 생긴 이진수가 만들어짐(마스크)
		
		int mask = ( 1<< N ) -1;
		
		//M의 마지막 N비트와 마스크를 &연산한 결과가 마스크와 같은지 확인
		if((M & mask) == mask) {
			System.out.println("#" + tc + " ON");
		} else {
			System.out.println("#" + tc + " OFF");
		}
	}

	}

}
