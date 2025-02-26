package customer;

import store.Fruit;

public class Buyer {
	private int money;
	private Fruit item;
	
	public Buyer(int money) {		// Buyer객체 생성 시 동작 할 생성자메서드
		this.money = money;		// 객체 생성 시 money변수를 꼭 작성해야함
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public void setItem(Fruit item) {
		this.item = item;
	}
	public String toString() {
		return "보유 머니 " + this.money;
	}
	
	
	
	// set, get 메서드
	
	
	
	
	
	
}
