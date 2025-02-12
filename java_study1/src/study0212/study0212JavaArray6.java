package study0212;

public class study0212JavaArray6 {

	public static void main(String[] args) {
		
		int [][] board = new int[5][3];
		
		board[0][0] = 1;
		board[0][1] = 2;
		board[0][2] = 3;
		board[1][0] = 4;
		board[1][1] = 5;
		board[1][2] = 6;
		board[2][0] = 7;
		board[2][2] = 10;
		board[3][1] = 20;
		board[3][2] = 30;
		board[4][0] = 50;
		board[4][1] = 100;
		
		for( int a[] : board) { 
			// a에 저장되는 것은 board[0], board[1], board[2], board[3], board[4]
			// board[a] -> 메모리주소
			for(int b : a) {
				//	b에 저장되는 것은 board[a][0], board[0][1], board[0][2]...
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
