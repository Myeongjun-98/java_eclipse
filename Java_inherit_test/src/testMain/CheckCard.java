package testMain;

public class CheckCard extends Pay{
	public CheckCard(){};
	public CheckCard(int price, String date) {
		super(price, date);
	}
	
	@Override
	public void processPay() {
		System.out.printf("%s결제금액 : %d원, 결제일 : %s\n", "체크카드", this.price, this.date);
	}
	
	
	
	
}


