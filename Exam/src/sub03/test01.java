package sub03;

public class test01 {

	private String name; //속성
	private int age;
	
	public test01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public void show() {
		System.out.println("==============");
		System.out.println("이름 :" + this.name);
		System.out.println("나이 :" + this.age);
		System.out.println("--------------");
	}
	
		
	public static void main(String[] args) {
		test01 kim = new test01("김유신", 23);
		test01 lee = new test01("이순신", 31);
		
		kim.show();
		lee.show();

	}
}
