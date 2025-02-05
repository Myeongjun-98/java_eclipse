package study0204;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//가위바위보 게임
		System.out.println("가위바위보를 10판 진행합니다.");
		System.out.println("가위를 결정할 경우 '1', 바위를 결정할 경우 '2', 보자기를 결정할 경우 '3'을 입력해주세요.");
		
		int winningScore = 0; 								// 승리수 변수선언
		
		for(int game2 = 1; game2 <= 10; game2++) {
			System.out.printf("%d번째 판의 손 모양을 결정해주세요. : ", game2);
			
			int mySelect = scan.nextInt();					// 값 입력
			System.out.println("");
			int RSP = (int)(Math.random()*3+1);			// 가위바위보 랜덤함수
			int result = mySelect - RSP;						// switch에 활용하기 위해 나와 컴퓨터의 가위바위보 결과를 변수선언
			
			switch(RSP) {
				case 1 : System.out.println("컴퓨터의 손 모양 : 가위");
				break;
				case 2 : System.out.println("컴퓨터의 손 모양 : 바위");
				break;
				case 3 : System.out.println("컴퓨터의 손 모양 : 보자기");
				break;
			}
			
			if (mySelect >= 1 && mySelect <= 3) {			// 입력값을 1~3 한정하기 위해 if문 사용
				switch(result) {											// switch문
				case -1 :
				case 2 :
					System.out.println("");
					System.out.println("패배...!");
					System.out.printf("현재까지 승리 수 : %d회 \n", winningScore);
					System.out.println("");
					break;
				case 0 :
					System.out.println("");
					System.out.println("무승부 !");
					System.out.printf("현재까지 승리 수 : %d회 \n", winningScore);
					System.out.println("");
					break;
				case 1 :
				case -2 :
					++winningScore;
					System.out.println("");
					System.out.println("승리!");
					System.out.printf("현재까지 승리 수 : %d회 \n", winningScore);
					System.out.println("");
					break;
				}
			}else {																// 입력값이 올바르지 않을 경우 예외처리
				System.out.println("올바르지 않은 값을 입력하셨습니다. 다시 플레이해주세요.");
				return;
			}
		}
		System.out.println("당신의 총 승리 수는 " + winningScore + " 회 입니다.");


	}

}
