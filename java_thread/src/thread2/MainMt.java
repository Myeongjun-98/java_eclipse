package thread2;

public class MainMt {

	public static void main(String[] args) {

//		Customer c1 = new customer();	
//		c1.start();
		
//		Thread c1 = new Thread(new Customer());		
//		// Customer가 Runnable을 implements했기에 직접 객체를 만들어서 활용할 수 없음(?)
//		// 그래서 Thread객체를 만들어 Runnable을 implements한 Customer을 활용하는 방향으로 ..
//		c1.start();
		
		/* 카페에서 손님이 주문한다.
				주문을 하면 바리스타가 제조한다.
				몇 명의 손님이 주문하든지 주문한 순서대로 바리스타들이 제조해야한다.
		*/

		Cafe cafe = new Cafe();	// 카페 오픈
		
		Thread barista = new Thread(new Barista(cafe));
		Thread customer = new Thread(new Customer(cafe));
		
		barista.start();	// 바리스타 스레드 시작 - 제조할 준비 완료
		customer.start();	// 손님 스레드 시작 - 주문할 결심
		
		
		
		
		
		
		
		
		
		
		
	}

}

// Thread 상속
// Runnable