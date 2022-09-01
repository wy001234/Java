package ch06;

public class p186 {
	public static void main(String[] args) {
		p182 studentLee = new p182();
		studentLee.setStudentName("이지원");
		System.out.println(p182.serialNum);
		System.out.println(studentLee.studentName + "학번" + studentLee.strdentID);
		
		p182 studentSon = new p182();
		studentLee.setStudentName("손수경");
		System.out.println(p182.serialNum);
		System.out.println(studentLee.studentName + "학번" + studentLee.strdentID);
	}
}
