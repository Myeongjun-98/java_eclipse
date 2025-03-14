package thread2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor		// final있는 매개변수에 한해 생성자메서드가 생성됨
@Getter
public class Order {
	private static int counter = 1;
	private final int orderId;	//주문 번호
	private final String menu;	//	주문 메뉴
	
	public Order(String menu)	{
		this.orderId = counter++;
		this.menu = menu;
	}
	
	
	
	
}
