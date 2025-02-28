package interface4;

public class MainMethod {

	public static void main(String[] args) {
		
		/*
		클래스 : Light(스마트전구), Tv(스마트Tv), Aircon(그냥 에어컨)
		인터페이스 : RemoteCon
		내용 : 스마트전구를 켜기 위해서 전용 리모컨이 필요하다.
				리모컨의 전원 버튼을 눌러 전구를 켜고 끄고 한다.
				
				Tv를 시청하기 위해 전용 리모컨이 필요하다.
				리모컨 전원버튼으로 Tv를 켜고 끄고 한다.
				
				더워서 에어컨을 켜야한다. 리모컨의 전원 버튼을 눌러 에어컨 켜기
		*/
		remoteCon 티비리모컨 = new Tv();
		remoteCon 에어컨리모컨 = new Aircon();
		remoteCon 스마트전구리모컨 = new Light();
		
		티비리모컨.onOff();
		에어컨리모컨.onOff();
		스마트전구리모컨.onOff();
	
		티비리모컨.onOff();
		에어컨리모컨.onOff();
		스마트전구리모컨.onOff();
	
		티비리모컨.Boom();
		
		// 한꺼번에
		remoteCon [] rcon = new remoteCon[] {
				new Light(), new Tv(), new Aircon()
		};
		for(remoteCon con : rcon) {
			con.onOff();
			con.onOff();
			con.Boom();
		}
		
		
	}

}
