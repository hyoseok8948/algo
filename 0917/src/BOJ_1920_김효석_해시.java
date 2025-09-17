import java.util.HashSet;
import java.util.Scanner;

public class BOJ_1920_김효석_해시 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		HashSet<Integer> A = new HashSet<>();
		
		for(int i = 0; i < N ; i++) {
			A.add(sc.nextInt());
		}
	
		int M = sc.nextInt();
		
		for(int i = 0; i < M ; i++) {
			int tmp = sc.nextInt();
			if(A.contains(tmp)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	
	
	}//main

}