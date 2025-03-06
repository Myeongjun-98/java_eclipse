package collection3;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao extends DBConnect{

	// 테이블에서 데이터 가져오기
	public ArrayList<Member> select() {
		String sql = "select * from member1";
		
		ArrayList<Member> list = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Member m = new Member(rs.getLong("id"), rs.getString("member_id"), rs.getString("email"), rs.getString("password"), rs.getString("birth"));
			
				list.add(m);
			}
			
		} catch (SQLException e) {
			System.out.println("member1 조회 실패");
		}return list;
		
	}
	
	
}
