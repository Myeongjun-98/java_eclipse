package Service;

import java.util.Scanner;

import DAO.MemberDAO;

public class MemberService implements ActiveService{
	public void signUp() {
		System.out.println("회원 가입 완료");
	}
	
	private MemberDAO dao;	// MemberDAO는 회원 관련 데이터베이스작업을 위한 클래스
	
	public MemberService() {
		this.dao = new MemberDAO();
	}
	
	public String signIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n---- 로그인 ----");
		System.out.print("Id : ");
		String mId = scan.nextLine();
		System.out.print("PW : ");
		String mPw = scan.nextLine();
		// 로그인을 위해서 입력한 아이디와 비밀번호를 테이블에 조회한다.
		if(dao.userIdAndPassword(mId, mPw))
			return mId;	// 로그인 성공했다면 입력한 아이디 리턴
		return null;	// 로그인 실패시 null 리턴
		}
		
		
		
		
	
	
}
