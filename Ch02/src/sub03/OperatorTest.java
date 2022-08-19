package sub03;

/* 날짜 202/208/16
 * 이름 : 설우영
 * 내용 : Java ㅂ변수 실습하기
 * 
 * 
 * 변수(variable)
 * - 데이터를 처리하기 위한 메모리 공간
 * - 데이터 변경이 가능
 * 
 * 상수(Constant)
 * -데이터 변경이 불가능한 고정된 값을 갖는 변수
 */
public class OperatorTest {
	public static void main(String[] args) {
		
		//변수
		String hello="hello world";
		int a = 3;
		int b = 7;
		
		System.out.println("hello:" + hello);
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		
		//상수
		
		final int NUM = 5; //초기값
		//NUM = 7;
		System.out.println("NUM: "+NUM);	
		
		//논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3>3)&&(var4>3); //var3은 3보다 크고 var4는 3보다 크다.
		boolean res2 = (var3>2)&&(var4>3); //var3은 2보다 크고 var4는 3보다 크다.
		boolean res3 = (var3>3)||(var4>3); //var3은 3보다 크고 또는 var4는 3보다 크다
		boolean res4 = (var3>4)||(var4>5); //var3운 4보다 크고 또는 var4는 5보다 크다
		
		
	}
}
