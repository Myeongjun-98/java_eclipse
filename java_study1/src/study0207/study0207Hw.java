package study0207;

import java.util.Scanner;

public class study0207Hw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 숫자 야구
			1 ~ 9 중의 임이의 숫자 3개를 뽑아낸다. ( 중복없이 )
			3개의 숫자를 맞춰야한다.
			예) 임의의 숫자 - 7 1 8
				입력 : 1 2 3
				결과 : 0 strike, 1 ball, 2 out
				
				입력 : 4 7 9
				결과 : 0 strike, 1 ball, 2 out
				
				입력 : 4 1 8
				결과 : 2strike, 0 ball, 1 out
		 */
		int first = 0;
		int second = 0;
		int third = 0;
		
		for(;;) {				// 중복없는 랜덤 3자리 생성
		first = (int)(Math.random()*9+1);
		second = (int)(Math.random()*9+1);
		third = (int)(Math.random()*9+1);
			
		if (!(first == second || first == third || second == third))
		break;
		}
		
		System.out.println("숫자 야구를 진행합니다");
		
		int strike = 0, ball = 0, out = 0;					// 초기값
		
		for( ;strike <3;) {

			System.out.print("숫자 세 자리를 입력하세요. : ");			// 숫자 입력받음
			
			int my1 = scan.nextInt();
			int my2 = scan.nextInt();
			int my3 = scan.nextInt();
			
			strike = 0;		// 각 결과값을 리셋
			ball = 0;
			out = 0;
			
			if (my1 == first) {			// 1번째 자리의 결과 공식
				strike += 1;
			}else if (my1 == second || my1 == third) {
				ball += 1;	
			}else
				out += 1;
			
			if (my2 == second) {			// 2번째 자리의 결과 공식
				strike += 1;
			}else if (my2 == first || my2 == third) {
				ball += 1;	
			}else
				out += 1;
			
			if (my3 == third) {			// 3번째 자리의 결과 공식
				strike += 1;
			}else if (my3 == second || my3 == first) {
				ball += 1;	
			}else
				out += 1;
			
			System.out.printf("당신의 결과 : %d strike, %d ball, %d out\n", strike, ball, out);
			System.out.println("");
		}
	
	
	
	}

}
