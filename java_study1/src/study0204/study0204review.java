package study0204;

import java.util.Scanner;

public class study0204review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 동전 앞뒷면 맞추기 게임을 10판 진행
		// 10번 게임을 하는 동안 몇 번 맞췄는지 출력
		System.out.println("동전 앞뒤 맞추기를 10판 진행합니다.");
		System.out.println("앞면을 결정할 경우 '1', 뒷면을 결정할 경우 '2'를 입력해주세요.");
		
		int win = 0; 		// 승리수 변수선언
		
		for(int game = 1; game <= 10; game++) {			// for코드 시작
			System.out.printf("%d번째 판의 앞뒷면을 결정해주세요. : ", game);

			int coin = (int)(Math.random()*2+1); 			// 동전의 랜덤함수
			int select = scan.nextInt();						// 값 입력
			
			if (select != 1 && select != 2) {					// 오류 예외처리
				System.out.println("올바르지 않은 입력입니다. 게임을 다시 시작해주세요.");
				return;
			}else if(select == coin) {								// 정답
				++win;
				System.out.println("");
				System.out.println("정답!");
				System.out.printf("현재까지 정답 수 : %d회 \n", win);
				System.out.println("");
			}else if (select != coin){								// 실패
				System.out.println("");
				System.out.println("실패...!");
				System.out.printf("현재까지 정답 수 : %d회 \n", win);
				System.out.println("");
			}
		}
		System.out.println("당신의 최종 정답 수는 " + win + " 회 입니다.");
		System.out.println("");
		
		// 가위바위보 게임
		System.out.println("가위바위보를 10판 진행합니다.");
		System.out.println("가위를 결정할 경우 '1', 바위를 결정할 경우 '2', 보자기를 결정할 경우 '3'을 입력해주세요.");
		
		int winningScore = 0; 								// 승리수 변수선언
		
		for(int game2 = 1; game2 <= 10; game2++) {
			System.out.printf("%d번째 판의 손 모양을 결정해주세요. : ", game2);
			
			int mySelect = scan.nextInt();					// 값 입력
			int RSP = (int)(Math.random()*3+1);			// 가위바위보 랜덤함수
			int result = mySelect - RSP;						// switch에 활용하기 위해 나와 컴퓨터의 가위바위보 결과를 변수선언
			
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
				default : 
					System.out.println("올바르지 않은 값을 입력하셨습니다. 다시 플레이해주세요.");
					return;
			}
		}
		System.out.println("당신의 총 승리 수는 " + winningScore + " 회 입니다.");
		
		
		
		
		
		
		
	}
	

}
