package study0131;

import java.util.Scanner;

public class homework0131 {

	public static void main(String[] args) {
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본 시간은 30분이다.
		// 10분당 100원씩 추가요금
		// 34분 주차시 1000원, 40분 주차시 1100원, 51분 주차시 1200원
		// 2시간 주차시 기본요금은 1700원이다.
		// 10분당 100원씩 추가 요금
		// 2시간 10분 주차하면 1800원, 3시간 21분 주차하면 2500원
		// 4시간 이상 주차시 기본요금은 2500원이다.
		// 4시간 15분 주차시 2600원이다.
		// 8시간 이상 주차시 무조건 10000원이다.
		// 주차시간(몇시간 몇분) 입력하여 주차요금이 얼마인지 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		int defaultPrice = 1000;
		int defaultPrice2h = 1700;
		int defaultTime = 30;
		int defaultTime2h = 120;
		int defaultPrice4h = 2500;
		int defaultTime4h = 240;
		int defaultPrice8h = 10000;
		int extraPrice = 100;
		int totalPrice = 0;
		int time = 0;
		int 시간 = 0;
		int 분 = 0;
		System.out.println("주차시간을 입력하세요.");
		System.out.print("주차시간 : □시간 __분 : ");
		시간 = scan.nextInt();
		System.out.print("주차시간 " + 시간 + "시간"  + " □□분  : ");
		분 = scan.nextInt();
		time = 시간 * 60 + 분;
		
		if (time >= 0 && time <= 39) 
			{ totalPrice = defaultPrice;
				} else if (time >= 40 && time <= 119) {
					totalPrice = defaultPrice + ((time - defaultTime) / 10) * extraPrice ;
					}else if (time >= 120 && time <= 129) {
						totalPrice = defaultPrice2h;
						}else if (time >= 130 && time <= 239) {
							totalPrice = defaultPrice2h + ((time - defaultTime2h) / 10) * extraPrice ;
								}else if (time >= 240 && time <= 249) {
									totalPrice = defaultPrice4h;
									}else if (time >= 250 && time <= 479) {
										totalPrice = defaultPrice4h + ((time - defaultTime4h) / 10) * extraPrice ;
										}else if (time >= 480) {
											totalPrice = defaultPrice8h;}
		System.out.println("당신의 요금은 " + totalPrice + "원 입니다.");
			
		
		
			
		
		
		
		
		
		
		
	}

}
