package day0829;

import java.util.Arrays;

public class 조합01_재귀 {
	static String[] 재료;
	static String[] sel; //뽑은  거 저장
	static int N, R; // N:전체 재료의 수, R : 넣을 재료의 수
	public static void main(String[] args) {
		N = 4;
		R = 2;
		재료 = new String[] { "상추", "패티", "토마토", "치즈"};
		sel =new String[R];
		
		
		
		combi(0,0);
		
		
		
		
		
	}//main
	
	//idx : 이번에 고려할 재료의 인덱스
	//sidx : 뽑은 재료의 인덱스
	public static void combi(int idx, int sidx) {
		//종료파트
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		else if(idx >= N) {
			//더이상 고려할 재료가 없다.
			return;
		}
		
		
		//재귀파트
		//현재 재료를 뽑은 경우
		sel[sidx] = 재료[idx];
		combi(idx+1,sidx+1);
		
		//현재 재료를 뽑지 않은 경우
		sel[sidx] = null; //덮어버리기 때문에 필요하지 않을 수도 있다.
		combi(idx+1, sidx);
	}

}
