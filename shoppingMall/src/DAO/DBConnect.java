package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	private void connection() {
		
		// 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		// 계정 로그인
		String user = "smanager";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/shopping_mall";
		
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("환영합니다.");
		} catch (Exception e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
		
		
	}
	
}
