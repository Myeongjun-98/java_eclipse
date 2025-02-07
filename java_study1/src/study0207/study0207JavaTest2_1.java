package study0207;

import java.util.Scanner;

public class study0207JavaTest2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		char ch = 'a';
		System.out.println(ch);
		ch = '가';
		System.out.println(ch);
		ch = 97; // 아스키코드 문자코드표에 의한 값!! // 왜? ch는 문자에 대한 값이니까!
		System.out.println(ch);
		ch = 'H';
		System.out.println( ch - 'A' );
		System.out.println( 'J' - 64 );
		System.out.println( '가' - 64 );
		
		
		
	}

}
