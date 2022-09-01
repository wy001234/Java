package ch06;

public class Student2 {
	private static int seriaNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		seriaNum ++ ;
		studentID = seriaNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSeriaNum() {
		int i = 10;
		return seriaNum;
	}
	
	public static void setSeriaNum(int seriaNum) {
		Student2.seriaNum = seriaNum;
	}
	
}
