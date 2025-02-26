package inherit1;

public abstract class Product {		// 부모클래스
	protected	boolean onOff = false;
	protected String brand ;	// 브랜드
	protected int price;	//	가격
	protected String name;	//	제품명 - LG휘센, 캐리어A32 등
	
	public Product() {
		System.out.println("부모클래스 생성");	// 호출은 나중에, 시행은 부모가 먼저(스택)
	}
	
	public Product(String brand, int price, String name)	{
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	
	public abstract void power()	// 자식클래스가 다 오버라이딩하니까 추상적인 메서드로 만들기만 하면 됨
	;		// 추상메서드가 존재하려면 추상클래스에서만 가능하다.	
			// 추상클래스는 객체 생성이 불가
			// 추상클래스는 추상메서드를 가질 수 있는 클래스이다.
			// 추상메서드는 메모리의 크기를 얼마나 할당해야하는지 측정불가하기에 객체 공간 할당이 안된다.
			// 객체 공간 할당 받으려면 얼마의 메모가 필요한지 측정이 되어야한다.
	
//	
//		onOff = !onOff;
//		System.out.println("전원 : " + onOff);
		//	자식클래스가 다 Override해서 내용 필요없음
//	}
		/*
		//// 오버라이딩 ////
			상속관계인 경우, 인터페이스 implements인 경우에 사용
		
		성립조건
			1. 메서드의 원형은 그대로 유지
			2. 내용만 변경한다.
			3. 상속 또는 implements인 경우에만 가능
		*/
	
	
}
