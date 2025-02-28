package interface4;

public class Light extends Machines implements remoteCon{

	public Light() {};
	public Light(boolean isOnOff) {
		super(isOnOff);
	}
	
	@Override
	public void onOff() {
		isOnOff = !isOnOff;
		if(isOnOff == true)
		System.out.println("스마트전구 전원 : On");
		else System.out.println("스마트전구 전원 : Off");
	}

	@Override
	public void Boom() {
		System.out.println("스마트전구가 당신에게 눈뽕을 선사한다!!");
	}

}