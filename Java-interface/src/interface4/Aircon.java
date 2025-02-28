package interface4;

public class Aircon extends Machines implements remoteCon{

	public Aircon() {};
	public Aircon (boolean isOnOff) {
		super(isOnOff);
	}
	
	@Override
	public void onOff() {
		isOnOff = !isOnOff;
		if(isOnOff == true)
		System.out.println("에어컨 전원 : On");
		else System.out.println("에어컨 전원 : Off");
	}

	@Override
	public void Boom() {
		System.out.println("아무 기능도 없는 듯 하다...");
	}

}
