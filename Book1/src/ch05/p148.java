package ch05;

public class p148 {
	public static void main(String[] args) {
		p141 student1 = new p141();
		student1.studentName = "안연수";
		
		System.out.println(student1.getStudentName());
		
		p141 student2 = new p141();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}

}
