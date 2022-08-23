package dice;

import java.util.Scanner;

public class _01 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number :");
		int a = sc.nextInt();
		System.out.print("result:");
		System.out.print(ints(a));
		
	}
	
	public static int ints(int a) {
		String str1 = Integer.toString(a);
		String str2 = "";
		for(int i = str1.length(); i>0; i++) {
			str2 += str1.substring(i-1,i);
		}
		
		int result = Integer.parseInt(str2);
			return result;
		
	}

}
