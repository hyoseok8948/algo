package day0915;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10815_김효석시간 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] my = new int[sc.nextInt()];
		for(int i = 0; i < my.length; i++) {
			my[i] = sc.nextInt();
		}
		int[] find = new int[sc.nextInt()];
		for(int i = 0; i < find.length; i++) {
			find[i] = sc.nextInt();			
		}
		
		int[] ans = new int[find.length];
		for(int i = 0; i < my.length; i++) {
			int tmp = my[i];
			for(int j = 0; j < my.length; j++) {
				if(find[j] == tmp) {
					ans[j] = 1;
				} 
			}
		}
		
		for(int i = 0; i < find.length; i++) {
			System.out.println(find[i]);
		}
		
		
	}

}
