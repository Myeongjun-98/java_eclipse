package study0211BingoCreate;

import java.util.Scanner;

public class bingoanswer {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] game = new int[25];
		
		// game배열에 값 채우기
		for(int i=0; i<game.length; i++) {
			game[i] = (int)(Math.random() * 50 +1 );
			for(int k=0; k<i; k++) { //game배열에 숫자가 저장되있는곳까지
				if( game[k] == game[i]) { //배열의 값중 temp와 같은게 있다면
					i--; break;
				}
			}
		}
		
		//System.out.println( Arrays.toString( game)  );

		

		// 5줄 5칸 출력
		//System.out.println( "┌────┬────┬────┬────┬────┐" );
		
		while(true) {
	
			for(int i=0; i<=4; i++) { //빙고판 출력
				for(int k=0; k<=4; k++) {
					if( game[i*5+k] == 0 )
						System.out.printf(" %2s ", "■");
					else
						System.out.printf(" %2d ", game[i*5+k]);
				}
				System.out.println();
			}
			
			System.out.print("숫자 입력 : ");
			int num =scan.nextInt(); // 빙고판에 있는 숫자 입력
			
			for(int i=0; i<game.length; i++) {
				if( game[i] == num) { // 내가 입력한 숫자르 배열에서 찾기
					game[i]=0;
				}
			}
			
			// 빙고게임은  5줄 빙고 되면 종료
			
			int bingo =0;
			int 가로=0 , 세로=0, 대각선1=0, 대각선2=0;
			
			for(int i=0; i<5; i++) {
				for( int k=0; k<5; k++) {
					if(game[i * 5 + k] ==0) 가로++;
					if( game[k*5+i] == 0 ) 세로++;
				}
				if( game[i * 6] ==0 ) 대각선1++;
				if( game[i * 4 + 4] == 0)대각선2++;
				
				if( 대각선2 == 5) bingo++; // 대각선 빙고 확인
				if( 대각선1 == 5) bingo++; // 대각선 빙고 확인
				if(가로==5) bingo++; // 가로방향 빙고 확인
				if( 세로 == 5) bingo++; // 세로방향 빙고 확인
				
				가로=0;
				세로 =0;
			}
			
			if( bingo >= 5) {			// 오직 5줄만 이기는거로 하고싶으면.... bingo == 5로 하길...
				System.out.println("5줄 빙고 끝!!!");
				break;
			}
			
			
			
		}// while 무한루프 종료

	} // main 메서드 종료

}