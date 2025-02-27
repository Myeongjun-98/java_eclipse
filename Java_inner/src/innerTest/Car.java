package innerTest;

public class Car {
	private Tire tire;
	// 포함관계에서 클래스객체 생성시기
	
	public Car(Tire tire) {
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
