package Ch09;

import java.util.Scanner;

public class add2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,sum;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x = sc.nextInt();
		

		System.out.print("두번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		sum = x+y;
		System.out.println(sum);
	}
}
