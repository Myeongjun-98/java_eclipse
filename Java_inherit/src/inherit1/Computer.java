package inherit1;

public class Computer  extends Product{		// 자식클래스
	public Computer() {};
	public Computer(String brand, int price, String name) {
		super(brand, price, name);
	}
//////////////////////
	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("컴퓨터전원 : " + onOff);
	}
	
}
