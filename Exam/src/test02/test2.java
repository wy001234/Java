package test02;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = n; j>i; j-- ) {
				System.out.print(" ");
			};
			for(int k =1; k<=i; k++) {
				System.out.print("★");
			}
			System.out.println(" ");
		};
		
	} 
}
