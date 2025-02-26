package testMain;

public class Cash extends Pay{
	public Cash(){};
	public Cash(int price, String date) {
		super(price, date);
	}
	
	@Override
	public void processPay() {
		System.out.printf("%s결제금액 : %d원, 결제일 : %s\n", "현금", this.price, this.date);
	}
}
