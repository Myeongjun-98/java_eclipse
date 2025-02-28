package inner1;

public class MainMethod {

	public static void main(String[] args) {
//		Test.A a = new Test.A();  안됨
		Test t = new Test();
		
//		t.num=10;	안됨
		// 이제 Test클래스에서 a를 정의했기 때문에
//		t.a.num = 10; 가능, 근데 내부 클래스가 노출되었음
		t.setNum(10);	// 내부 클래스 노출 안됨
		t.innerView();
		
		Test.A a = t.new A();
		a.num = 10;
//		t.num = 20;	안됨
		a.num = 20;
		
		// 정적 내부클래스를 굳이 노출하면서 객체를 만들고자 한다면
		Test.Dog dog = new Test.Dog();
		Test.origin();		// 클래스 메서드실행은 객체없이 가능하다.
		t.setYear(12);
		
		
		
		
		
		
		
		
		
	}

}
