package testMain;

public class AccountTransfer extends Pay{

	public AccountTransfer(){};
	public AccountTransfer(int price, String date) {
		super(price, date);
	}
	
	@Override
	public void processPay() {
		System.out.printf("%s금액 : %d원, 결제일 : %s\n", "계좌이체", this.price, this.date);
	}
	
}
