package 월말평가;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Algo2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		// 문제에서 조건이 처음에 연속하는 애들만 제거하고
		// 나머지 애들을 찾는거라면 이 코드
		// 테스트케이스 예시: ARRAAA 넣어보면 이해될거임
		for(int t = 1; t <= tc; t++) {
			String str = sc.next();
			
			char[] charArr = new char[str.length()];
			
			// 문자열 하나씩 잘라서 list에 저장
			for(int i = 0; i < str.length(); i++) {
				charArr[i] = str.charAt(i);
			}
			
			// 반복문을 돌면서 list에 있는 연속된 문자열 지우기
			// i와 i+1을 비교할 것이기 때문에 charArr.length - 1보다 작을때까지 반복문 순회
			// Ex. charArr.length == 4면 배열의 인덱스 값을 0~3
			//	   이때 i와 i+1을 비교하려면 i는 2까지만 가야함
			
			// charArr[i]와 charArr[i+1]이 같으면 둘다 '0'으로 바꿔줌
			// charArr[i]가 '0'이거나 charArr[i]와 charArr[i+1]이 다르면 그냥 넘어감
			
			for(int i = 0; i < charArr.length - 1; i++) {
				if(charArr[i] == '0') continue;
				
				if(charArr[i] == charArr[i+1]) {
					charArr[i] = '0';
					charArr[i+1] = '0';
				}
			}
			
			String ans = "";
			
			for(int i = 0; i < charArr.length; i++) {
				if(charArr[i] != '0') ans += charArr[i];
			}
			
			System.out.println(Arrays.toString(charArr));
			
			System.out.println("#" + t + " " + ans);
		}
	}
}
