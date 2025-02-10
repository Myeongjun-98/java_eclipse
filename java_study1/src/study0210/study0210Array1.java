package study0210;

import java.util.Scanner;

public class study0210Array1 {

	public static void main(String[] args) {

		
		// 변수 : 값(데이터, 주소 등등)을 저장하기 위한 메모리 공간
		
		/*
		// 배열 : 같은 데이터 타입의 연속적인 메모리 공간
						=> 변수공간 여러개를 연속적으로 사용
		
		자바스크립트(JS)는 let arr = [], let arr = new Array();
										const arr = [ 1, "aaa" , 3 , 4.136 , 5 ]			JS는 타입 달라도 다 들어감
		*/
		
		// 자바(JAVA) 배열 선언 방법
		int[] arr = new int[5]; // 5개 공간으로 이루어진 배열 선언
		// int arr[] 똑같음, 근데 자료형 뒤에 [] 선호됨
		// ☆ JAVA에서 배열의 크기는 변하지 않음. 그래서 처음 만들 때 여유공간 넉넉하게 지정
		int[] arr2 = new int[] {1, 20, 50, 15} ;	// 4개 공간 배열 선언, 크기 정해줄 필요 X
		
		// 자바 배열 사용법
		arr[2] = 20;		// 3번째 공간에 저장됨
		System.out.println(arr[2]);
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 40;
		arr[4] = 60;
		
		for(int i = 0 ; i <= 4 ; i++) {
			System.out.println(arr[i]
					);
		}
		
		// 배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		// 인덱스는 0부터 시작한다.
		// 그래서 반복문의 초기값은 0으로 지정하면 된다.
		// 반복문의 조건식은 배열인덱스의 마지막까지 표현될수 있게 하면 됨
		// 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7, ㅑ<=7하면 됨
		for(int i = 0 ; i <= 3 ; i++) {
			System.out.println(arr2[i]);
		}
		
		int[]  apple = new int[10];
		// 참조변수를 사용하려면 배열인경우 인덱스를, 객체인경우 . 접근연산자
		// 참조변수?? = new 붙은건 일단 다 참조변수, 여기선 apple
		// 직접 데이터를 가지는 변수가 아닌 것이 참조변수, 데이터의 주소값만 가지는 녀석들
		
//		Scanner[] a = new Scanner[50];
		// Scanner라는 이름의 클래스 타입, 기본 타입들만 배열 만들 수 있는 것이 아니라 모든 타입들이 배열을 만들 수 있음.
		
		Scanner scan = new Scanner(System.in);
		// 배열에 데이터 입력
		for(int i = 0; i < 10 /*<= 9*/; i++) {
			System.out.print("숫자 입력 : ");
			apple[i] = scan.nextInt();
		}
		
		// 배열 출력
		// apple.length => 배열의 크기(공간갯수)
		// 배열의 크기는 반드시 10진수 정수 양수로 지정
		for(int i = 0; i < apple.length ; i++) {
			System.out.println(apple[i]);
		}
		
		
		
		
		
		
	}

}
