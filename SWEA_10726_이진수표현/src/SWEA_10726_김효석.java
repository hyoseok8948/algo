import java.util.Scanner;

public class SWEA_10726_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
	for(int tc = 1; tc <= 10; tc++) {
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String binM = Integer.toBinaryString(M);
		//System.out.println(binM);
		System.out.println(binM.substring(binM.length() - N)); 
		//binM.substring(binM.length() - N);
		int binN = 0;
		for(int i = 0; i < N ; i++) {
			binN += Math.pow(10, i);
		}
			System.out.println(binN);
			
			int binMst = Integer.parseInt(binM);
			
			if(binMst == binN) {
				System.out.println("ON");
			} else {
				System.out.println("OFF");
			}
			
		
			
			
			
			
		}//테케 종료
		
		

	}//메인 종료

}
