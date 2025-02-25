package study0224;

public class Member {
	
	static int count = 1;	// 클래스변수
	
//	String name;		//	이름
//	int age;				//	나이
//	String addr;		// 주소
	
	String name = "박문수";		////     <<<< 2. 명시적 초기화
	int age = 10;
	String addr;
	String dept; //	학과
	
	static{	//	클래스 초기화블럭 - 클래스 변수만 초기화가능
		//	age = 10;	인스턴수 변수 초기화 불가
		count = 0;
	}
	
	{		// 인스턴스 초기화블럭
			// 모든 생성자 메서드에 공통으로 들어가는 초기화코드 사용
		name = "김유신";			////		<<<< 3. 초기화블럭
		count ++;					////		<<<< 초기화되어서 1씩 증가
	}
	
	
	Member(){							////      <<<< 1. 생성자메서드 초기화
		name = "아무개";
		age = 10;
		addr = "대전";
		dept = "컴퓨터공학과";
	}
	
	Member(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		dept = "컴퓨터공학과";
	}
	
	// 인스턴스 메서드
	void setName(String name) {
		this.name = name;
		output();		// 문제되지 않음	◈ 비교대상
	}
	// 클래스 메서드
	static void output() {
//		setName("이순신");		//	인스턴스 메서드 호출 불가			◈ 비교대상
//		System.out.println(name);	// 인스턴스 변수 사용불가			◈ 비교대상
	}
	
}

/*
클래스의 멤버 변수 초기화 방법

	멤버 변수인 인스턴스변수의 초기화 방법
	1. 생성자메서드 이용해서 초기화
	2. 명시적 초기화
	3. 초기화블럭을 통해 초기화

초기화 진행 순서
	명시적 초기화 => 초기화블럭 => 생성자메서드
	
클래스 내부에 선언되는 변수의 종류
	1. 인스턴스 변수 - 타입 변수명;
		인스턴스 변수는 객체 생성해야 만들어지는 변수
	2. 메서드 내부에 선언되는 변수 - 지역변수
		지역변수는 자신이 선언된 위치에서만 사용가능
		메서드가 호출되어야 공간이 존재하고 메서드 종료시 해제
	3. 클래스 변수 - static 타입 변수명;
		클래스 변수는 객체 생성시 만들어지는 변수가 아니다.
		자바프로그램 실행할 때 생성되는 변수
		공용 변수 ( 공유 자원 )
		
메서드의 종류
	-	인스턴스 메서드
		인스턴스 메서드는 객체 생성해야 사용가능
	-	클래스 메서드
		static void output(){}
		객체 없이 사용 가능
		클래스이름.메서드이름();
		
	주의!!!
		클래스메서드에는 오직 클래스 변수 또는 클래스 메서드만 사용가능
		클래스 메서드에서 인스턴스 메서드 사용불가
			
	그래서 정리 !!
		클래스변수(static) 또는 클래스메서드(static)은 프로그램 실행시 생성
		인스턴스변수 또는 인스턴스메서드는 객체 생성시 생성
			
		프로그램 실행 -> 클래스정의 메모리 로드 -> 클래스변수 또는 클래스메서드 생성
		-> main메서드 실행 -> new Member() 생성자메서드 호출 -> 객채생성 
		-> 인스턴스 변수 또는 인스턴스 메서드 생성
			
	그래서 변수 초기화 순서는!!!
		클래스변수 명시적초기화 -> 클래스 초기화블럭 -> 인스턴스변수 명시적 초기화
		-> 인스턴스 초기화 블럭 -> 생성자 메서드 
	
*/