package ch04;

import java.util.Scanner;

public class p105 {
	public static void main(String[] args) {
		System.out.println("메달 색을 입력해주세요.");
		Scanner sc= new Scanner(System.in);
		String medal = sc.next();
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}
}
