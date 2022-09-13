package sub01;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2022/09/13
 * 이름 : 설우영
 * 내용 ㅣ JDBC 실습하기
 * 
 * */

public class JDBTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			if(conn != null) {
				System.out.println("데이터 베이스 접속 성공!");
			} else {
				System.out.println("데이터 베이스 접속 실패!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속 체스트 완료...");
	}
}
