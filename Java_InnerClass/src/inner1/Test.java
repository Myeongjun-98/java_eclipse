package inner1;

public class Test {
	static int count = 1;	// 클래스변수(정적변수)
	int age; // 인스턴스변수
	A a;
	/**/static	Dog d;
	
	Test(){
		a = new A();
	}
	
	static void origin() {	
//		a.view();	//	클래스메서드, 프로그램 실행 시 사용되는 메서드라 a보다 한참 앞에있음
//		A bb = new A();		//	오류, A는 new연산자통해 객채가 생성되어야만 존재
	}
	
	//정적 내부 클래스(static)
	static class Dog{
		int year;
	}
	void setYear(int year) {
		Dog d = new Dog();
		d.year = year;
	}
	
	//인스턴스 내부클래스 정의 - 외부클래스의 객체생성해야 사용
	class A {
		int num;
		void view() {
			System.out.println("내부클래스 메서드");
		}
	}
	
	void setNum(int num) {
		this.a.num = num;
	}
	
	void getNum(int num)	{
		this.a.num = num;
	}
	
	void innerView() {
		this.a.view();
	}
	
	void sum() {
		int a, b;	//	지역변수
	}
}
/*
	내부클래스 = 클래스 내부에 만드는 클래스
						여러개의 클래스와 관계를 맺는 것이 아닌
						하나의 클래스와 상속 또는 포함 관계를 맺을 경우에 사용하면 효과적이다.
						외부 클래스 객체를 생성하고 사용
		
	정적 내부 클래스(static) = 외부 클래스 객체 없이 사용 가능
											외부 클래스 객체 없이 사용 가능
	
	지역 내부 클래스 = 메서드 내부에 클래스를 정의하고 해당 메서드 내부에서만 사용가능
	익명 내부 클래스 = 이름 없는 클래스, 메서드를 오버라이딩하여 사용ㅈ
	
	
						
		static 변수 또는 메서드
		-> 프로그램 실행하면서 클래스가 메모리에 로드되면 공간 할당
		
		인스턴스 변수 또는 메서드
		-> new 연산자 통해 클래스의 공간을 생성해야 존재
		
		지역변수
 		-> 메서드를 호출해야 생성
 		
 	순서 : static변수 또는 메서드 => 인스턴스변수 또는 메서드 => 메서드호출해야 지역변수 생성
*/



