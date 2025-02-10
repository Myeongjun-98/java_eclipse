package study0207;

import java.util.Scanner;

public class study0207HwreviewNumberBaseball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		
		do {			// 중복 없는 3개의 숫자
		n1 = (int)(Math.random()*9+1);
		n2 = (int)(Math.random()*9+1);
		n3 = (int)(Math.random()*9+1);
		} while( (n1 == n2 || n2 == n3 || n1 == n3 ) );
		
		while(true) {		// 숫자 맞출때까지 계속 입력해야하니 무한루프
			System.out.print("숫자 세 개를 입력하세요 : ");
			int u1 = scan.nextInt();
			int u2 = scan.nextInt();
			int u3 = scan.nextInt();
			
			int str = 0, ball = 0;			// 스트라이크, 볼 표현. 아웃은 계산으로
			
			// 스트라이크 경우
			if(n1 == u1 ) str++;
			if(n2 == u2 ) str++;
			if(n3 == u3 ) str++;
			
			if(n1 == u2 || n1 == u3) ball++;
			if(n2 == u1 || n2 == u3) ball++;
			if(n3 == u2 || n3 == u1) ball++;
			
			System.out.printf("%d 스트라이크 %d 볼 %d 아웃\n", str, ball, 3 - str - ball);
			
			if(str == 3) break;
		}
			System.out.println("승리!");
			
			
			
	}

}
