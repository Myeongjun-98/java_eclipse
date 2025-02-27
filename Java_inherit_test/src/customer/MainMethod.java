package customer;

import java.sql.*;
import java.util.Scanner;
import java.util.Date;

import com.mysql.cj.protocol.Resultset;

import store.*;
public class MainMethod {

	public static void main(String[] args) {
//	다형성 최종 - 카페에서 과일주스를 구매하는 과정 만들기
		
		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면?
		// 바나나 -15개, 포도 - 6개, 오렌지 - 54개
		
//		Banana[] banana = new Banana[15];
//		
////		banana[0].makeJuice();  아직 banana 객체 없기에 null이기에 오류
//		
//		banana[0] = new Banana(2500,500);
//		banana[1] = new Banana(3500,500);
//		banana[2] = new Banana(4500,500);
//		banana[3] = new Banana(5200,500);
//		
//		banana[0].pieceFruit();
//		
		
		/* 다형성 : 하나의 타입으로 여러 타입을 다룰 수 있다.
				상속 관계, implements
		*/
		
//		Fruit banana = new Banana(2500,500);
//		banana.makeJuice();
//		
//		Fruit grape = new Grape(3500,400);
//		grape.makeJuice();
		
		Fruit[] menu = new Fruit[10];
//		menu[0] = new Banana(2500,350);
//		menu[1] = new Banana(3000,400);
//		menu[2] = new Orange(3500,400);
//		menu[3] = new Banana(3500,500);
//		menu[4] = new Grape(4500,350);
//		menu[5] = new Banana(4500,550);
//		menu[6] = new Grape(5000,450);
//		menu[7] = new Orange(4000,350);
//		menu[8] = new Orange(5000,550);
//		menu[9] = new Grape(6000,600);
		
		////////////////////////////////////// 데이터베이스 연결하기 (드라이버 로드)
		// com.mysql.cj.jdbc.Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 실패!!!!!!");
			e.printStackTrace();
		}
		// 계정 로그인
		String/*정해진 변수명 아니니까 맘대로 써도 됨*/ user = "mjk";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/mjk";
		
		// 데이터베이스와 연결한 객체를 저장해둬야 한다.
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 실패!!!!!!!!!");
			e.printStackTrace();
		}
		
		// 쿼리문 작성하여 보내고 받기
		// select * from store_menu;
		String sql = "select * from store_menu";	// 조회 쿼리문
		
		// 작성한 쿼리문을 데이터베이스에 보내려면
		// Statement, PreparedStatement(보안적으로 지향됨)

		Statement st = null;	//	쿼리문 보낼 때 필요
		ResultSet rs = null;	// 조회결과 받을 때 필요
		
		try {
			st = conn.createStatement();	// 쿼리문 전송하기 위한 준비
			rs = st.executeQuery(sql);		//	쿼리문 보내고 결과 받기
			
			//rs.next() 를 통해서 조회된 결과값이 존재하는지 확인
			for(int i= 0; rs.next(); i++) {
				
				int cost = rs.getInt("cost");		// 금액
				int cap = rs.getInt("capacity");	// 용량
				String type = rs.getString("fruit_type");
				
				if(type.equals("banana")){
					menu[i] = new Banana(cost, cap);
				}
				if(type.equals("grape")){
					menu[i] = new Grape(cost, cap);
				}
				if(type.equals("orange")){
					menu[i] = new Orange(cost, cap);
				}
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("쿼리문 조회 실패ㅐㅐ~~");
			e.printStackTrace();
		}
		
		// 데이터베이스에서 조회한 데이터들을 바나나, 오렌지, 포도 객체로 저장될수 있게 하기
		
		
		
		Buyer ctm1 = new Buyer(10000);	//	구매자
		System.out.println("보유머니 : " + ctm1.getMoney()  );

		for(int i = 0; i < menu.length; i++) {
		System.out.println((i + 1) + ". " + menu[i]);
		}
		System.out.println(ctm1);
		// 출력 결과 -> 보유 머니 : 10000원
	
		// 어떤 주스를 사먹을꺼냐!!
		Scanner scan = new Scanner(System.in);
		System.out.print("구매 번호 : ");
		int num = scan.nextInt();
		
		// 결제 진행하고 언제 주스를 사먹었는지 어떤 주스인지 기록
		ctm1.setMoney(ctm1.getMoney() - menu[num-1].getCost());
		// Fruit의 인자들이 protected이기 때문에 get, set메서드 사용
		System.out.println("남은 금액은 " + ctm1.getMoney() + "원 입니다.");
		
		ctm1.setBuyDate(new Date());
		ctm1.setItem(menu[num-1]);
		
		System.out.println(ctm1);
		
		
	}
/*	
	자바프로그램에서 데이터베이스 사용하기
		1. 데이터베이스와 연결하기 위한 드라이버 로드
		2. 계정 로그인
			2-1 mysql 주소
			2-2 계정명
			2-3 DB명
			2-4 계정정보(Id, Pw)
		3. 쿼리문 작성하여 주고받고하기
	
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
