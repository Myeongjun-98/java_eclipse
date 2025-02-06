package study0205;

import java.util.Scanner;

public class study0205hw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 내가 제시한 1 ~ 50중 하나의 값을 컴퓨터가 맞추게 하기
		
		System.out.println("1에서 50 사이의 값을 하나 입력하세요. : ");					
		int myNumber = scan.nextInt();										// 나의 값 입력

		if (!(myNumber >= 1 && myNumber <= 50)) {					// 범위 밖의 수 입력 시 예외처리
			System.out.println("잘못 입력한 값입니다! 다시 시도해주세요");
			return;}	
		
		int comTry = 1;						// 각 변수의 초기값
		int minNum = 1;
		int maxNum = 50;
		
		while(true) {
			int comNumber = (int)(Math.random() * (maxNum - minNum + 1) + minNum);				// 랜덤값이 유동적이도록 변수삽입식 생성
			
			System.out.printf("컴퓨터의 %d번째 시도\n",  comTry);				// 컴퓨터의 값 확인									
			System.out.println("컴퓨터의 값 : " + comNumber);
			System.out.println("컴퓨터가 확정한 값의 범위 : " + minNum + " ~ " + maxNum);	// 컴퓨터의 범위 확인
			++comTry;				// 컴퓨터의 시도 수를 다음시도에 1 추가되도록 처리
			
			if (myNumber != comNumber) {			// 컴퓨터 실패식
				System.out.println("컴퓨터 실패!");
				if (myNumber < comNumber) {			// 컴퓨터의 값이 큰 경우
					System.out.println(comNumber + "보다 Down!");
					maxNum = comNumber - 1;					// max값 변동
				}else { 
					System.out.println(comNumber + "보다 Up!");			// 컴퓨터의 값이 작은 경우
					minNum = comNumber + 1;										// min값 변동
				}System.out.println("");															
			}else {
				System.out.println("컴퓨터 성공!");				// 컴퓨터 성공
				break;														// while문 끝.
				}
			
			
			
				
	
		}
		
		
		
		
		
		
	}

}
