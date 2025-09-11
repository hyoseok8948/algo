package 월말평가;

import java.util.Scanner;

public class Algo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 입력 t개 들어온다고 가정
		for(int tc = 1; tc <= t; tc++) {
			
			// 숫자를 입력으로 주지만 한글자씩 떼서 계산해야 하기 때문에
			// String으로 입력받고 -> char 형으로 하나씩 뗌
			String strNum = sc.next();
			
			// 입력받은 숫자를 char형 배열로 만듬(toCharArray() 사용) 
			char[] charArr = strNum.toCharArray();
			
			// 정답 변수
			int ans = 0;
			// charArr 전체 순회하면서 더하기
			// 방법 1 ~ 방법 3 중에 편한거 쓰세요
			for(int i = 0; i < charArr.length; i++) {
				// 방법 1. Character.getNumericValue() <- char를 int로 바꿔주는 함수
				ans += Character.getNumericValue(charArr[i]);
				
//				// 방법 2. char - '0'
//				// char형은 아스키코드 값이기 때문에 char형으로 표현된 숫자에 0의 아스키 코드 값을
//				// 빼주면 해당 숫자가 됨
//				ans += charArr[i] - '0';
//				
//				// 방법 3. 강제 형변환
//				ans += (int)charArr[i];
			}
			
			System.out.println("#" + tc + " " + ans);
		}
	}
	
}
