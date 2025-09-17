import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3273_김효석_해시셋 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		HashSet<Integer> num = new HashSet<>();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			//pairNum은 arr[i]의 짝궁이 될 수 있는 숫자 arr[i] + pair == target
			int pairNum = target - arr[i];
			//넣어둔 숫자중에서 짝을 찾아서 중복이 안생긴다. 해시셋에 넣어두기도 하고
			if(num.contains(pairNum)) {
				count++;
			}
			//작업이 끝나면 지금 숫자 넣어두기
			num.add(arr[i]);
		}
		System.out.println(count);

	}

}
