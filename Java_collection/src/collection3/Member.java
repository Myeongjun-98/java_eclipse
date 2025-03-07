package collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor	// 기본생성자 메서드 만들어내는거
@AllArgsConstructor
public class Member implements Comparable<Member>{	// CompareTo()를 하기 위해 상위 클래스 불러오기
	private Long id;					// 회원번호
	private String memberId;	// 회원 아이디
	private String email;			// 회원 이메일
	private String password;	// 회원 비밀번호
	private String birth;			// 생년월일(8자리)
	private int age;					// 나이
	/*		클래스 정의
	  	인스턴스변수의 접근 제어자는 private
	  	인스턴스 변수에 대해 get, set 메서드
	  	toString 메서드 만들기		*/
	
//	public Member() {};	//	ㄴ이거 안써도됨
//	public Member(Long id, String memberId, String email, String password, String birth) {
//		this.id = id;
//		this.memberId = memberId;
//		this.email = email;
//		this.password = password;
//		this.birth = birth;
//	}
	
	// 컬렉션에서 contains, indexOf와 같은 비교하는 동작메서드를 사용하려면
	// 사용자정의 클래스에서는 equals를 구현해야한다.
	
	@Override
	public boolean equals(Object obj) {	// equals()의 매개변수가 Object인 이유
		Member temp = (Member)obj;		// Object클래스 메서드의 equals를 오버라이딩 하기 위해
		boolean isSame = this.birth.equals(temp.birth);		// 나중추가1
		isSame = isSame && this.email.equals(temp.email);	// 2
		isSame = isSame && this.memberId.equals(temp.memberId);	// 3
		return isSame;	// 4
	}
	
	@Override
	public int compareTo(Member o) {
		// 정렬을 위한 compareTo 메서드 구현
		// 정렬 기준을 정해야함.
//		return this.birth.compareTo(o.birth);
		// 내림차순시 return o.birth.compareTo(this.birth);
		// or return this.birth.compareTo(o.birth)-1;
		return this.age - o.age;
	}
	
//	// 오버로딩 하지 말라했는데 써버림 ;; 아무튼 됨
//	public boolean equals(Member m) {	// Member클래스에 equals()가 있으니
//		return this.birth.equals(m.birth);	//	매개변수를 Member타입으로 지정 가능(오버로딩)
//	}														// 아직 쓰지 말라고함
	
	
}
