package study0203;

import java.util.Scanner;

public class homework0203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		과제!! 2월 3일
		
		가위바위보 게임 만들기
		1. 가위 2. 바위 3. 보
		내가 이겼는지, 졌는지, 비겼는지 출력
		
		*/
		// 내가 낼 것을 입력
		int me;
		System.out.println("컴퓨터와 가위바위보를 합니다. (가위 : 1, 바위 : 2, 보 : 3)");
		System.out.print("당신이 낼 것은? : ");
		me = scan.nextInt();
		// 컴퓨터의 랜덤출력값을 1~3으로 고정
		int opponent = (int)(Math.random()* 3 + 1);
		// 컴퓨터의 출력값을 특정 출력문으로 표현
		System.out.print("컴퓨터가 낸 것은 ");
		switch(opponent) {
		case 1 : System.out.println("가위입니다!");
		break;
		case 2 : System.out.println("바위입니다!");
		break;
		case 3 : System.out.println("보입니다!");
		}
		// 예외값 처리 (return은 js에서 썼는데 되길래 반영함)
		if (!(me >= 1 && me <= 3)) {
			System.out.println("올바른 값을 입력해주세요");
			return;
		// 승패공식
		}else if (me == opponent) {
		System.out.println("비겼습니다!");
		}else if (me - opponent == -1 || me - opponent == 2) {
			System.out.println("패배입니다...");
		}else System.out.println("승리입니다!");
	
		
		
		
		
		
	}

}

