package genericTest;

public class Snack {
	protected String snackName;
	protected int price;
	
	protected Snack(String snackName, int price) {
		this.snackName = snackName;
		this.price = price;
	}

	@Override
	public String toString()	{
		return "이름 : " + snackName + ", 가격 : " + price; 
	}
}
