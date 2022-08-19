package ch04;

import java.util.Scanner;

public class p97 {
	public static void main(String[] args) {
		System.out.print("나이 입력");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int charge;
		
		if(age< 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age<14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는"+charge+"원입니다.");
		
	}
}
