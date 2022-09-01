package ch06;

public class p185 {

	public static void main(String[] args) {
		p184 studentLee = new p184();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.seriaNum);
		System.out.println(studentLee.studentName + "학번" + studentLee.studentID);
		
		p184 studentSon = new p184();
		studentLee.setStudentName("손수경");
		System.out.println(studentLee.seriaNum);
		System.out.println(studentLee.studentName + "학번" + studentLee.studentID);
		
		p184 studentKim = new p184();
		studentLee.setStudentName("김민지");
		System.out.println(studentLee.seriaNum);
		System.out.println(studentLee.studentName + "학번" + studentLee.studentID);
		
		
	}
}
