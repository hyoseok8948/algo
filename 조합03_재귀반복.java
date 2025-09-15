package day0829;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 조합03_재귀반복 {
	static String[] 재료;
	static String[] sel; //뽑은  거 저장
	static int N, R; // N:전체 재료의 수, R : 넣을 재료의 수
	static List<String[]> result;
	public static void main(String[] args) {
		N = 4;
		R = 2;
		재료 = new String[] { "상추", "패티", "토마토", "치즈"};
		sel =new String[R];
		result = new ArrayList<>();
		
		
		combi(0,0);
		
		for(String[] combination : result) {
			System.out.println(Arrays.toString(combination));
		}
		
		// 결과를 전부 모아서 여기서 작업해야지 여기에서최댓값 뽑아야지..
	}//main
	
	public static void combi(int idx, int sidx) {
		//종료파트
		if(sidx == R) {
			//System.out.println(Arrays.toString(sel));
			//특정한 작업을 진행한다. 뽑은걸 가지고 작업을 할꺼야!
			result.add(sel.clone());//결과를 담은건데 왜 안나올까? 깊은복사라서
			
			//String[] tmp = new String[R];있습니다잉~~
			return;
		}
		
		//재귀파트 sidx = 0 >> idx는 0 ,1 ,2  
		//반복문을 통해 내가 할 수 있는 범위 만큼만 돌릴거
		for(int i = idx; i<=N-R+sidx; i++) {
			sel[sidx] = 재료[i];
			combi(i+1, sidx+1);
		}
		
		
		
		
		
	}

}
