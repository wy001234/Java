package ch05;

public class p144 {
	int StudentId;
	String studentName;
	int grade;
	String address;
	
	// 멤버 변수
	
	public String getStudentName() {
		return studentName;
		
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		p144 studentAhn = new p144();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
