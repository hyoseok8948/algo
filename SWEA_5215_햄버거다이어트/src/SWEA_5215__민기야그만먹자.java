import java.util.Scanner;

public class SWEA_5215__민기야그만먹자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			//재료의 수
			int N = sc.nextInt();
			//최대 칼로리
			int L = sc.nextInt();
			
			//각각을 받을 배열 선언
			int[] ingScore = new int[N];
			int[] calScore = new int[N];
			
			for(int i = 0; i < N; i++) {
				//재료의 점수
				int score = sc.nextInt();
				ingScore[i] = score;
				//재료의 칼로리
				int cal = sc.nextInt();
				calScore[i] = cal;
			}//점수의 배열화
			
		
			int maxScore = 0;
			
			for(int j = 0; j < (1 << N); j++) {
				int ingSum = 0;
				int calSum = 0;
				for(int k =0; k < N; k++) {
					if((j & (1<<k)) != 0) {
						ingSum += ingScore[k];
						calSum += calScore[k];
						
						
					}
					
				}
				
				if(calSum < L && ingSum > maxScore) {
					maxScore = ingSum;
				}
				
				
				
			}//최고 점수 구하기
			System.out.println("#" + tc + " " + maxScore);
			
			
			
		}//테케 종료
		
		
		
		
		
		
		
		
		
		
		

	}//메인 종료

}
