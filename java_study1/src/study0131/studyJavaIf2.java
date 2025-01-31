package study0131;

import java.util.Scanner;

public class studyJavaIf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본 시간은 30분이다.
		// 10분당 100원씩 추가요금
		// 34분 주차시 1000원, 40분 주차시 1100원, 51분 주차시 1200원
		int 주차시간 = 0;
		System.out.print("주차시간 : ");
		주차시간 = scan.nextInt();
//		/*if (주차시간 <= 0)
//			System.out.println("회차입니다.");
//		else*/ 
//			if (주차시간 <= 30)
//			System.out.println("1000원입니다.");
//			else {
//			int 추가주차요금 = ((주차시간-30)/10) * 100 + 1000;
//			System.out.println(추가주차요금 +"원 입니다.");
//		}
		
//		if (주차시간/3 < 4)
//			System.out.println("1000원 입니다.");
//		else {
//			int 추가주차요금 = ((주차시간-30)/10) * 100 + 1000;
//			System.out.println(추가주차요금 +"원 입니다.");
//		}
		
		int 기본시간 = 30;
		int 요금 = 1000;				// 기본요금 1000원
		int temM = 100;				// 10분에 100원 추가요금
		
		if (0 < 주차시간 && 주차시간 <= 39) {}
		else {
			주차시간 = 주차시간 - 기본시간;
			요금 = (주차시간/10) * temM + 요금;
		}
		System.out.println("주차 요금 : " + 요금);
		
		
			
		
		
		
		
		
		
	}

}
