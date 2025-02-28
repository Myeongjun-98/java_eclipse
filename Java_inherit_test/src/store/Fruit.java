package store;

public abstract class Fruit {
	protected int cost;	// 판매 금액
	protected int capacity;	// 용량

	protected Fruit() {};
	protected Fruit(int c, int cp) {
		this.cost = c;
		this.capacity = cp;
	}
	public abstract void makeJuice();	//과일 주스만들기
	// 부모클래스가 가지고있는 메서드 중 자식이 변경하지 못하게 할 메서드가 있다면
//	public "final" void pieceFruit() {}		// 이렇게
	public abstract void pieceFruit();	// 과일 소량 컵에 팔기
	
	
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
