package ch06;

public class p175 {
	public String studentName;
	public int grade;
	public int money;
	
	
	public p175(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subWay) {
		subwsay.take(1500);
		this.money -= 1500;
	}
	
	public void showinfo() {
		System.out.println(studentName + "님의 남은 돈은" +money + "입니다"); 
		
	}
}
