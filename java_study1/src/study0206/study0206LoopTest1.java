package study0206;

import java.util.Scanner;

public class study0206LoopTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 문제 1 - 무한루프
		 	정수 한 개씩 계속 입력 받기
		 	입력중 0을 입력하면 지금까지 입력한 모든 숫자의 합 출력
		 	*/

		int myNum;
		int sumNum = 0;
		do {
			System.out.print("숫자를 입력하세요 : ");
			myNum = scan.nextInt();
			sumNum = myNum + sumNum;
		}while (!(myNum == 0));
		System.out.printf("누적 입력 값의 합 : %d\n",sumNum);
		
		/*
		 문제 2 - 무한루프
		 	컴퓨터와 가위바위보 게임하기
		 	내가 10번 이길때까지 계속 게임하기
		 	10번 이기면 그동안 몇 번 패배하고 몇 번 비겼는지 출력
		 */
		int me;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		// for문으로.. 익숙하니깐
		System.out.println("가위바위보를 실행하세요.");

		for(; win <= 9;) {
			System.out.println("가위 : 1, 바위 : 2, 보자기 : 3");
			System.out.print("입력 : ");
			me = scan.nextInt();
			System.out.println("");
			
			int com = (int)(Math.random()*3+1);
			int result = me - com;
			
			if (!(me >= 1 && me <= 3)) {
				System.out.println("틀린 값입니다. 다시 입력해주세요.");
			}else if(result == -1 || result == 2) {
				System.out.println("패배!");
				lose++;
				}else if(result == 0) {
					System.out.println("무승부!");
					draw++;
				}else {
					System.out.println("승리!");
					win++;
				}
			
			System.out.printf("누적 승리 수 : %d\n", win);
			System.out.printf("누적 무승부 수 : %d\n", draw);
			System.out.printf("누적 패배 수 : %d\n", lose);
			System.out.println("");
		}
		
		// do ~ while문으로?
		
		System.out.println("do~while문으로 만든 가위바위보를 실행하세요.");
		
		int me2 ;
		int win2 = 0;
		int lose2 = 0;
		int draw2 = 0;
		
		do {
			System.out.println("가위 : 1, 바위 : 2, 보자기 : 3");
			System.out.print("입력 : ");
			me2 = scan.nextInt();
			System.out.println("");
			
			int com = (int)(Math.random()*3+1);
			System.out.println("컴퓨터의 값 : " + com );
			int result = me2 - com;
			
			if (!(me2 >= 1 && me2 <= 3)) {
				System.out.println("틀린 값입니다. 다시 입력해주세요.");
			}else {
				switch(result) {
				case-1:
				case 2:
					System.out.println("패배!");
					lose2++;
					break;
				case 0:
					System.out.println("무승부!");
					draw2++;
					break;
				case 1:
				case -2:
					System.out.println("승리!");
					win2++;
					break;
				}
			}
//			if (!(me2 >= 1 && me2 <= 3)) {
//				System.out.println("틀린 값입니다. 다시 입력해주세요.");
//			}else if(result == -1 || result == 2) {
//				System.out.println("패배!");
//				lose2++;
//				}else if(result == 0) {
//					System.out.println("무승부!");
//					draw2++;
//				}else {
//					System.out.println("승리!");
//					win2++;
//				}
			
			System.out.printf("누적 승리 수 : %d\n", win2);
			System.out.printf("누적 무승부 수 : %d\n", draw2);
			System.out.printf("누적 패배 수 : %d\n", lose2);
			System.out.println("");
		}while(win2 <= 9);
	
	
	
	
	
	
	
	
	}

}
