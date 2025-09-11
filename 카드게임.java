import java.util.Arrays;
import java.util.Scanner;

public class 카드게임 {
	static int[] card1;
	static int win, lose;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			
			card1 = new int[10];
			//1부터 시작하는 카드 9장을 입력
			for(int i = 1; i < 10; i++) {
				card1[i] = sc.nextInt();
			}
			//1부터 시작하는
			boolean[] visited = new boolean[19];
			
			//카드1에 있는 녀석들을 방문처리
			for(int n : card1) {
				visited[n] = true;
			}
			
			//나머지 9숫자 배열
			int[] card2 = new int[9];
			//카드2에차례로 넣기 위한 임의의 
			int idx = 0;
			for(int i = 1; i <= 18; i++) {
				if(!visited[i]) {
					card2[idx++] = i;
				}
			}
			
			//System.out.println(Arrays.toString(card2));
			//승패 횟수 초기화
			win = 0;
			lose = 0;
			
			boolean[] visited2 = new boolean[9];
			int[] result = new int[9];
			mix(card2, result, visited2, 0);
			
			
			
			
		}//tc

	}//main
	
	public static void mix(int[] arr, int[] result, boolean[] visited, int depth) {
		//9개를 모두 뽑았다면 순열 완성
		if(depth == 9) {
			int kyuScore = 0;
			
			return;
		}
		
		for(int i = 0; i < 9; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[depth] = arr[i]; //현재 자리에 숫자 삽입
			    
			}
		}
	}

}
