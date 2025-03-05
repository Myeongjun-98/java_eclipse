package generic2;

public class MainMethod {

	public static void main(String[] args) {
//		Bottle<String> b1 = new Bottle<String>();
//		// Bottle 클래스의 제네릭타입으로 String 지정
//		// String item으로 변경, make메서드의 매개변수 String item으로 변경
//		b1.make("레몬소주");

		Soju soju = new Soju("참이슬","진로",16);
		Bottle<Soju> 참이슬 = new Bottle<>();	// 앞에서 하면 뒤는 안해도 됨
		참이슬.make(soju);
		
		soju.aa();
		Alcohol al = 참이슬.item;
		al.aa();
		
		Wine wine = new Wine("디안느소비뇽", "앙드레뤼통", 12);
		Bottle<Alcohol> 술병 = new Bottle<>();
		술병.make(wine);
		
		Alcohol ach = soju;	// 자식 개체를 부모에 담을 수 있다.
		
//		술병 = 참이슬;		//같은 타입(Bottle)인데도 안들어가짐
//									제네릭의 부모자식 관계도 관계 없어짐
//									제네릭이 달라 같은타입이라 볼 수 없지만 제네릭의 부모자식관계도 없음
//									타입, 제네릭이 같다면 같은 타입이라 볼 수 있음
		
		Makeolli makeolli = new Makeolli("공주밤막걸리","사곡양조",6);
		Bottle<Makeolli> 밤막걸리 = new Bottle<>();
		밤막걸리.make(makeolli);
		
		Bottle<Alcohol> 소주병 = new Bottle<>();
		소주병.make(soju);
		
//		Bottle<Toy> 티니핑 = new Bottle<>();		Bottle클래스에서 Alcohol로 제한했음
//		티니핑.make(new Toy());
		
		소주병.make(makeolli);
		
		Service 은호 = new Service();
		은호.drink(참이슬);
		
		Service 수영 = new Service();
		수영.drink(밤막걸리);
		
		
	}
}
/*
	제네릭 - 클래스 내부에 사용할 타입을 외부에서 지정하는 방법
	Member<Admin> a = new Member<>();
	-> Member클래스 내부에 Admin이라는 타입을 사용한다.
	-> Member클래스는 class Member<T> 로 정의되어 있어야한다.
	-> 클래스 내부의 인스턴스 변수나 메서드의 매개변수 타입 또는
		반환타입을 제네릭 타입으로 표현가능하다.
	Member<Admin> a = new Member<>()은 Admin클래스의 객체 생성이 아니다.
	Member클래스의 객체 생성이다.
	
	- 제네릭을 사용하는 클래스인경우 해당 클래스의 참조변수들은 Member<Admin>까지를
		타입으로 인지한다.
	- 제네릭에서는 상하 관계가 없다
		(제네릭 타입으로 부모클래스나 자식클래스를 사용해도 대입연산이 이루어지지 않는다.)
	- 제네릭을 사용하므로 타입에 대한 예외상황을 방지할 수 있다.
		(컴파일 과정에서 발생할 수 있는 오류 최소화)
	- 제네릭 사용 범위 제한은 extends와 super이다.
	- 메서드에서만 제네릭 사용되는 경우 와일드카드( " ? " ) 를 사용하는게 여러 타입처리 가능
	- 와일드 카드의 범위 한정은 extends, super이다.
	-	
	
	
	
	
	
	
*/

