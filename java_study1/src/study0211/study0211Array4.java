package study0211;

import java.util.Arrays;
import java.util.Scanner;

public class study0211Array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int[] game = new int[25];
		
		// game배열에 값 채우기
		for(int i = 0; i < game.length; i++) {
			game[i] = (int)(Math.random() * 50 + 1); 
		}		
//		System.out.println(Arrays.toString(game));	// 값 확인
		
		
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

		
		
		
		
		
		
		
		// 1) 빙고게임은 5줄 빙고 되면 종료
		// 표로 인덱스값을 적어서 규칙 찾아보기
		// 2) 중복 없이 하게끔
	}
}
