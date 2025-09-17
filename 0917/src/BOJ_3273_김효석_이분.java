import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3273_김효석_이분 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int target = sc.nextInt();
		int count = 0;
		
		for(int i = 0 ; i < N ; i++) {
			int pair = target - arr[i];
			//범위는 i+1 ~ N 으로 구하는 방법 (i+1에서 찾으니까 중복되지 않는다.)
			if(Arrays.binarySearch(arr, i+1, N, pair) >= 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
