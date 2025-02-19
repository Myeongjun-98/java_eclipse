package study0219;

public class Item {
	String name;
	String brand;
	int stock;
	
	Item(){};		//	기본 생성자 메서드
	
	Item(String name, int stock){		// 상품명, 수량 초기화용
		this.name = name;
		this.stock = stock;
	}
	Item(String name, String brand, int stock){		// 전체 초기화용
		this.name = name;
		this.brand = brand;
		this.stock = stock;
	}
	
}
