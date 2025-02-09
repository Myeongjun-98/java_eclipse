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
		
		char ch = 'a';
		System.out.println(ch);
		ch = 97; // 아스키코드 문자코드표에 의한 값!! // 왜? ch는 문자에 대한 값이니까!
		System.out.println(ch);
		ch = 'H';
		System.out.println( ch - 'A' );
		System.out.println( 'J' - 64 );
		System.out.println( '가' - 64 );
		
		
		int ss = 's';
		
		// 여기까지 참고할것들
		//
	
		int word;
		word = scan.nextInt();
		
		
	}

}
