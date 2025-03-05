package generic1;

public class MainMethod {

	public static void main(String[] args) {
		
		Drink<String, String> drink = new Drink<String, String>();
		drink.name = "토마토주스";
		drink.ml = 350;
		System.out.println(drink.name + " " + drink.ml);
		drink.경림추천("솔의눈");
		
		Integer m; //	int 기본타입의 자바 클래스명
		Byte b;		//		byte의...
		Float f;		// 	float 기본타입의 자바 클래스명
		Double d; 	//		double 기본타입의 자바 클래스명
		Short s;	//		short의..
		Long l;		//		long의...
		
		Character c;	//	char의...
		Boolean bl;	//	boolean의...
		
	}

}
/*
	제네릭 - 속에 특유한, 속명
		클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방법
		제네릭 타입으로는 무조건 클래스타입, 인터페이스만 가능
		(기본타입인 int, byte, long, char 등등..)
	-> int : Integer 클래스
		


*/