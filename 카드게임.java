import java.util.Arrays;
import java.util.Scanner;

public class 카드게임 {
	static int[] card1;
	static int win, lose;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			
			card1 = new int[9];
			//시작하는 카드 9장을 입력
			for(int i = 0; i < 9; i++) {
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
			
			//카드 생성하고 찾기
			boolean[] visited2 = new boolean[9];
			int[] result = new int[9];
			mix(card2, result, visited2, 0);
			
			
			System.out.println("#" + tc + " " + win + " " + lose);
			
		}//tc

	}//main
	
	public static void mix(int[] arr, int[] result, boolean[] visited, int depth) {
		//9개를 모두 뽑았다면 순열 완성(종료조건) 종료시 점수계산 후 리턴
		if(depth == 9) {
			//각자의 점수
			int score1 = 0;
			int score2 = 0;
			
			for(int i = 0; i < 9; i++) {
				if(card1[i] > result[i]) {
					score1 += card1[i] + result[i];
				} else {
					score2 += card1[i] + result[i];
				}
			}
			//최종비교
			if(score1 > score2) {
				win++;
			} else {
				lose++;
			}
			return;
			
		}
		//백트래킹 > 하나의 경로를 끝까지 갔다가 온다.
		for(int i = 0; i < 9; i++) {
			//가본적 없음 > 간다고 표시
			if(!visited[i]) {
				visited[i] = true;
				//탐색경로에 i번째 길을 기록
				result[depth] = arr[i]; //현재 자리에 숫자 삽입
				//재귀 이쪽 뎁스(탐색경로 +1로 간다.
			    mix(arr, result, visited, depth + 1);
			    //끝나면 안갔다고 처리(사용중 X) >> 이게 있어야 다른 경로로 찾아감
			    visited[i] = false;
			}
		}
	}

}
