package day0829;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 연습2 {
	
	static int N; //재료
	static int R; //뽑는수
	
	static String[] 재료; //원본 데이터 배열
	static String[] sel; //선택된 원소를 임시 저장할 배열(하나의 조합)
	
	static List<String[]> resultList; //최종 리스트
	
	public static void main(String[] args) {
		//1. 문제 정의 4개의 재료 중 2개 뽑기
		재료 = new String[] {"상추","패티","토마토","치즈"};
		N = 재료.length;
		R = 2;
		
		//2. 조합을 만들기 위한 작업 공간 및 결과 저장소 초기화
		sel = new String[R];
		resultList = new ArrayList<>();
		
		//3. 조합 생성을 위한 재귀 함수 시작
		combination(0,0);
		
		//4. 최종결과 출력
		for(String[] combination : resultList) {
			System.out.println(Arrays.toString(combination));
		}

	}//main

	public static void combination(int idx, int sidx) {
		//종료 조건(R개를 모두 선택했을 경우)
		if(sidx == R) {
			//현재 조합을 결과 리스트에 추가
			//배열의 복사본을 추가해야함
			resultList.add(sel.clone());
			return;
		}
		
		//재귀 호출
		for(int i = idx; i < N; i++) {
			//1.현재 재료(i번째)를 선택하여 sel 배열에 담는다.
			sel[sidx] = 재료[i];
			
			//2.다음 재료를 선택하기 위해 재귀 호출
			//sel 배열의 다음칸을 채워야 함
			combination(i+1, sidx +1);
			
		}
		
		
		
		
	}
		





}//class
