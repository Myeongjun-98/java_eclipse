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
		
		for(;;) {
			int first = (int)(Math.random()*9+1);
			int second = (int)(Math.random()*9+1);
			int third = (int)(Math.random()*9+1);
		}
	
	
	
	}

}
