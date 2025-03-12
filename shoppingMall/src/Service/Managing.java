package Service;

import DAO.ManageDAO;

public class Managing implements Manage{
	
	private ManageDAO dao;

	public void showingItem() {dao = new ManageDAO();}
		
	public void itemList() {		// 목록
		System.out.println(dao);
	}
	
	public void search() {	//	상품 검색 기능
		
	}
	
	public void check() {	//	재고 확인
		
	}
}
