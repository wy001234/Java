package sub03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 설우영
 * 내용 ㅣ 직렬화/역직렬화 실습하기
 * 
 * 
 * 
 * */

public class DSeriallzetest {
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("일본", 3000);
		
		String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
	
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			//객체 내보내기
			oos.writeObject(a1);
			oos.writeObject(a2);
			
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("직렬화 완료");
	}
}
