package thread2;

public class Barista implements Runnable{
	private final Cafe cafe;
	
	public Barista(Cafe cafe) { // 바리스타가 일하는 카페를 넣어줘야 주문을 받지!!
		this.cafe = cafe;
	}
	
	@Override
	public void run() {
		System.out.println("바리스타 스레드 동작");
		try {
			while(true	) {
				Order order = cafe.give();
				System.out.println("바리스타 제조 : " + order.getOrderId() + " - " + order.getMenu());
				Thread.sleep(3000);	// 그냥 주문 시간 설정만한거 nullPointer과 상관없음
				System.out.println("바리스타 제조 완료 : " + order.getMenu());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
