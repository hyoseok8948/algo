package day0829;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 연습4 {
	
	static int N; //배열의 길이 & 재료의 수
	static int R; //선택 갯수
	
	static String[] ingred;//원본
	static String[] sel;//임시
	
	static List<String[]> resultList; //결과
	
	public static void main(String[] args) {
		
		//1.문제 생성 4개 중 2개 뽑기
		
		ingred = new String[] {"감자", "고구마", "양배추", "계란"};
		N = ingred.length;
		R = 2;
		sel = new String[R];
		
		resultList = new ArrayList<>();
		
		//2. 재귀문 실행
		
		combination(0,0);
		
		//3. 출력하기
		for(String[] combination : resultList) {
		System.out.println(Arrays.toString(combination));
		}
		
		
		
		
		
		
		
		
		
	}//main

	//idx는 재료에서 선택 sidx는 배열위치
	public static void combination(int idx, int sidx) {
	
		//종료
		if(sidx == R) {
			//결과리스트에 임시배열의 클론을 집어놓고 리턴
			resultList.add(sel.clone());
			
			return;
		}
		
		//재귀문 idx에서 출발
		for(int i = idx; i < N ; i++) {
			 sel[sidx] = ingred[i];
			 
			 //다음 넣을 거 찾자
			 combination(i+1, sidx+1);
			
		}
		
		
	}//comb

}//class
