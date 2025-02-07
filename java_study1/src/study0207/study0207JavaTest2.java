package study0207;

import java.util.Scanner;

public class study0207JavaTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*		문제 4
				*
				**	
				***
				별을 위와 같이 출력하세요
				힌트 > 첫 번째 줄이라서 별 한 개, 두 번째 줄이라서 별 두 개 , 세 번째 줄이라서 별 세 개(이중for문)
		*/
		
		for(int i = 1; i <= 3; i++) {
			for(int k=1 ; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*		문제 5
				0 1 2 3 
				4 5 6 7 
				8 9 10 11 
				숫자를 위와 같이 출력하세요 (이중for문)
		*/
		
		int a, b;
		for(a = 0 ; a <= 2 ; a++) {
			for(b = 0 ; b <= 3 ; b++) {
				System.out.print(b + (a*4) + " ");
			}
			System.out.println("");
		}
		
		/*		문제 6 - 비밀번호찾기
				1. 비밀번호는 4자리로 구성되어있다.
				2. 비밀번호 각각의 숫자는 1 ~ 9 중 하나이고, 중복은 없다.
				3. 첫 번째 숫자는 네 번째 숫자보다 2만큼 크다.
				4. 두 번째 숫자는 세 번째 숫자보다 작다.
				5. 비밀번호와 비밀번호 역순의 숫자를 더하기하면 16566이다.
				6. 위 조건을 모두 충족하는 비밀번호 출력
		*/
		
		for(int A = 1; A <= 9; A++)    /*   for (int A = 3; A <= 9; A++)   */ {
			for(int B = 1; B <= 9; B++) {
				for(int C = 1; C <= 9; C++) {
					for(int D = 1; D <= 9; D++)    /*   for (int D = 1; D <= 7; D++)   */ {
						if (!(A==B || 			// 제외하는 경우	//	A와 B가 같을 때
								A==C ||										// A와 C가 같을 때
								A==D ||										// A와 D가 같을 때
								B==D || 									// B와 D가 같을 때
								C==D ||										// C와 D가 같을 때
								(A-D) != 2 ||								// A - D 가 2가 아닐 때     /*  위 for식에서 origin for 대신 주석for 사용한다면 해당 row 지워도 됨 */
								B >= C)) {									// B가 C와 같거나 클 때
							int E = ((A*1000 + B*100 + C*10 + D) + ( D*1000 + C*100 + B*10 + A));
							if (E == 16566) {
								System.out.println("비밀번호 : " + A + B + C + D);
							}
						}
						
					}
				}
			}
		}
		
	/*
	 	문제 7 - 알파벳 찾기(반드시 반복문 사용해서
	 		알파벳 (대문자 또는 소문자 모두 가능하게) 입력
	 		입력한 알파벳이 몇 번째 알파벳인지 찾기 - 반드시 for문으로
	 */

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
