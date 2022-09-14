package sub04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 설우영
 * 내용 ㅣ 프로퍼티 실습하기
 * 
 * */

public class propertiesTest {
	public static void main(String[] args) {
		
		
		//프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");

		System.out.println(prop);
		
		String path = "C:\\Users\\java1\\Desktop\\Fruit.properties";
		
		//프로퍼티 파일 샐성
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			try {
				prop.store(fos, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로퍼티 파일 생성완료...");
		
		//프로퍼티 객체 생성
		String target = "C:\\Users\\java1\\Desktop\\Cities.properties";
		Properties propCities = new Properties();
		
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(propCities);
		System.out.println(propCities.getProperty("Kor"));
		System.out.println(propCities.getProperty("usa"));
		System.out.println("프로퍼티 객체 생성완료...");
	}
}
