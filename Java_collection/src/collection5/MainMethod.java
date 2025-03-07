package collection5;

import java.util.LinkedList;
import java.util.Stack;

public class MainMethod {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
//		list.add("틀린그림찾기");
//		list.add("벽돌깨기");
//		list.add("슈퍼마리오");
//		
//		System.out.println(list.contains("고인돌"));
//		System.out.println(list.indexOf("벽돌깨기"));
//		System.out.println(list.get(1));

		/* 스택 - FILO(First In Last Out)구조이다
				웹 브라우저 히스토리, 계산기, 메서드 호출 등등
		*/
		Stack<String> stack = new Stack<>();
		stack.add("김춘추");		// add도 되지만
		stack.push("이순신");		// stack은 일반적으로 push씀
		stack.push("이성계");
		stack.push("홍길동");
		stack.push("김석진");
		stack.push("이정훈");
		stack.push("김미란");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		
	}

}
