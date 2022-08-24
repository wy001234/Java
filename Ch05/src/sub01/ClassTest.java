package sub01;

/*
 * 날짜 : 2022/08/24
 * 이름 : 설우영
 * 내용 : Java 클래스 객체 실습하기
 * 
 * 클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고 속성(필드)과 기능(메서드)으로 구성
 * - 객체는 클래스의 실제 인스턴스(메모리 공간)이며, new 연산으오 생성
 */


public class ClassTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car(); //변수는 클래스 이름으로 = 참조 변수
		
		//객체 속성 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 기능 실행
		sonata.speedUP(100);
		sonata.speedDown(40);
		sonata.show();
		
		// 객체 생성
		Car bmw = new Car();
		bmw.name = "bmw 520";
		bmw.color = "남색";
		bmw.speed = 0;
		
		bmw.speedUP(80);
		bmw.speedDown(40);
		bmw.show();
		
		//Account 객체 생성
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.belence = 0;
		
		//기능
		kb.deposit(100000);
		kb.withdraw(35000);
		kb.show();
		
		//Account 객체 생성
		
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.id = "101-12-1111";
		wr.name = "김춘주";
		wr.belence = 10000;
		
		
		wr.deposit(50000);
		wr.withdraw(30000);
		wr.show();
		
	}
	
}
