package generic2;

public class Service {
public void drink(Bottle<? extends Alcohol> sj) {	// 알코올섭취
		System.out.println(sj.item);
		System.out.println("한 잔 마신다.");
	}
	
//	public void drink(Bottle<Makeolli> mk) {		// 같은 타입임!(?)
//		System.out.println(mk.item);					//	MainMethod에서 변수로는 다르게 여겨지지만
//		System.out.println("한 그릇 마신다.");		//	오버로딩에서는 같은 타입으로 취급됨....
//	}
	
	
}
