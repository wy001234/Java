package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 설우영
 * 내용 ㅣ 보조 스트림 실습하기
 * 
 * 버퍼 스트림
 * - 기본 입출력에 Buffer을 추가해서 빠른 입출력을 지원하는 스트림
 * - 기본 입출력에 무조건 장착해야 실행 성능 향상
 * 
 * 
 * */

public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Java.pdf";
		String target = "C:\\Users\\java1\\Desktop\\Java2.pdf";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림(Buffer) 생성 연결
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		
			while(true) {
				//파일 읽기
				int value = bis.read();
				
				if(value == -1) {
					//파일을 모두 읽었으면
					break;
				}
				
				//char c = (char)value;
				//System.out.println(c);
				
				//파일 쓰기
				bos.write(value);
			}
			
			//스트림 해제
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
			
			System.out.println("쓰기 완료!");
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
