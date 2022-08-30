package ch06;

class Person{
	String name;
	int age;

	
	Person(){
		this("이름없음", 1);
	}

	public Person(String string, int i) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}

}

public class p172 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

	Person p = noName.returnItSelf();
	System.out.println(p);
	System.out.println(noName);
	}

}

