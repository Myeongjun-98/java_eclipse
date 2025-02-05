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
			System.out.println("");

			int coin = (int)(Math.random()*2+1); 			// 동전의 랜덤함수
			int select = scan.nextInt();						// 값 입력
			
			if (coin == 1)															// 컴퓨터의 출력값을 확인시켜줌
				System.out.println("제시된 동전 면 : 앞면");
			else
				System.out.println("제시된 동전 면 : 뒷면");
			
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
		
		
		
		
		
		
		
		
		
	}
	

}
