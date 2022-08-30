package ch05;

public class p154Test {
	
	public static void main(String[] args) {
		p154 PersonKim = new p154();
		PersonKim.name = "김유신";
		PersonKim.weight = 85.5F;
		PersonKim.height = 180.0F;
		
		p154 personLee = new p154("이순신" , 175 , 75); //인스턴스 변수초기와와 동시에 클래스 생성
	}
}
