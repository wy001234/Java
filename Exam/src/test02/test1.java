package test02;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		System.out.print("넣을 숫자를 입력하세요 :");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}