package ch06;

public class p178 {
	int busNumber;
	int passengerCount;
	int money;
	
	public p178(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println("버스"+ busNumber +"번의 승객은"+ passengerCount + "명이고, 수입은" + money + "입니다");
		
	}

}
