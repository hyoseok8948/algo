package day0915;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10815_김효석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] mycard = new int[N];
		for(int i = 0; i < N; i++) {
			mycard[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(mycard));
		
		
		int M = sc.nextInt();
		int[] find = new int[M];
		for(int i = 0; i < M; i++) {
			find[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(find));
		int[] answer = new int[M];
		//System.out.println(Arrays.toString(answer));
		for(int i =0; i< N; i++) {
			int my = mycard[i];
			for(int j =0; j < M; j++) {
			if(find[j]==my) {
				answer[j] = 1;
			}
			}
		}
		
		for(int j = 0; j < M; j++) {
			System.out.print(answer[j] + " ");
		}
	}//main

}
