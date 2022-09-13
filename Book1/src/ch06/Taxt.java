package ch06;

public class Taxt {
	int TaxtNumber;
	int money;
	
	public Taxt(int TaxtNumber) {
		this.TaxtNumber = TaxtNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	public void showInfo() {
		System.out.println(TaxtNumber + "의 수입은" + money + "입니다.") ;

	}
}


