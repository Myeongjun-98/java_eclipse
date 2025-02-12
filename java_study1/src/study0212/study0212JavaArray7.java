package study0212;

import java.util.Scanner;

public class study0212JavaArray7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 폰트가 기본(consolas)여야 의도한대로 나옴
		
		
		int [] []	board = new int [] [] {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}			// 13줄 15칸
		};		// [13][15]
		
		
		
		
		int x=0, y=0;
		while(true) {
			for( int i = 0; i < board.length; i++) {
				for(int k=0; k < board[i].length; k++) {
					if(board[i][k] == 1) {
						System.out.printf("■");
					}
					if(board[i][k] == 0) {
						System.out.printf(" ");
					}
					if(board[i][k] == 2) {
						System.out.printf("@");
						x = k; y = i;
					}
				}
				System.out.println();
			}	// 화면 그리기 반복문 끝
			
			// 이동시키기 w,a,s,d
			System.out.print("방향 입력 : ");
			char key = input.nextLine().charAt(0);
			
			board[y][x]=0;
			switch(key) {
			case 'w' : 
//				y--;
//				if(y==0)		// y가 0일 경우 해당 좌표값의 문자를 되돌림
//				y++;
				if(board[y-1][x] !=1) y--;		// 해답
				break;
			case 's' :
				y++;
				if(y==12)		// y가 12일 경우 해당 좌표값의 문자를 되돌림
				y--;
				break;
			case 'a' :
				x--;
				if(x==0)		// x가 0일 경우 해당 좌표값의 문자를 되돌림
				x++;
				break;
			case 'd' :
				x++;
				if(x==14)		// x가 14일 경우 해당 좌표값의 문자를 되돌림
				x--;
				break;
			case 'r' :		// 추가로 리셋 구현해봄
				x=7; y=6;
				break;
			default :System.out.println("잘못된 입력"); 
			}
			board[y][x]=2;
			/*1. y가 0 || 12이거나 x가 0 || 14인 경우*/
			/*2. [y]가 1 이거나 [x]가 1 인 경우*/
			
			
			
			
		}	
		
	}

}
