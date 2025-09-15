import java.util.Scanner;

public class SWEA_1952_수영장 {
	static int V = 12;
	static int[] swim;
	static int priceD;
	static int priceM;
	static int price3;
	static int priceY;
	static int min_cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {

			priceD = sc.nextInt();
			priceM = sc.nextInt();
			price3 = sc.nextInt();
			priceY = sc.nextInt();
			min_cost = priceY;

			swim = new int[V + 1];
			for (int i = 1; i <= 12; i++) {
				swim[i] = sc.nextInt();
			}

			// 1월 0원으로 dfs탐색 시작
			dfs(1, 0);
			
			//탐색 후 출력
			System.out.println("#" + tc + " " + min_cost);

		} // 테스트 케이스

	}// 메인

	public static void dfs(int month, int cost) {
		
		//무효
		if(cost >= min_cost) {
			return;
		}
		
		//종료
		//12월을 넘어 13월이 되면 재귀를 종료
		if(month > 12) {
			//현재 경로의 비용이 최솟값보다 작으면 갱신
			if(cost < min_cost) {
				min_cost = cost;
							}
			return;
		}
		
		//
		if(swim[month] >0) {
			//선택 1 : 1일권 이용(month +1) + 비용을 D만큼 추가
			dfs(month + 1, cost +(swim[month] * priceD));
			
			//선택 2 : 1달권으로 현재 달을 이용(month +1)
			dfs(month + 1, cost + priceM);
			
			//선택 3 : 3달권으로 현재 달부터 이용하고, 3달 뒤로 넘어감
			dfs(month + 3, cost + price3);
		}
		else {
			//이용 계획이 없는 경우(비용 추가 없이 다음 달로)
			dfs(month + 1, cost);
		}
	}

}
