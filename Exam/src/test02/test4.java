package test02;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j =n-1; j > i ; j--) {
				System.out.print("☆");
			}
			for (int j= 0; j < i * 2 + 1; j++) {
				System.out.print("★");
			}
			for(int j= n-1; j>i; j--) {
				System.out.print("☆");
			
			};
			System.out.println("\n");
		}
		
	}
}
