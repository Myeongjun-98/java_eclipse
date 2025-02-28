package interface4;

public class Tv extends Machines implements remoteCon{
	
	public Tv() {};
	public Tv (boolean isOnOff) {
		super(isOnOff);
	}
	
	@Override
	public void onOff() {
		isOnOff = !isOnOff;
		if(isOnOff == true)
		System.out.println("스마트TV 전원 : On");
		else System.out.println("스마트TV 전원 : Off");
	}
	@Override
	public void Boom() {
		System.out.println("스마트TV가 반란을 일으킨다!");
	}

}
