package inner2;

public class MainMethod {

	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		
		lc.getBirth();
		//지역 내부클래스는 해당 메서드를 호출해야 사용가능
		
		Item item = new Item();
		item.sale();
		
		Item shoes = new Item() {
			@Override
			public void sale() {
				make();	// 사용가능, 21row
				System.out.println("신발 판매");
			}
			
			public void make() {		// 타입이 Item이라 shoes변수의 객체로서 쓰이지 않지만,
												//	내부에서는 사용 가능
				System.out.println("신발 만들기");
			}
		};	// 익명클래스 정의와 객체 생성
		// Item 클래스가 부모클래스가 되고 익명클래스가 자식클래스
		
		shoes.sale();
//		shoes.make();	// 오류, 오버라이딩 안되어서, Item타입에 정의된 메서드가 아님
		
		Animal dog = new Animal() {
			@Override
			public void eat() {
				System.out.println("강아지가 밥먹는당");
			}
		};	// 인터페이스를 implements한 익명클래스 정의와 객체
		
		dog.eat();
		
	}

}
@FunctionalInterface
interface Animal {		// Animal interface 인터페이스 정의
	public void eat();	// 추상메서드
}

class A {
	
}