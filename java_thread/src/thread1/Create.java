package thread1;

public class Create extends Thread{
	
	public static Dino egg = null;
	public static void hatch(Dino dino) {
		egg = dino;
	}
	
	@Override
	public void run() {
		Dino myEgg = null;
		while(true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
// egg에 값이 들어오고 myEgg가 null인 경우는 공룡알 부화 시작 안 한 상태
// egg에 값이 들어왔지만 myEgg변수가 값을 가진 경우는 부화중인 상태
			if( egg != null && myEgg == null) {
				myEgg = egg;
				egg = null;
				System.out.println(myEgg.getName() + " 부화 시작!");
				try {
					Thread.sleep(myEgg.getTime()*1000);
				} catch (InterruptedException e) {
					System.out.println("부화 시도 실패");
					e.printStackTrace();
				}
				System.out.println(myEgg.getName() + " 공룡 태어남");
				myEgg = null;
			}
		}
	}
}

// 스레드에서 처음 실행되는 메서드가 run이다.
// 즉, run메서드가 종료되면 스레드 사라짐