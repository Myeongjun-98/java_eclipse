package testMain;

public abstract class Pay {
	protected int price;
	protected String date;
	
	Pay(){};
	protected Pay(int price, String date){
		this.price = price;
		this.date = date;
	}
	
	public abstract void processPay();
	
}
