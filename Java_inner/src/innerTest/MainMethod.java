package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		
		Tire tire = new Tire();
		tire.setInch(18);
		
		Car car = new Car(tire);
		
		System.out.println(car.getTire().getInch());
	}

}

// 상속 관계와 포함관계
//		A , B 를 두었을 때 A==B, B==A 둘 중 하나가 참이 된다면 상속관계
//		A==B, B==A 둘 다 !=일 시, 포함이라고 설명 가능