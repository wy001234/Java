package Test01;

public class Test09 {
	public static void main(String[] args) {
	//count ++
	//count --
	
		int count = 0;
		for(int i =1; i<=9; i++) {
			if(i<=5) {
				count++;
			}else {
				count--;
			}
			
			for(int j=1; j<=5-count; j++) {
				System.out.println(" ");
			}
			for(int k=1; k<=2* count-1 ; k++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
}
}
