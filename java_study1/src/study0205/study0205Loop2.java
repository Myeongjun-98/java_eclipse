package study0205;

import java.util.Scanner;

public class study0205Loop2 {

	static/*★*/ Scanner sc = new Scanner(System.in);			//public static void main(String[] args 위에 스캐너 넣으려면 [static] 꼭 넣어야함 
	public static void main(String[] args) {								// public은 누구나 사용할 수 있는 제어자
	// 자바의 변수 종류															// static은 고정된거...?
	// 지역변수, 클래스변수(static), 인스턴스변수
		
		/* for (초기값; 조건식; 증감식){
		반복내용
		}
		계산과정 :
		초기값 -> 조건식 비교 -> if(참) -> {내용} -> 증감식
		-> 조건식비교 -> if(참) -> {내용} -> 증감식
		-> 조건식비교 -> if(거짓) -> 종료
		 */

//		for(  ;  ;  ) {		// for문의 무한루프
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num==0) break;		//	무한루프의 종료시점 정하기, if문과 break로
//		}								// break 대신 return 사용할 경우, return 하위코드들이 모두 예외처리됨
//		// break는 해당 제어문(반복문, switch)을 종료시키기만 한다.
//		// return은 메서드를 종료
//		System.out.println("무한루프가 종료되었습니다.");

		//		for (int i = 1 ; ; i++) {			// for문의 무한루프 2
//			System.out.println(i);
//		}
//		for (int i = 1 ; true ; i++) {			// for문의 무한루프 3
//			System.out.println(i);
//		}
//		int num=0;
//		for( ;num!=100 ; ) {					// for문의 무한루프 4
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//		}
		
		// for( ; ; ) , for ( ; true ; ) , for ( ; 변수!=값 ;)		// for문의 무한뤂
//		while(true)															// 반면, while의 무한루프
		
		for(int i = 1; i<=2; i++) {
		System.out.println("변수 i 사용 반복문 " + i);
			for(int k = 1; k <= 3; k++) {
				System.out.println(i + " 변수 k 사용 " + k);
			}
		}
		
		// 모든 구구단 만들기
		for( int dan = 1; dan <= 9; dan++) {
			System.out.printf("구구단 %d단\n", dan);
			for(int num = 1; num <= 9 ; num++) {
				int result = dan * num;
				System.out.printf(" %d X %d = %d\n", dan, num, result);

		// 구구단 식 하나로 만들기?
		int i = 1;
		for(int k=2; k<=9;) {
			System.out.println(k + "X" + i + "=" + (k*i));
			i++;
			if(i==10) {
				k++;
				i=1;
			}
		}
			
		
		
		
		
		
		
			}
		}
		
		
		
		
		
	}

}
