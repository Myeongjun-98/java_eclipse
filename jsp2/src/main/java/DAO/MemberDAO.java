package DAO;

import java.sql.*;

import DTO.Board;

public class MemberDAO {
	
	private Connection conn = null;
	private PreparedStatement pt = null;
	private ResultSet rs = null;
	
	public MemberDAO() {
		connect();
	}
	
	public boolean loginCheck(String email, String pw) {
		String sql = "select * from test_member where email = ? and password = ?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, email);
			pt.setString(2, pw);
			rs=pt.executeQuery();
			if(rs.next()) return true;
		} catch (Exception e) {
			System.out.println("아이디 및 비밀번호 조회 실패");
			e.printStackTrace();
		}
		return false;	// 로그인 실패 - 아이디 또는 비밀번호 틀림
	}
	
	// 게시판 테이블에 저장 메서드
	public void insert(Board board) {
		// 쿼리문 작성하고 PreparedStatement를 사용하여 저장되게 만들기
	}
	
	
	private void connect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String user = "kimfish";
			String pass = "dlddjzld123";
			String url = "jdbc:mysql://210.219.170.244:3306/kimfish";
			
			conn = DriverManager.getConnection(url, user, pass);
			
		}catch(Exception e){
			System.out.println("sql 드라이버 로드 실패!");
			e.printStackTrace();
		}
	}
	
}
