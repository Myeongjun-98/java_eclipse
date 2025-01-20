package study0116;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주석 - 설명이나 메모, 코드 대기, 등등
		/*
		 * 여러줄 주석 - 주석은 프로그램으로 실행되지 않는 부분이다.
		 * 				주석 안에 코드 작성해도 실행 안됨. 
		 * 				각 코드의 설명을 작성하는 용도
		 */
		// 빠른 주석 = 블록설정 후 Ctrl + /
		// 저장 단축키 = Ctrl + s
		// 실행 단축키 = Ctrl + f11
		System.out.println("자바 이클립스 테스트");
	
		// 데이터를 사용하려면 변수를 선언해야한다.
		// 변수를 선언할 때에는 반드시 데이터 타입을 정해야한다.
		// 변수의 이름은 저장할 데이터에 맞는 의미있는 이름으로 짓기
		/*
		 * 정수 : byte(가장 작은 단위), short, int, long(가장 긴 단위)
		 * 실수 : float, double
		 * 문자 : char(단일문자)
		 * 논리 : boolean
		 * */
		int age; 
		age = 100;  // age 변수에 100 저장(대입연산)
					// '='는 DB와 달리 '같다'라는 뜻 X
		age = 27;   // 이미 저장된 변수에 덮어씌움, 이전 데이터는 소멸됨
		//age = '가'; // 자바에서 ''표현은 문자를 의미
				   // ""표현은 문자열을 의미
				   // 올바르지 않은 타입 입력시 데이터가 저장이 안 되거나, 변딜되거나, 변환되어 저장됨
	
		System.out.println(age);
	
	
		//	 byte  =    -128 ~ 127
		//	 short = 	2^16범위, 2byte
		//	 int   =	2^32범위, 4byte
		//   long  =	2^64범위, 8byte, 숫자 뒤에 L을 붙여야 Long타입으로 인식된다.
	
		int num1 = 127;
		System.out.println(num1);
		
		int num2 = 20; // 변수를 선언하면서 데이터 저장 - 변수 초기화
		int num3 = 43; // num3은 43이다가 아닌, num3과 43이 같다는 표현이라
					   // num3에 43을 저장했다, num3에 43을 대입했다 라고 표현함
		
		System.out.println(num2 + num3);            // syso까지 입력 후 Ctrl + Space = 자동 
	
		int sum = num2+num3;
		System.out.println(sum);
	
		int blue = 20;
		int red = 15;
		int white = 0;
		
		// 파란 컵에 오렌지주스가 20ml 있다. 
        // 빨간 컵에 딸기주스가 15ml 있다.
		// 파란컵에 딸기주스를, 빨간컵에 오렌지주스를 담으려면 어떻게 해야하는가?
		// blue와 red 값 출력
		white = blue;
		blue = red;
		red = white;
		white = 0;		
		System.out.println(blue);
		System.out.println(red);
		System.out.println(white);
	
		int birthYear=1991;
		//김철수가 태어난 년도를 birthYear에 저장했다.
		//나이는?
		int presentAge = 2025-birthYear;
		System.out.println(presentAge);
		
		// 변수란 데이터(값)을 저장할 수 있는 메모리 공간
		// 변수의 공간에는 데이터타입에 맞는 데이터만 저장할 수 있게 해주어야 한다.
		// 변수의 선언은 데이터 타입 변수명 ( 예 - int num;)
		// 변수 이름은 카멜표기법이 일반적이다 (myEnglishnameIsMyeongJun)
		// 변수 이름은 사용목적에 맞는 이름으로 한다.(길어도 됨)
	
		float fnum = 2.156f; // float타입은 끝자리에 f를 기입해야 한다.
		System.out.println(fnum);
		fnum = 2.123456789f; // float은 소수접 7까지 표현
		System.out.println(fnum);
		double dnum = 1.1234567890123456789;
		System.out.println(dnum);
		// double은 16자리, 마지막자리는 올림처리(반올림이 아니라!)
		
		char ch = 'a';
		System.out.println(ch);
		ch = '가';
		System.out.println(ch);
		ch = 97; // 아스키코드 문자코드표에 의한 값!! // 왜? ch는 문자에 대한 값이니까!
		System.out.println(ch);
		ch = 'H';
		System.out.println( ch - 'A' );
		System.out.println( 'J' - 64 );
		System.out.println( '가' - 64 );
		
		String name = "홍길동";	// 문자열은 String 클래스타입 사용	
		boolean isApple = true; // 참, 거짓 값을 가지는 타입
		System.out.println( isApple );
		
		
		
		
		
		
		
	}

	
	
}


///////////////

