package interface5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	
	protected Connection conn;	// 계정 로그인 상태 저장
	protected Statement st;
	protected ResultSet rs = null;
	
	protected DBConnect() {
		connection(); // 데이터베이스 연결 메서드
		
	}
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "mjk";	// (계정명)
			String password = "1234"; // (비밀번호)
			String url = "jdbc:mysql://localhost:3306/mjk"; // DB주소 / DB명
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결 실패");
			e.printStackTrace();
		}
	}
	
}
