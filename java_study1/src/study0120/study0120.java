package study0120;

import java.util.Scanner;

public class study0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 - 데이터를 저장하기 위한 메모리 공간
		// 변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		// 변수 선언 방법 - 데이터타입 변수이름(예 - int num;)
		// 저장할 데이터에 맞는 데이터타입을 설정해야한다.
		// 변수이름의 첫 글자는 문자로, 자바 예약어는 사용 불가능하다

		// 자바에서 결과로 출력하는 방법
//			System.out.println("출력하는 방법")
		// 자바에서 키보드를 통해 데이터 입력하는 방법
		// 자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출

		// Scanner 변수이름 = new Scanner(System.in)
		System.out.print("정수 입력 : ");
		Scanner input = new Scanner(System.in);
		// num 이라는 변수에 정수 데이터 입력하여 저장하기
		// nextInt()가 정수 데이터 입력하기 위한 메서드(기능)이다.
		int num = input.nextInt();

		System.out.println("입력 잘 되었나?" + num);

		// 사각형의 너비와 높이를 키보드를 통해 입력받고 넓이를 계산하여 출력하세요.
		// 풀이
		int width=0, height=0;
		System.out.print("너비 입력 : ");
		width = input.nextInt();
		System.out.print("높이 입력 : ");
		height = input.nextInt();
		//사각형 넓이 구하기
		int area = width * height;
		System.out.println("넓이 : " + area);
		
		
;	
	
	}

}
