package study0220;

public class Member {
	String userId;	// 아이디
	String passWord;	// 비밀번호
	long id;		// 회원번호
	
	Member(){};
	Member(String userId, String passWord, long id){
		this.userId=userId;
		this.passWord=passWord;
		this.id=id;
	};
	
	public String toString() {
		return "아이디 : " + this.userId + "비밀번호 : " + this.passWord + "회원번호: " + this.id;
	}
	
//	void output() {
//		System.out.println("아이디 : " + this.userId);
//		System.out.println("비밀번호 : " + this.passWord);
//		System.out.println("회원번호: " + this.id);
//	}
	
}
