package study0205;

import java.util.Scanner;

public class study0205Loop3 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
//		int i = 1;				// 초기값		//while의 초기값을 while식 전, 바깥에 설정
//		while(i <= 10) {		// 조건식
//		System.out.println(i);
//		i++;						// 증감식
//		}
//		반복 횟수가 정해져있는 경우 for문이 더 가독성이 좋다
//		반복 횟수가 없는 무한루프의 경우 while문이 더 가독성이 좋다.
		
		
		// 컴퓨터가 낸 1~50 사이의 랜덤값을 맞추기
//		int com = (int)(Math.random() * 50 + 1);
//		
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = scan.nextInt();
//			if (com == num) {
//				System.out.println("정답 ! ");
//				break;
//			}
//			if (com > num)
//				System.out.println("업");
//			if (com < num)
//				System.out.println("다운");
//		}
		
		// 동전 앞면 뒷면 맞추기 게임
		// 내 돈이 바닥날 때 까지 게임 진행
		System.out.print("당신의 총알은 얼마? : ");
		int money = scan.nextInt();
		final int 판돈 = 1000;												// final : 재 할당이 안됨 (JS의 const와 동일)
		int win = 0;
		
		while(true) {
			int coin = (int)(Math.random() *2 + 1); 					// 1 : 앞, 2 : 뒤
			System.out.print("1. 앞면, 2. 뒷면 : ");
			int user = scan.nextInt();
			
			if (user != 1 && user != 2) {									// 올바르지 않은 값 입력한 경우
				System.out.println("잘못 입력했음 다시");
				break;
			}
			
			if (user == coin) {													// 승패공식
				System.out.println("정답!");
				win++;
			}else System.out.println("땡!");	
			
			money -= 판돈;														// 판돈 소모
			System.out.println("남은 내 돈 : " + money );
			System.out.println("누적 승리 수 : " + win);
			if(money < 판돈) 													// 판돈 부족할 시
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
