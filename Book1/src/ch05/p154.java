package ch05;

public class p154 {

	String name;
	float height;
	float weight;
	
	public p154() {}; //디폴트 생성자
	
	public p154(String pname) {
		
		name = pname;
	} //이름을 매개변수로 입력받는 생성자

	public p154(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

