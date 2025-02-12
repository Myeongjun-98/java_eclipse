package study0211BingoCreate;

import java.util.Scanner;

public class BingoSince20250211 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = new int[25];		
		
		
		/*
		 						빙고게임 완성하기
		 중복 없애보기
		  
		 5줄 되면 승리 및 게임 종료 구현하기 
		  
		 + 컴퓨터와 빙고게임 구현(컴퓨터가 승리하게끔 유도하는 코드 구현)
		 */
		
		
		
		
		
		
		
		// 5줄 5칸 출력
		while(true) {		// 빙고판 출력부분
			for(int i = 0; i < 5; i++) {
				for(int k = 0; k < 5; k++) {
					if( game[ i * 5 + k ] == 0) {
						System.out.printf(" %2s ", "■");	// s 는 String
					}
					else System.out.printf(" %2d ", game[i * 5 + k]);		// 2자리 확보, 오른쪽정렬해서 나오게 출력
					}
					System.out.println();
				}
			
			System.out.print("숫자를 입력 : ");
			int num = scan.nextInt();	// 빙고판에 있는 숫자 입력
			for(int i = 0; i < game.length; i++) {
				if (game[i] == num) {		// 내가 입력한 숫자를 배열에서 찾기
					game[i]=0;
				}
			}
		}//while끝		

		
		
		
		
		
		
	}

}
