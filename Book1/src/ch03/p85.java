package ch03;

public class p85 {
	public static void main(String[] args) {
		int num = 0B0000101;
		
		System.out.println(num <<2);
		System.out.println(num >>2);
		System.out.println(num >>>2);
		
		System.out.println(num);
		
		num = num <<2;
		System.out.println(num);
	}
}
