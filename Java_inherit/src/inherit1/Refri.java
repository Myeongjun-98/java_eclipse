package inherit1;

public class Refri extends Product{

	
	
	
	@Override
	public void power() {	// 추상메서드 구현
		onOff = !onOff;
		System.out.println("냉장고 전원 : " + onOff);
	}
	
}

// 부모클래스가 추상메서드를 가진 추상클래스라면 자식클래스에게 
// 추상메서드를 상속시키기 때문에 자식클래스는 추상메서드를 가지고있는 것과 마찬가지가 된다.
// 즉, 이 클래스가 추상이 되거나(다만 이 클래스가 추상클래스가 되면 값을 가지지 못한다)
// 부모의 추상 메서드를 가져와야 이 클래스가 성립한다.