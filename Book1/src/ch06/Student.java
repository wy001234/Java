package ch06;

public class Student {
	public static int seriaNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public int money;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subWay) {
		subWay.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxt(Taxt taxt) {
		taxt.take(10000);
		this.money -= 10000;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다");
	}
}
