package day0829;

import java.util.ArrayList;

public class 조합04_중복조홥 {

	static String[] 재료;
	
	static int N, R; // N:전체 재료의 수, R : 넣을 재료의 수
	public static void main(String[] args) {
		N = 4;
		R = 3;
		재료 = new String[] { "상추", "패티", "토마토", "치즈"};
	
		combcomb(0, new ArrayList<String>());
		
	
	}// main
	
	//idx ; 현재 판단할 재료
	//sel : 뽑은 재료들
	public static void combcomb(int idx, ArrayList<String> sel) {
		if(sel.size() == R ) {
			System.out.println(sel);
			return;
		}
		
		//재귀파트
		for(int i =idx; i <N; i++) {
			sel.add(재료[i]);//제료넣기
			combcomb(i, sel);//내려 보내서 판단
			sel.remove(sel.size()-1); //넣은재료 다시 뺴버리기
		}
	}
}
