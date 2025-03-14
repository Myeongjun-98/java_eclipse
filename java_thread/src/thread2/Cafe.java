package thread2;

public class Cafe {
	private Order order;
	private boolean orderPlace = false;	// 주문했나(true) 안했나(false)
	
	public synchronized void placeOrder(String menu) throws InterruptedException	{
		while(orderPlace) {
			wait();
			
		}
		
		
		order = new Order(menu);
		System.out.println("손님 매장주문 : " + order.getOrderId() + " -  " + order.getMenu());
		orderPlace = true;
		notify();	// 주문이 들어갔으니까 바리스타 일함
	}

	public synchronized Order give() throws InterruptedException {
		while(!orderPlace) {
			wait(); // 주문이 들어오기 전가지 바리스타는 대기
		}
		orderPlace = false;
		notify();
		return order;
	}
	
//	public void takeOrder(String menu) {
//		order = new Order(menu);
//		System.out.println("손님 포장주문 : " + order.getOrderId() + " - " + order.getMenu());
//	}
	
	
}
