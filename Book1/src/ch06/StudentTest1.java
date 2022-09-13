package ch06;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student(null, 0);
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.seriaNum);
		studentLee.seriaNum ++;
		
		Student studentSon = new Student(null, 0);
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.seriaNum);
		System.out.println(studentLee.seriaNum);
	}
}
