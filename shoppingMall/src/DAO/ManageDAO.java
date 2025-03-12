package DAO;

import java.util.LinkedList;
import VO.ShoppingMall;

public class ManageDAO extends DBConnect{
	
	public LinkedList<ShoppingMall> showItemList = new LinkedList<>();
	
	String sql = "select * from storage";
	
	public void showing() {
		try {
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ShoppingMall data = new ShoppingMall(
					rs.getInt("id"), rs.getString("item_name"), rs.getInt("price"), rs.getInt("stock")
					);
				showItemList.add(data);
			}
			
		} catch (Exception e) {
			System.out.println("목록 불러오기 실패");
			e.printStackTrace();
		}
	}
	
	
}
