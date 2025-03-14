package Control;

import java.util.Scanner;

import DAO.DBConnect;
import Service.Managing;

public class MyMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		System.out.println("\n\n===============메뉴================");
		System.out.println("1. 상품 목록");
		System.out.println("2. 상품 검색");
		System.out.println("3. 출고 요청 -> (재고 확인) ");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		Managing m = new Managing();
		while(true) {
			switch(menu()) {
			case 1 :	// 상품 목록 출력
				m.itemList();
			
				break;
			case 2 : // 상품 검색 및 출력
			   m.searchItem();
				
				break; // 회원가입
			case 3 :	 // 출고요청시 재고확인
			default: return;
			}
		}
	}

}
