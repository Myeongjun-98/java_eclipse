package customer;

import java.util.Date;

import store.Fruit;

public final class Buyer {	// 부모클래스로 만들지 말라는 개발자사이의 언어
	private int money;
	private Fruit item;
	private Date buyDate;
	
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
	

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	
	@Override
	public String toString() {
		return "보유머니 : " +  this.money + "원 " + "구매일 : " + this.buyDate + " 구매음료 : "	+ this.item;
	}
	
	// set, get 메서드
	
	
	
	
	
	
}
