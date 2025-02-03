package study0203;

import java.util.Scanner;

public class study0203Random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// random = 0.XXXX..... ~ 0.9999...
		// decimal(0,16)
		double num = Math.random();
		System.out.println(num);
		
		// 연산 우선순위 
		// ()		>		 .		>		*
		num = (int)Math.random() * 10;
		System.out.println(num);
		// 0이나옴
		num = (int)(Math.random() * 10);
		System.out.println(num);
		
		// num값이 5.999999... 까지 나오게 하고 싶다면,
		num = (int)(Math.random() * 6);
		System.out.println(num);
		// 0.9999999...가 최대값이므로, 6을 곱하면 6을 넘지 않음
		
		// num값을 1~10으로 하고 싶다면,
		num = (int)((Math.random() * 10) + 1);
		System.out.println(num);
		// 11을 원하면 곱하기에 11 하면 됨
		
		// num값을 7~13으로 하고 싶다면,
		num = (int)((Math.random() * 7) + 7);
		System.out.println(num);
		// r * (큰 값 - 작은 값 + 1) + (범위중 작은 값)
		
		//////////////////////////////
//		int user, coin;
//		System.out.println("동전 앞/뒤 맞추기를 플레이합니다.");
//		System.out.print("1. 앞면, 2. 뒷면 : ");
//		user = sc.nextInt();
//		
//		coin = (int)(Math.random() * 2 + 1);
//		
//		if (coin == user) {
//			System.out.println("성공!");
//		}else {
//			System.out.println("실패...");
//		}
		
		// 컴퓨터가 동전을 15개 가지고 있다.
		// 컴퓨터가 제시한 동전 갯수가 짝인지 홀인지 맞추는 게임을 만드세요.
		// 1. 짝 2. 홀
		int coinAmount, select, isCoinEven;
		System.out.println("컴퓨터가 동전 갯수를 제시합니다.");
		System.out.print("동전 갯수가 짝수같다면 1, 홀수같다면 2를 입력하세요. : ");
		select = sc.nextInt();
		
		coinAmount = (int)(Math.random()* 15 + 1);
		System.out.println("제시된 동전 갯수 : " + coinAmount + "개");
		
		isCoinEven = coinAmount % 2 + 1;
		if (isCoinEven == 1) {
			System.out.println("제시된 동전은 짝수입니다.");
		}else
			System.out.println("제시된 동전은 홀수입니다.");
		if (select == isCoinEven) {
			System.out.println("정답!");
		}else
			System.out.println("실패...");
		
		// 주사위게임 ( 육면체 )
		// 컴퓨터가 주사위를 던진다.
		// 주사위 값이 3 이하라면 작은 값, 주사위값이 4 이상이라면 큰 값이다.
		// 1. 작다. 2. 크다.
		// 주사위값이 작은 값은지 큰 값인지 맞추세요.
		int user, dice;
		System.out.println("컴퓨터가 주사위를 굴리는 중...");
		System.out.println("");
		System.out.println("※ 주사위의 값이 4 미만일 것 같다면 1,");
		System.out.println(" 4 이상일 것 같다면 2를 입력하세요.");
		System.out.print("값 입력 : ");
		user = sc.nextInt();
		System.out.println("");
		
		dice = (int)(Math.random()* 6 + 1);
		System.out.println("주사위 값 : " + dice);
		if (dice > 3) {
			System.out.println("주사위의 값은 큰 값입니다.");
		}else
			System.out.println("주사위의 값은 작은 값입니다.");
	
//		if (dice > 3 && user == 2) {
//			System.out.println("정답입니다!");
//		}else if (dice <= 3 && user == 1) {
//			System.out.println("정답입니다!");
//		}else if (!(user == 1 || user == 2)) {
//			System.out.println("1이나 2를 입력해주세요.");
//		}else
//			System.out.println("실패...");
	
		if (user == 1 || user == 2) {
			if  (dice > 3 && user == 2) {
				System.out.println("정답입니다!");
			}else if (dice <= 3 && user == 1) {
				System.out.println("정답입니다!");
			}else
				System.out.println("실패...");
		}else System.out.println("1이나 2를 입력해주세요.");
	
	
	
		
		
		
		
	}


}