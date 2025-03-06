package collection3;

import java.util.ArrayList;

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
		
		
		
	}

}
