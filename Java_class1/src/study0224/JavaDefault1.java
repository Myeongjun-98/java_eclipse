package study0224;

public class JavaDefault1 {

	public static void main(String[] args) {
		
		Member m1 = new Member();		//	객체 생성, 인스턴스 생성
		
		System.out.println(m1.name);
		
		System.out.println(m1.count);
		
		System.out.println(Member.count);
		// 클래스변수는 특별하게 직접 클래스에서 호출할 수 있음
		
		System.out.println(m1);
	}

}
