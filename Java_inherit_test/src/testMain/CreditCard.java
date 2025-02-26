package testMain;

public class CreditCard extends Pay{

	public CreditCard(){};
	public CreditCard(int price, String date) {
		super(price, date);
	}
	
	@Override
	public void processPay() {
		System.out.printf("%s결제금액 : %d원, 결제일 : %s\n", "신용카드", this.price, this.date);
	}
	
	
	
}
