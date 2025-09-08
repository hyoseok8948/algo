package 너비우선탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1868_지뢰찾기 {
	
	static int N;//배열의 크기
	static char[][] map; //지뢰가 들어간 맵
	static int[][] check; //숫자표시 & 저장배열
	static int min;//최솟값을 비교해 볼까?
	
	//8방 탐색 시계 방향
	static int[] dr = {-1,-1,0,1,1,1,0,-1};
	static int[] dc = {0,1,1,1,0,-1,-1,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc =1; tc <= testCase; tc++) {
			N = sc.nextInt();
			map = new char[N][N];
			check = new int[N][N];
			
			// 지뢰 배열 받기
			for(int i = 0; i < N; i++) {
				String input = sc.next();
				for(int j = 0; j < N; j++) {
					char ch = input.charAt(j);
					map[i][j] = ch;
					//System.out.print(map[i][j]);
				}
				//System.out.println();
			}//지뢰
			
			//현재칸 지뢰에 -1 넣기
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N ; j++) {
					if(map[i][j] == '*') {
						check[i][j] = -1;
						continue;
					}//지뢰칸은 -1 표시하고 건너뛴다.
					int mineCount = 0;
					//8방 탐색으로 주변 지뢰 세기
					for(int d = 0; d < 8; d++) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						
						if(nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == '*') {
							mineCount++;
						}
					}
					check[i][j] = mineCount;
				}
			}
			
			
			int click = 0;
			
			//주변에 지뢰가 없는(0)인 칸부터 클릭해서 BFS를 실행
			for(int i = 0; i < N; i++) {
				for(int j =0; j <N; j++) {
					//아직 방문하지 않은 0인 칸을 찾으면 클릭카운트를 증가시킨다.
					if(check[i][j] == 0) {
						click++;
						bfs(i,j);//연쇄반응
					}
				}
			}
			
			//BFS로 처리되지 않은 나머지 숫자 칸들을 클릭
			for(int i = 0; i< N; i++) {
				for(int j =0; j < N; j++) {
					if(check[i][j] > 0) {
						click++;
					}
				}
			}
			System.out.println(click);
		}//testCase
		

	}//Main
	
		//r, c를 시작으로 연쇄적으로 열리는 칸들을 처리하는 BFS
	
		public static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		
		
		//1. 처음 좌표를 집어 넣기
		q.add(new int[] {r,c});
		//시작점 체크에 카운트 넣기
		check[r][c] = -2;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int currR = curr[0]; //행
			int currC = curr[1]; //열
			
			//8방 탐색 실행
			for(int i = 0; i < 8; i++) {
				int nr = currR + dr[i];
				int nc = currC + dc[i];
				
				//1.범위 내 방문 X
				if(nr >= 0 && nr < N && nc >= 0 && nc < N && check[nr][nc] != -2) {
					//2. 이웃한 칸이 0이라면 큐에 추가하여 연쇄 반응을 이어간다.
					if(check[nr][nc] == 0) {
						q.add(new int[] {nr,nc});
					}
					//이웃한 칸들을 방문처리
					check[nr][nc] = -2;
				}
			}
		}
		}
	

}//Class
