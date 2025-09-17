
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_10815_김효석_해시셋 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//1. 내 카드 저장 헤시셋
		HashSet<Integer> mycard = new HashSet<>();
		for(int i = 0; i < N ; i++) {
			mycard.add(sc.nextInt());
		}
		
		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int target = sc.nextInt();
			
			//2.hashSet에 target이 있는지 확인
			if(mycard.contains(target)) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		
		
		
		System.out.println(sb.toString());
	}

}
