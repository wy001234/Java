package sub03;

import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 2022/09/20
 * 이름 : 설우영
 * 내용 : 필터 스트림 실습하기
 */

public class FiltetStreamTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("김유신","김춘추","장보고","강감찬","이순신","김춘추");
		System.out.println(names);
		
		//중복제거
		names.stream().distinct().forEach((name)->{System.out.println(name);});
		System.out.println();
		
		// '김'씨 성을 같는 문자열 필터링
		names.stream().filter(name->name.startsWith("김")).forEach(name->System.out.println(name + ""));
		System.out.println();
		
		//
	}
}
