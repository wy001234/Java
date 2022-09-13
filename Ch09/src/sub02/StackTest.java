package sub02;

import java.util.Stack;

/*
 * 날짜 : 2022/09/08
 * 이름 : 설우영
 * 내용 : 제네릭 실습하기
 * 

 * */

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
