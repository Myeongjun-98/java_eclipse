package study0206;

import java.util.Scanner;

public class study0206LoopTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	/* 컴퓨터와 주사위게임을 한다
		각각 주사위 2개를 던져서 주사위 합이 큰 쪽이 이긴다.
		단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		둘 다 같은 숫자가 나왔다면 합이 큰 쪽이 이긴다.
		5판 진행, 승패무를 출력
	*/
	
		int mine1 = 0;
		int mine2 = 0;
		int com1 = 0;
		int com2 = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		int game = 0;
		
		do {
			mine1 =(int)(Math.random()*6+1);
			mine2 = (int)(Math.random()*6+1);
			com1 = (int)(Math.random()*6+1);
			com2 = (int)(Math.random()*6+1);

			int mySum = mine1 + mine2;
			int comSum = com1 + com2;
			int result = mySum - comSum;
			
			System.out.println("내 주사위 합 : " + mine1 + " + " + mine2 + " = "  + mySum);
			System.out.println("컴퓨터 주사위 합 : " + com1 + " + " + com2 + " = "  + comSum);
			
			
			if (mine1 == mine2 || com1 == com2) {			// 같은 수 발생 시
				
				if(mine1 == mine2 && com1 == com2) {		// 둘 다 같은 수가 발생했다면
					if(result == 0) {
						System.out.println("비겼습니다!");
						draw++;
					}
					if(result < 0) {
						System.out.println("졌습니다..");
						lose++;
					}
					if(result > 0) {
						System.out.println("이겼습니다!");
						win++;
					}
				}else {														// 둘 중 하나만 같은 수 발생했다면
					if(mine1 == mine2) {
						System.out.println("이겼습니다!");
						win++;
					}else {
						System.out.println("졌습니다..");
						lose++;
					}
				}	
			
			}else {															// 같은 수 발생하지 않았을 시
				if(result == 0) {
					System.out.println("비겼습니다!");
					draw++;
				}
				if(result < 0) {
					System.out.println("졌습니다..");
					lose++;
				}
				if(result > 0) {
					System.out.println("이겼습니다!");
					win++;
				}
			}
		
		game++;
		System.out.println("");
		}while(game < 5);

		System.out.println("게임 끝!");
		System.out.println("승리 수 : " + win);
		System.out.println("무승부 수 : " + draw);
		System.out.println("패배 수 : " + lose);
	}

}
