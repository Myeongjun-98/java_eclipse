package study0207;

import java.util.Scanner;

public class study0207JavaTest2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
	 	문제 7 - 알파벳 찾기(반드시 반복문 사용해서)
	 		알파벳 (대문자 또는 소문자 모두 가능하게) 입력
	 		입력한 알파벳이 몇 번째 알파벳인지 찾기 - 반드시 for문으로
	 */
		
		System.out.print("알파벳 입력 : ");
//		char alp = scan.nextLine();
		char alp = scan.next().charAt(0);
		// 아스키 코드에서 A -> 65(10진수), a - 97(10진수)
		for(char i = 1; i <= 26; i++ ) {
			if( alp == (i + 64) || alp == ( i + 96 ) ) { 
				System.out.printf("알파벳 %c 는 %d번째 알파벳입니다.", alp, /**/(int)i);			// i 형변환 안하고 i 를 int타입으로 해도 됨
			}
		}
		
	}

}
