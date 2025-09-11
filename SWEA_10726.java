import java.util.Scanner;

public class SWEA_10726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			
			if(((1 << N) - 1 & M) == ((1 << N) -1)) {
				System.out.println("#" + tc + " " + "ON");
			} else {
				System.out.println("#" + tc + " " + "OFF");
			}
			
			
		}

	}

}
