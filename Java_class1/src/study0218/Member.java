package study0218;

public class Member {
	String name;		// 이름,	인스턴스변수
	int age;				// 나이,	위와 동
	String job;		// 직업		동
	
	Member(){		// 기본 생성자 메서드
		this.name = "박문수";
		System.out.println(" 클래스 멤버" + this);
	}
	// 생성자 메서드
	// 생성자 메서드는 자바에서 클래스정의 시 기본 생성자 메서드도 같이 만들어진다.
	// 눈에 보이지 않게 생략 처리된것이지 없는것은 아니다.
	// 생성자 메서드는 클래스 객체 공간 생성 시 인스턴스들의 초기화를 담당하는 메서드이다.
	
		Member(int age, String job){
			this.age = age;
			this.job = job;
		}
		Member(int age, String job, String name){
			this.age = age;
			this.job = job;
			this.name = name;
		}
		/*		오버로딩 조건
			1. 메서드 이름이 같아야한다.
			2. 매개변수 타입이 같으면 안된다.
			3. 다만 매개변수 갯수가 다르면 성립한다.
			4. ** 하나의 클래스 내부에서만 가능하다.
		 */	
		
		/*		자바 변수 종류
			1. 인스턴스 변수
			2. 지역변수(매개변수가 포함됨)
			3. 클래스변수	*/
		
		/*		변수 우선순위(변수 이름이 같은경우)
			지역변수 > 인스턴스변수 >= 클래스변수
		
		
		*/
		
		
		
}
