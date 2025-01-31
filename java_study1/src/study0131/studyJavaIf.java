package study0131;

import java.util.Scanner;

public class studyJavaIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int 나이 = 25;
		if ( 나이 >= 19) {System.out.println("성인입니다.");}
		else {System.out.println("성인이 아닙니다.");}

		int money = 6400;
		if (money >= 10000) 
			System.out.println("충전 안함");
		else {
			System.out.println("잔액 부족, " + (10000 - money) + "원 충전");
			money = (10000 - money) + money;
		}
		System.out.println("현재 잔액 : " + money);
		//////////////////////////////////////////////////////////////
		// 사각형의 너비와 높이이다.
		// 현재 사각형은 정사각형인가 직사각형인가?
		int width = 53, height = 52;
		if (width == height)
		System.out.println("이 사각형은 정사각형입니다.");
		else
		System.out.println("이 사각형은 직사각형입니다.");
		
//		// 내 맘대로 실습
//		System.out.print("사각형의 너비를 입력하세요. : ");
//		int width2 = scan.nextInt();
//		System.out.print("사각형의 높이를 입력하세요 : ");
//		int height2 = scan.nextInt();
//		if (width2 == height2)
//			System.out.println("이 사각형은 정사각형입니다.");
//		else
//			System.out.println("이 사각형은 직사각형입니다.");
//		
		
		// 입력한 숫자가 짝수인가 홀수인가?
		int num = 0;
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		int dividenum = num%2;
		if (dividenum == 1)
			System.out.println("이 숫자는 홀수입니다.");
		else
			System.out.println("이 숫자는 짝수입니다.");

		// 다중조건
		int num2 = 15;
		if (num > 0)
			System.out.println("양수이다.");
			else if (num < 0) 
					System.out.println("음수이다.");
			else 
					System.out.println("0 이다.");
			
		// 100~90은 A, 89~80은 B, 79~70은 C, 나머지는 F
		int score = 81;
		if (score >= 90)
			System.out.println("A입니다.");
		else if(score >= 80)
			System.out.println("B입니다.");
		else if(score >= 70)
			System.out.println("C입니다.");
		else
			System.out.println("F입니다.");
		
		
		// 1 입력 시 데이터 저장이라고 출력
		// 2 입력 시 데이터 삭제 후 출력
		// 3 입력 시 종료라고 출력
		// 1, 2, 3이 아닌 숫자는 잘못 입력했습니다. 라고 출력
		// 정수를 입력하여 위 내용처럼 실행될 수 있게 만드세요.
		
		int 정수입력 = 0;
		System.out.print("정수를 입력하여 명령하세요. : ");
		정수입력 = scan.nextInt();
		if (정수입력 == 1)
			System.out.println("데이터 저장");
		else if (정수입력 == 2) {
			System.out.println("데이터 삭제");
		}else if (정수입력 == 3)
			System.out.println("종료합니다.");
		else
			System.out.println("잘못 입력하였습니다.");
		
		
	}

}
/*
	변수 : 데이터(값)을 저장하기 위한 메모리 공간
	변수이름 : 데이터가 저장된 메모리공간을 사용하기 위해 이름을 부여해야함.
	System.out.println(1000);
	int a = 1000;
	System.out.println(a);
	=> 처음의 1000은 메모리 공간에 할당되지만 어디있는지 찾을 수 없음
	==> 변수 a는 변수선언했기 때문에 재 사용 가능함
	
	변수 선언 : 데이터타입, 변수이름 정하기
					=> 사용할 데이터에 맞춰서 정하기
					=> int num;			=			데이터타입 / 이름;
	
	데이터타입 변환 (형 변환)
		자동 형변환 : 데이터타입이 작은 범위에서 큰 범위로 데이터가 저장되는 경우
		int a = 1000; 일 때,
		float a = 10;		=>		자동 형변환(실수타입으로)
		강제 형변환 : 데이터타입이 큰 범위에서 작은 범위로 게이터가 저장되는 경우
		int b = 2.14f;		=>		error!
		int b = (int)2.14f;		OK		=>		강제 형변환(정수타입으로)
		
	나누기 % : 나머지 구하기
	++, -- : 증감연산자	(1씩 증가, 1씩 감소)
	
	if조건식
	if(조건식) { 참일 경우 실행할 내용 , 여러 줄 가능 } 		=> 참의 경우 실행내용만 있어도 성립
		// 한줄이면 {} 중괄호 생략 가능
	if(조건식) { 참일 경우 실행할 내용 , 여러 줄 가능 } else { 거짓일 경우 실행할 내용, 여러 줄 가능 }
	
	
	
	
	
*/