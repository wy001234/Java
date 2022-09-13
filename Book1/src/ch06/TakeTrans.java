package ch06;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("Jasmes", 5000);
		Student studentTomas = new Student("Tomas", 10000);
	
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxt taxt2080 = new Taxt(2080);
		studentTomas.takeTaxt(taxt2080);
		studentTomas.showInfo();
		taxt2080.showInfo();
	}
	
}
