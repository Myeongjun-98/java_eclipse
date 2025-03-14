package Service;

import java.util.LinkedList;
import java.util.Scanner;

import DAO.ManageDAO;
import VO.ShoppingMall;

public class Managing implements Manage{
	Scanner scan = new Scanner(System.in);
	
	private ManageDAO dao;

	public Managing() {dao = new ManageDAO();}// 생성자와 리턴타입은 같이 쓸수 없음!!!
		
	public void itemList() {		// 목록
		LinkedList<ShoppingMall> list = dao.showing(); 
		//DB에서 필요한 데이터들을 가져와서 컬렉션을 통해서 저장되게 해준다. 
		//컬렉션에 저장하려면 클래스 객체에 데이터를 저장하고 그다음에 컬렉션에 저장한다. 
		//ArrayList나 LinkedList나 Vector를 사용한다. 
		//지금 경우는 단순하게 상품들을 가져오는거니까 ArrayList를 쓰는게 적합하다.  
		
		//가져왔으니까 출력한다.
		for(ShoppingMall item : list) {
			System.out.println( item );
		}
	}
	
	public void searchItem() {	
		System.out.println("\n---- 상품 검색 ----\n");//	상품 검색 기능
		System.out.print("검색어를 입력하세요 : ");
		String word = scan.nextLine();
		LinkedList<ShoppingMall> list = dao.searching(word);
		for(ShoppingMall item : list) {
			System.out.println( item );
		}
	}
	
	public void checkStock(int stock) {
		System.out.println("");//	재고 확인
		
	}
}
