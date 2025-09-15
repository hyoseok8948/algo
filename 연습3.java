package day0829;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 연습3 {

	static int N; // 재료의 수(배열의 길이)
	static int R; // 선택하는 수

	static String[] ingred; // 원본
	static String[] sel; // 임시저장

	static List<String[]> resultList;// 문장배열을 값으로 받는 결과 리스트

	public static void main(String[] args) {

	//1.문제 정의 4개중 3개 뽑기
		
		ingred = new String[] {"상추","패티","토마토","치즈"};
		N = ingred.length;
		R = 3;
		
		//2. 초기화
		sel = new String[R];
		resultList = new ArrayList<>();
		
		//3. 재귀 시작
		combination(0,0);
		
		//4. 결과 출력
		
		for(String[] combination : resultList) {
			System.out.println(Arrays.toString(combination));
		}
	
	
	
	
	
	
	
	}// main

	public static void combination(int idx, int sidx) {

		// 종료문
		if (sidx == R) {

			// sel 배열을 리스트에 저장 *복사본일 것
			resultList.add(sel.clone());

			// 다시 돌아가
			return;

		}

		// 재귀문
		for (int i = idx; i < N; i++) {
			// 담기
			sel[sidx] = ingred[i];

			// 다음 재료 선택위해 다시 호출
			combination(i + 1, sidx + 1);
		}

	}// 콤비

}// class
