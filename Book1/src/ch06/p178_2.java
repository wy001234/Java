package ch06;

public class p178_2 {
	String LineNumber;
	int passengerCount;
	int money;

	public p178_2(String LineNumber) {
		this.LineNumber = LineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
		
	}
	
	public void showInfo() {
		System.out.println(LineNumber +"의 승객은"+ passengerCount +"명이고, 수입은"+ money +"입니다.") ;
	}
}
