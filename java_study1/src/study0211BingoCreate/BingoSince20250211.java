package study0211BingoCreate;

import java.util.Arrays;
import java.util.Scanner;

public class BingoSince20250211 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int[] game = new int[25];
		// game배열에 값 채우기
//		for(int i = 0; i < game.length; i++) {
//			game[i] = (int)(Math.random() * 50 + 1); 
//		}	
		int idx = 0;
		while(true) {			//중복제거 위해 무한루프
			int ranNum = (int)(Math.random() * 50 + 1);		// 랜덤수 출력
			boolean isSame = false;		// 불리언타입 기본값 false
				for(int i = 0; i < idx; i++) {		// 배열 인덱스 값 부여 및 검사
					if(game[i] == ranNum)		// 중복 발생 시
						isSame = true;				// 불리언 true;
					}if(!isSame) {					// 중복발생 X시 배열의 앞 값에 랜덤값 대입
						game[idx] = ranNum;
						idx++;						//		다음 인덱스로 넘어감
					}
			if(idx == game.length)		// 인덱스가 인덱스 크기와 같아질 때 종료	
				break;							// (길이는 25인데 인덱스가 25가 되면 그 시점에서 종료, 인덱스 24까지 작성완료
		}
			
//		System.out.println(Arrays.toString(game));	// 값 확인
		
		// 5줄 5칸 출력
		int bingo = 0;		// 변수 bingo의 초기값
		
		while(true) {		// 빙고판 출력부분
			System.out.println("현재까지 빙고 수 : " + bingo ); 
			System.out.println();
			if(bingo >= 5) {
				System.out.println("게임 끝!");
				return;
			}
			for(int i = 0; i < 5; i++) {
				for(int k = 0; k < 5; k++) {
					if( game[ i * 5 + k ] == 0) {
						System.out.printf(" %2s ", "■");	// s 는 String
					}
					else System.out.printf(" %2d ", game[i * 5 + k]);		// 2자리 확보, 오른쪽정렬해서 나오게 출력
					}
					System.out.println();
				}
			System.out.println();
			System.out.print("숫자를 입력 : ");
			int num = scan.nextInt();	// 빙고판에 있는 숫자 입력
			for(int i = 0; i < game.length; i++) {
				if (game[i] == num) {		// 내가 입력한 숫자를 배열에서 찾기
					game[i]=0;
				}
			}
			
			bingo = 0;		// 빙고 출력시마다 빙고 수 초기화
			
			// 숫자 입력 후 빙고 탐색
			int check = 0;		
			for(int i = 0; i < 5; i++) {			// 가로축의 빙고 탐색
				for(int k = 0; k < 5; k++) {		// i마다 x축의 값의 합이 0이면 빙고 +
					check += game[i * 5 + k];
				}
				if(check == 0) 
					bingo += 1;
				check = 0;
			}		
			for(int i = 0; i < 5; i++) {			// 세로축의 빙고 탐색
				for(int k = 0; k < 5; k++) {		// i마다 y축의 합이 0이면 빙고 +
					check += game[i + 5 * k];	
				}	
				if(check == 0) 
					bingo += 1;
				check = 0;
			}		
			for(int i = 0; i < 5; i++) {			// /축의 빙고 탐색
				check += game[6 * i];	
			}	if(check == 0) 
						bingo += 1;
			check = 0;
			
			for(int i = 1; i <= 5; i++) {			// \축의 빙고 탐색
				check += game[4 * i];	
			}	if(check == 0) 
						bingo += 1;
			
		}	//while문 끝
		
		
		
		/*
		 	전제 : 해당 인덱스 값이 모두 0이어야 빙고
		 	
		 	규칙1 : i 인덱스가 같고 k인덱스가 0~4(다 채워짐)
			규칙2 : i와 k가 동시에 0 ~ 4 까지 같이 상승(우상하)
			규칙2-1 : i가 0~4로 상승하는 동시에 k가 4~0으로 하락(좌상하)
			규칙3 : k인덱스가 같고 i인덱스가 0~4(다 채워짐)
		 
		 	for(i)/for(k) 검사 후 만족하면, 변수 bingo += 1
		 	예상되는 문제 : 시퀀스 반복 시 빙고 계속 늘어날 가능성 有
		 	to solve : 검사식 초기값 설정하도록
		
		 	-- 규칙1 : 0, 1, 2, 3, 4
		 				  	5, 6, 7, 8, 9 .....
			-- 규칙2 : 0, 6, 12, 18, 24
			-- 규칙3 : 0, 5, 10, 15, 20
							1, 6, 11, 16, 21...
			-- 규칙4 : 4, 8, 12, 16, 20
			이것들만 만족하는 수식이 있으면 쉬울텐데....
			index = i
			
			--- 규칙1 : i % 5일때 0~4범위 값이 다 0일 때
			--- 규칙2 : i % 5일 때 0, 1, 2, 3, 4의 값이 0일 때
							또는 6의 배수인 i의 값이 다 0일 때
			--- 규칙3 : i % 5일 때 같은 i(0~4)의 값 5개가 다 0일 때
			--- 규칙4 :  4의 배수인 i의 값이 다 0일 때
			
			-- 1차원배열로만 할 수는 없을까?
			
		 	 ++ 빙고 만족 시 BG로 표시되면 좋을듯?
		 */

		

		
		
		
		
		
	}

}
