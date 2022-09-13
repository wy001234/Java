package sub03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 설우영
 * 내용 ㅣ 직렬화/역직렬화 실습하기
 * 
 * 객체의 직렬화
 * - 자바 객체를 스틀림을 통해 외부 파일로 생성하는 작업
 * - 스트림으로 전송될 객체는 Serializable 인터페이스 구현
 * 
 * */

public class Seriallzetest {
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("일본", 3000);
		
		String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
	
		try {
			FileOutputStream fis = new FileOutputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		
			//갹체 가져오기(역직렬화)
			
			Apple a1 = (Apple) ois.readObject()
			Apple a2 = (Apple) ois.readObject()
			
			ois.close();
			fis.close();
			
			a1.show();
			a2.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("직렬화 완료");
	}
}
