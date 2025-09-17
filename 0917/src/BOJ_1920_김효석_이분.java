import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1920_김효석_이분 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int N = sc.nextInt();
		 
		 int[] A = new int[N];
		 
		 for(int i = 0; i < N; i++) {
			 A[i] = sc.nextInt();
		 }
		 
		 Arrays.sort(A);
		 //System.out.println(Arrays.toString(A));
		 
		 int M = sc.nextInt();
		 
		 for(int i = 0; i < M; i++) {
			 int find = sc.nextInt();
			 if(Arrays.binarySearch(A, find) >= 0) {
				 System.out.println(1);
			 } else {
				 System.out.println(0);
			 }
		 }
		 
		 
		 
		 
		 
		 
	}

}