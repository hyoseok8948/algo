import java.util.Scanner;

public class SWEA_8275_햄스터 {
	
	public static int N;
	public static int X;
	public static int M;
	public static int l;
	public static int r;
	public static int s;
	public static int[] hamster;
	public static int[] ham;
	
	public static void main(String[] args) {		
	Scanner sc = new Scanner(System.in);	
	int testCase = sc.nextInt();
	
	for(int tc = 1; tc <= testCase; tc++) {
		int N = sc.nextInt();
		int X = sc.nextInt();
		int M = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		
		
		hamster = new int[N+1];
		
		
		
		
		
	}//testCase

	}//main

	public static void dfs(int box, int hams) {
		
		//1. 중간에 멈추는 조건
		if(ham[box + 1] <= ham[box]) {
			return;
		}
		if(hams >= s) {
			return;
		}
		
		//2. 종료조건
		if(box == N+1) {
			if()
			
		}
		
		//재귀조건
		for(int i = 0; i <= X; i++) {
			ham[box] = i;
			dfs(box +1, hams);
		}
		
		
		
		
		
	}
	
	
	
}
