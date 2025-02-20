package study0220;

import java.util.Scanner;

public class JavaMethod {

	static Scanner scan = new Scanner(System.in);
	
	// 메서드에 반환 값(출력 값)이 없는 경우 void타입으로 작성한다.
	
	// 메서드 정의
	
	/*
  	메서드의 형태
  	
  	1. 반환 X 입력 X	(매개변수)		// void
  			-	외부 데이터도 필요없고 출력하는 값도 없기 때문에 대부분 단순 출력용이 많다.(메뉴같은거)
  			-	클래스 객체의 메서드인 경우에도 반환과 매개변수없이 정의한다.
  	*/
	static void output () {		//(↑↑↑1번)
		System.out.println("반환이 없는");
		System.out.println("매개변수도 없는");
	}
	/*
  	2. 반환 X 매개변수 O
  			-	메서드의 내용을 실행하는데 필요한 데이터를 가지고있지 않다면 메서드 외부에서 데이터를 가져와야한다.
  	*/
	static void sum(int num1, int num2) {	// 두 정수의 합 구해서 출력까지
		System.out.println("합 : " + (num1 + num2));
	}
	static void sum(int num1, float num2) {	// 오버로딩
		System.out.println("합 : " + (num1 + num2));
	}
	/*	
  	3. 반환 O 매개변수 X
  			-	매개변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성할 수 있거나
  			-	클래스 객체가 가지고있는 인스턴스변수의 데이터를 가공(계산 등)하여
  			-	외부에 내보내기 위한 목적인 경우		ex) nextInt();	
  	*/
	static int total() {
		int a=10, b=20, c=30;
		int tot = a+b+c;
		return tot;
	}
	/*
  	4. 반환 O 매개변수 O			ex) name.equals("박문수");
	 */
	static String game(int val) {		// 1-가위, 2-바위, 3-보
		if(val == 1)
			return "가위";
		if(val == 2)
			return "바위";
		if(val == 3)
			return "보";
		return "잘못된 입력입니다";	// 반환이 있는 메서드에서 if문으로 return했다면
													// 참인경우에만 동작할 수 있기 때문에 별도의 return이 필요
	}
	
	//////연습문제1
	//	두 개 정수 중 큰 값 출력하는거 만들기
	static void WhichBig(int num1, int num2) {
		if(num1 == num2)
			System.out.println("같은 수입니다");
		else {
			if(num1 > num2)
				System.out.println(num1 + "이 더 큰 수입니다");
			else System.out.println(num2 + "이 더 큰 수입니다");
		}
	}
	// 두 정수 비교하고  출력하는 메서드 
	// 반환없고 매개변수있는 메서드로
	
	///////연습문제1  끝.
	/////////연습문제 2
	// 국어점수 : 88, 영어점수 : 91, 수학점수 : 74
	// 세 과목의 총점과 평균을 출력하세요
	// 총점 계산하는 메서드, 평균 계산하는 메서드
	static int sum(int num1, int num2, int num3) {		// 세 인자 입력의 합
		int total = num1 + num2 + num3;
		return total;
	}
	static void avg(int total) {
		int average = total/3;
		System.out.println("평균 : " + average);
	}
	
	
	/////////연습문제 2  끝.
	//////////////////////////////////////////메인메서드//////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int num = total();
		//출력
		
		output();	// ★1 이렇게 작성해야 output메서드 실행된다.
		
		sum(1, 2);	// ★2	
		int a = 100, b = 20;
		sum(a, b);
		float c = 3.14f;	
		sum(a, c);		// 오버로딩!
		
		System.out.println(num); // ★3
		
		String res = game(1);		// ★4
		System.out.println(res);
		
		//연습문제 실행 1
		int num1 = 72;
		int num2 = 623;
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		int num2 = scan.nextInt();
		WhichBig(num1, num2);
		// 연습문제 실행 1  끝.
		
		// 연습문제 실행 2
		int kor = 88, eng = 91, mat = 74;
//		System.out.print("국어 점수를 입력하세요 : ");
//		int kor = scan.nextInt();
//		System.out.print("영어 점수를 입력하세요 : ");
//		int eng = scan.nextInt();
//		System.out.print("수학 점수를 입력하세요 : ");
//		int mat = scan.nextInt();
		int totalScore = sum(kor, eng, mat);
		System.out.println("총점 : " + totalScore);
		avg(totalScore);
		
		// 연습문제 실행 2  끝.
		
		
		
	}

}


 