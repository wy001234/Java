package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 설우영
 * 내용 ㅣ 문자 스트림 실습하기
 * 
 * 파일 입출력(IO)
 * - 파일은 컴퓨터 저장매체에 저장되는 데이터 묶음
 * - 프로그럄은 대이터 철리와 함께 저장하기위해 파일 입출력을 수행
 * - 파일입출력을 위해 스트림을 연결해야됨
 * 
 * 
 * */

public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\java1\\Desktop\\Sample2.txt";
		
		try {
			FileReader fr = new FileReader(path);
		
			while(true) {
				int value = fr.read();
				if(value == -1) {
					//파일을 모두 읽었으면
					break;
				}
				
				char c = (char)value;
				System.out.println(c);
				
				//파일 쓰기
				//fr.write(value);
			}
			
			//스트림 해제
			fr.close();
			
			
			System.out.println("쓰기 완료!");
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
