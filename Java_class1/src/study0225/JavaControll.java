package study0225;

import study0224.Member;

public class JavaControll {

	final void sum(int a, int b) {	// 메서드에 final 시엔?
		System.out.println("내가 sum이다");
	}		
	void sum(int a) {		//		메서드 이름 O, 매개변수 차이점 허용O
		int tot = a + 20;		//		내용 변경 허용 O
		System.out.println("내가 sum인디..");	//		overLoading 허용 O		But,		!!!!! overRiding 불가
	}															//		overLoading은 새로운 변수(메서드)를 만드는거나 마찬가지라 final 상관없어짐
	
	public static void main(String[] args) {

		final int year = 2025;
//		year = 1;		year는 상수로 선언되어 재선언 불가
		
		Movie m = new Movie();
/*
//	private 제어자 붙은 변수에 데이터 저장
		생성자메서드를 사용해서 변수 초기화
*/	
		
	}

}

/*		
	자바 클래스 제어자
	
		final
			변하지 않는, 변경되지 않는
				변수, 메서드, 클래스
	
		static
			(클래스의) 공통적인 이라는 의미로 사용됨
				모든 객체(인스턴스)들이 공통으로 사용할 수 있는 변수 또는 메서드
				
		abstract
			추상적인
				클래스, 메서드에 사용
				내용이 없는 빈 껍데기의 클래스(?)
				abstract 메서드는 가지는 클래스는 abstract 클래스가 되어야 함
				abstract 클래스는 객체생성 불가
------------------------------------------------------------------------------------------------		
	접근제어자
	
		public
			자바 프로그램 어디서든 사용가능
				패키지가 다른 경우 import 선행됨
				
		private
			오직 클래스 내부에서만 사용 가능
		
		default
			같은 패키지에서만 사용 가능
			
		protected
			같은 패키지에서만 사용 가능, 
			상속된 경우에는 패키지가 달라도 사용가능
------------------------------------------------------------------------------------------------
	인스턴스변수
		객체 생성 시  생성되는 변수 또는 메서드
			new 클래스명();	

	클래스 변수
		static 제어자 붙는 변수 또는 메서드
			프로그램 실행 시 클래스 로드 후 
			
	지역변수
		메서드 내 변수, 제어문 내부 변수 -> {		} 블럭 안에 선언하는 변수
			메서드나 제어문 호출 시 할당되는 변수
			
			
			
			
			
			
			
			
			
			
*/