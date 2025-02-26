package inherit1;

public class Tv extends Product{		// 자식클래스
	
	public Tv() {
		super();		// 부모클래스 생성자메서드가 반드시 먼저 실행된다.
//		super();		//부모클래스의 생성자메서드, 
		// super는 부모클래스의 객체를 의미한다.
		
		System.out.println("자식클래스 생성");	// 호출은 자식이 먼저, 시행은 부모가 먼저(스택)
	};
	public Tv(String brand, int price, String name) {
//		super.brand = brand;		// 원래 이렇게 씀. 더 확실한 방법
//		this.name = name;			// 자식쪽 고유의 값이라면 this로 표시해주는게 더 낫겠지만..
//		super.price = price;		// 자식쪽에선 super로 해주는게 더 낫다
		super(brand, price, name);
	}
///////////////
	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("TV 전원 : " + onOff);
	}
	
	
	
}
