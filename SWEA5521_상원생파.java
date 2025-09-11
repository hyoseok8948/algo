import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SWEA5521_상원생파 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt(); //정점의 개수 
			int M = sc.nextInt(); //간선의 개수
			
			List<Integer>[] adjList = new ArrayList[N+1];
			
			for(int i = 1; i < N+1; i++) {
				adjList[i] = new ArrayList<>();
			}
			
			//친구간선 등록하기
			for(int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				//무향 
				adjList[a].add(b);
				adjList[b].add(a);
			}//for
			
			//결과를 더할 sum
			int count = 0;
			boolean[] realF  = new boolean[N+1];
			realF[1] = true; //자기 자신은 제외
			
			//상원이의 친구는 1번의 친구
			for(int F : adjList[1]) {
				//아직초대X라면 초대
				if(!realF[F]) {
					realF[F] = true;
					count++;
				}
			}
			//상원이의 친구를 구한다.
			for(int F : adjList[1]) {
				//친구의 친구를 구한다.
				for(int FF : adjList[F]) {
					if(!realF[FF]) {
						realF[FF] = true;
						count++;
					}
				}
			}
			
			System.out.println("#" + tc + " " + count);
			
			
			
			//System.out.println(Arrays.toString(adjList));
			
			
			
			
			
			
			
			
			
			
			
			
		}//testCase 

	}//main

}
