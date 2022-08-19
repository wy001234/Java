package ch04;

import java.util.Scanner;

public class p94 {
	public static void main(String[] args) {
		System.out.print("나이 입력");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("입력한 나이 :" + number);
		
		if(number >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}
}
