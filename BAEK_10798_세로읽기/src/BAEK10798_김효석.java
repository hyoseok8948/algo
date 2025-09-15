import java.util.Scanner;

public class BAEK10798_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arrC = new char[5][];
		
		int N = 0;
		for(int i = 0; i < 5; i++) {
			String sentence = sc.next();
			N = sentence.length();
			for(int j = 0; j < N; j++) {
				arrC[i][j] = sentence.charAt(j);
			}
		}//배열 입력
		
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5; i++) {
				if(arrC[i][j] != '\0') {
				sb.append(arrC[i][j]);
				}
				
				
			}
		}//sb append문 종료
		
		System.out.print(sb);

	}//메인

}
