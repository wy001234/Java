package sub01;

//클래스 정의
public class Car {

	//자동차의 속성(변수)
	String name;
	String color;
	int speed;
	
	
	
	//자동차의 기능(메서드)
	public void speedUP(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차랑명 :" + this.name);
		System.out.println("차랑색 :" + this.color);
		System.out.println("속도 :" + this.speed);
	}

}