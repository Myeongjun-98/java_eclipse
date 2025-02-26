package customer;

import store.Banana;
import store.Fruit;
import store.Grape;
import store.Orange;

public class MainMethod {

	public static void main(String[] args) {
		
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
		menu[0] = new Banana(2500,350);
		menu[1] = new Banana(3000,400);
		menu[2] = new Orange(3500,400);
		menu[3] = new Banana(3500,500);
		menu[4] = new Grape(4500,350);
		menu[5] = new Banana(4500,550);
		menu[6] = new Grape(5000,450);
		menu[7] = new Orange(4000,350);
		menu[8] = new Orange(5000,550);
		menu[9] = new Grape(6000,600);
		
		Buyer ctm1 = new Buyer(10000);	//	구매자
		System.out.println("보유머니 : " + ctm1.getMoney()  );

		for(Fruit f : menu) {
		System.out.println(f);
		// 출력 결과 -> 바나나 2500원 350ml
		}
		System.out.println(ctm1);
		// 출력 결과 -> 보유 머니 : 10000원
	
	
	
	}

//	다형성 최종 - 카페에서 과일주스를 구매하는 과정 만들기
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
