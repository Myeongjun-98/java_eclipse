package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.Board;

public class BoardDao {
	private Connection conn = null;
	private PreparedStatement pt = null;
	private ResultSet rs = null;
	
	public BoardDao() {
		connect();
	}
	
	public void insert(Board board) {
		String sql = "insert into jsp_board(writer, title, content, write_date)" + 
	" values(?, ?, ?, now())";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, board.getWriter());
			pt.setString(2, board.getTitle());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시글 저장 실패");
			e.printStackTrace();
		}
		// values(? , .... , now() )
//		쿼리문 작성하고 PreparedStatement를 
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

	public ArrayList<Board> select() {
		
		ArrayList<Board> list = new ArrayList<>();
		
		String sql = "select * from jsp_board order by board_id desc";
		
					try {
						pt = conn.prepareStatement(sql);
						rs = pt.executeQuery();
						while(rs.next()) {
							Board data = new Board(rs.getInt("board_id"), rs.getString("writer"), rs.getString("title"), 
									rs.getString("content"), rs.getDate("write_date").toLocalDate());
							list.add(data);
						}
					} catch (Exception e) {
						System.out.println("게시글 저장 실패");
						e.printStackTrace();
					}
		
		return list;
	}
	
	
	
}
