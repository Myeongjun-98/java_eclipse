package study0206;

import java.util.Scanner;

public class study0206Loop4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		for(int i = 1; i<=3; i++) {
//			for(int k=1; k<=2; k++) 
//				System.out.printf("i = %d, k = %d\n" , i , k);
//		}
		
//		int i = 1;
//		while(i <= 3) {
//			int k = 1;			// 만약 k가 while문 이전에 있으면 k의 초기값이 초기화되지 않아서 의도와 다르게 출력됨			
//			while(k<=2) {
//				k++;
//				System.out.printf("i = %d, k = %d\n" , i , k);			
//			}
//			i++;
//		}
		
		int a=10;
		do {
				System.out.println("do ~ while문");
				a++;
			}
		while(a < 15);
		// 초기값 -> { 내용 }  -> 조건식 비교 -> 참이면 -> {내용}
		// 다른 반복문과 달리 비교를 나중에 하기에 최초 1회는 어찌되었든 실행됨
		
		int user = 0;													// 이 코드는 user가 0이기에 비교 > 실행 > 입력 > 비교
		while(!(user>=1 && user <= 3)) {
			System.out.println("1. 가위 2. 바위 3. 보");
			user = scan.nextInt();
		}
		
		int user1 = 0;													// do ~ while로 실행하면 일단 실행 후 입력하니까
		do { 																// 코드 진행이 위 식에 비해 한번 덜 실행하게됨.
			System.out.println("1. 가위 2. 바위 3. 보");
			user = scan.nextInt();
		}
		while(!(user1>=1 && user1 <= 3));
		
		
		
		
	}

}
