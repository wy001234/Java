package ch06;

public class p177 {
	
	int busNumber;
	int passngerCount;
	int money;
	
	public p177(int busNamber) {
		this.busNumber = busNamber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스"+busNumer"번의 승객은"+passCount+"명이고, 수입은"+money"입니다");
	}
	
	
}
