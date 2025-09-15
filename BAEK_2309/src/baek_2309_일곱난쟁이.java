import java.util.Arrays;
import java.util.Scanner;

public class baek_2309_일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		//System.out.println(sum);
		
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		outer : for(int i = 0; i < 9-1; i++) {
			for(int j = i + 1; j < 9; j++) {
				if((sum - arr[i] -arr[j]) == 100) {
					arr[i] = 0;
					arr[j] = 0;
					break outer;
				}
			}
		}
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] != 0 ) {
				System.out.println(arr[i]);
			}
		}
	
	
	
	
	
	
	
	
	
	}

}
