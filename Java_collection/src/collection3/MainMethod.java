package collection3;

import java.util.ArrayList;
import java.util.Collections;

public class MainMethod {

	public static void main(String[] args) {
		
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add( new Member(1l, "jkr", "jkr@naver.com","1234","19990101") );
//		list.add(new Member(2l,"dw","dw@gmail.com","1234","19981010"));
//		System.out.println(list);
		
		MemberDao dao = new MemberDao();
		
		ArrayList<Member> memberList = dao.select();
//		System.out.println(memberList);
		for(Member m : memberList) {
			System.out.println(m);
		}
		
		// 이메일로 아이디와 비밀번호를 조회하기
		String email = "brown@gmail.com";
		for( Member mem : memberList ) {
			if(mem.getEmail().equals(email)) {
				System.out.println("아이디 : " + mem.getMemberId());
				System.out.println("비밀번호 : " + mem.getPassword());
				break;
			}
		}

		// memberList.contains(대상);
		// 타입에 대해서도 비교하기 때문에 동일한 타이븡로 비교할 수 있게.
		// email은 String 클래스 타입이라 안됨. 그래서 Member클래스 객체에 
		// email을 담아서 비교되게 함
		
//		Member 대상 = new Member();
//		대상.setEmail(email);
//		
//		for ( int i = 0; i < memberList.size(); i++) {
//			Member cmp = memberList.get(i);
//			if(cmp.equals(대상)) {
//				System.out.println("찾음");
//			}
//		}
		
//		System.out.println(memberList.contains(대상));
		
		// memberList에 등록된 사람들중에서
		// 장은호 생년월일과 같은 회원이 있는지
		Member 장은호 = new Member();
		장은호.setBirth("19970818");
		장은호.setEmail("babo@daum.net");	// 나중추가
		장은호.setMemberId("kkk1");		// 나중추가
		
		for( int i = 0; i < memberList.size(); i++) {
			Member cmp = memberList.get(i);
			if(cmp.equals(장은호)) {
				System.out.println("찾은듯?");
			}
		}
		System.out.println(memberList.contains(장은호));
		System.out.println(memberList.indexOf(장은호));
		
		Collections.sort(memberList);
		System.out.println(memberList);
		
		
		
		
	}

}
