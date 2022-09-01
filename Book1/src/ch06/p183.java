package ch06;

public class p183 {

	public static void main(String[] args) {
		p182 studentLee =  new p182();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		p182 studenSon =  new p182();
		studentLee.setStudentName("손수경");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
	}
	
}
