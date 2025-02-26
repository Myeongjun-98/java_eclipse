package modifier;

public class User {
	public void view() {
		Microwave m = new Microwave();
//		System.out.println(m.brand);	//	Product의 brand가 protected라서 자식이 아니라서 안됨
											// brand가 public이면 사용 가능함
											// default는 같은 패키지가 아니라서 안됨
	}
}
