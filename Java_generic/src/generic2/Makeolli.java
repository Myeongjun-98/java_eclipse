package generic2;

public class Makeolli extends Alcohol{
	
	public Makeolli(String name, String cmp, int abv) {
		super(name, cmp, abv);
	}
	
	@Override
	public String toString() {
		return "막걸리 : " + cmp + ", " + name + ", 도수 : " + abv + "%";
	}
}

