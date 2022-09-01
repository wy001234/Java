package ch06;

public class p179 {
	public static void main(String[] args) {
		p175 studentJames = new p175("james", 5000);
		p175 studentJTomas = new p175("Tomas", 10000);
	
	
		p177 bus100 = new p177(100);
		studentJames.takeBus(bus100);
		studentJames.showinfo();
		bus100.showInfo();
		
		p178_2 subwayGreen = new p178_2("2호선");
		studentJTomas.takeSubway(subwayGreen);
		studentJTomas.showinfo();
		subwayGreen.showInfo();
	
	
	}
}
