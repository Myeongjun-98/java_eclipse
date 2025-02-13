package study0213;

import java.util.Scanner;

public class study0213JavaString1 {

	public static void main(String[] args) {
		
		String title = "자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목 입력 : ");
//		title	 = scan.next(); // .nextLine();
		
		System.out.println(title);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
//		System.out.print("이름 : ");
//		String name = scan.next();
		
		System.out.println(age + " "  + name);
		
		//	nextLine()은 같은 입력명령이 있을 때, 숫자 입력보다 먼저가 되어야한다. (nextInt()보다 앞에 있어야 함)
		// 키보드가 입력받을 때 버퍼에 마지막 명령이 남아있는데, nextInt()하면 버퍼가 남아있는 상태임
		// 그런데, nextLine()은 엔터가 이미 포함된 명령임.
		// 즉, 버퍼의 엔터와 nextLine()의 엔터가 합쳐져 즉시 명령이 끝나버림
		// 그럼에도 nextLine()을 쓰고싶다면 쓸 nextLine() 뒤에 공란인 nextLine()을 쓰도록 하자.
		
		// next()는 엔터입력시 엔터 입력 되기 전에 입력한 버퍼에 쌓여있는 값을 가져온다.
		
		// next()는 Enter 미포함, nextLine()은 Enter 포함
		// 다만 next()를 사용시에는 버퍼에 계속 Enter가 남게된다.
		// 파일 불러오기(읽기) 시 버퍼의 영향을 받을수도 있다.
		
		
		
		
		
		
		
	}

}
