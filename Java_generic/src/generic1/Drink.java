package generic1;

public class Drink<T, W> {	// 여러개 사용 가능
	T name;
	int ml;
	
	public void 경림추천(T name) {
		this.name = name;
		System.out.println(this.name);
		
		
	}
}
