package DAO;

import java.util.LinkedList;
import VO.ShoppingMall;

public class ManageDAO extends DBConnect{
	
	public LinkedList<ShoppingMall> showing() {
		String sql = "select * from storage order by id";
		LinkedList<ShoppingMall> showItemList = new LinkedList<>();
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
		
		return showItemList;
		
		//DB에서 가져오고 컬렉션안데 담아두고 데이터를 사용해야 하는 곳에 보내는거 만 하니까  
		//  필요한 변수들은 지역변수로 쓰는게.....  
		//  컬렉션에 저장하기전에 컬렉션의 제네릭 타입 클래스 객체에 데이터를 저장하고 컬렉션에 넣어주기
		// 그리고 반환 한다.
	}
	
	public LinkedList<ShoppingMall> searching (String itemName) {
		String sql = "select * from storage where item_name like '%" + itemName + "%'";
		
			LinkedList<ShoppingMall> showItemList = new LinkedList<>();
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
				System.out.println("상품검색 실패");
				e.printStackTrace();
			}
			return showItemList;
	}
}
