import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1952_수영장2 {

	static int months = 12;
	static int[] swim;
	static int priceD;
	static int priceM;
	static int price3;
	static int priceY;
	static int min_price;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int tc =1; tc <= testCase; tc++) {
			
			priceD = sc.nextInt();
			priceM = sc.nextInt();
			price3 = sc.nextInt();
			priceY = sc.nextInt();
			
			min_price = priceY;
			
			swim = new int[months+1];
			
			for(int i = 1; i <= months ; i++) {
				swim[i] = sc.nextInt();
			}
				System.out.println(Arrays.toString(swim));
			
			dfs(1,0);
			
			System.out.println(min_price);
			
			
			
			
			
		}
	}//main
	
	public static void dfs(int month, int cost) {
		//중간에 나가는 조건
		if(cost >= min_price) {
			return;
		}
		//종료조건
		if(month > months) {
			if(cost < min_price) {
				min_price = cost;
			}
			return;
		}
		//재귀
		if(swim[month] > 0) {
			
			//1. 1일권
			dfs(month+1, cost + (swim[months] * priceD));
			
			//2. 1달권
			dfs(month+1, cost + priceM);
			
			//3. 3달권
			dfs(month+3, cost + price3);
			
			
			
		} else {
			dfs(month+1, cost);
		}
		
	}

}
