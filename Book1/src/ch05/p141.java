package ch05;

public class p141 {
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	
	//get set
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		p141 studentAhn = new p141();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
}
