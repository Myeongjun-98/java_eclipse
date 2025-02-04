package study0204;

import java.util.Scanner;

public class study0204Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// 반복문 = for, while, do ~ while
// 반복 => 반복 횟수를 정하는 경우, 정하지 않고 반복하는 경  
// "주로" 반복횟수가 정해진 경우는 for문
// 정해지지 않은 경우 while문
		for(int ex=1;/*초기값*/ ex <= 10; /**/ex++/*증감식*/) {// for 문 세미콜론(;) 2개 있어야함, 마지막은 안들어감
		System.out.println(ex);
		}
		
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		
		// number만큼 반복시키고 싶을 때
		for(int A = 1; A <= number; A++) {
			System.out.println(" 반복문 ! ");
		}
		// number만큼 반복시키고 싶을 때 2
		for(int A = number; A>=1  ; A--)
			System.out.println(" 반복 ! ! ");

		// 6반복문을 만들고 싶다.
		// 1부터 시작해서 6까지 1씩 증가
		// i=1; 						-> 1부터 시작하겠다.
		// i <= 6 ; 					-> 6까지
		// i++ 또는 i=i+1			1씩 증가
		// for(int i=1; 1<=6; i++) {}
		
		// 정수 5부터 17까지 출력하는 반복문을 만드세요
		for(int B = 5; B <= 17; B++)
			System.out.println(B);
		
		// 총합 구하기 ★
		int sum = 0;
		for(int num = 1; num <= 10; num++) {
			sum = sum + num;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		////////// 두 개의 정수를 입력하여 두 수 중 작은숫자부터 큰 숫자까지의 합을 구하시오.
//		int bigNum = 0;
//		int smallNum = 0;
//		
//		System.out.println("두 숫자 사이의 모든 정수를 더합니다.");
//		System.out.print("첫 번째 숫자를 먼저 입력하세요. : ");
//		int numA = sc.nextInt();
//		System.out.print("두 번째 숫자를 입력하세요. : ");
//		int numB = sc.nextInt();
//		
//		if (numA >= numB) {
//			bigNum = numA;
//			smallNum = numB;
//		}else {
//			smallNum = numA;
//			bigNum = numB;
//		}
//		// 중간점검 
//		System.out.println("큰 숫자 : " + bigNum);
//		System.out.println("작은 숫자 : " + smallNum);
//		
//		int finalNum = 0;
//		for(int Com = smallNum; Com <= bigNum; Com++) {
//			finalNum = finalNum + Com;
//		}
//		System.out.println("두 숫자 사이의 합은 " + finalNum + "입니다.");
		System.out.println("숫자 두 개를 입력해주세요. : ");
		int num1 =0, num2 =0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// num2이 num1보다 항상 크게 만들어지게 함
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int ssum = 0;
		for(; num1 <= num2; num1++)
		{ssum = ssum + num1;}
		System.out.println(ssum);
		
		//2단
		for(int C = 1; C <= 9; C++) {
			System.out.printf("2*%d = %d \n", C, 2*C);
		}
		// 내가 입력한 값의 구구단
		System.out.println("구구단을 출력합니다.");
		System.out.println("값을 입력해주세요");
		int mynumber = sc.nextInt();
		for(int D = 1; D <= 9; D++ ) {
			System.out.printf("%d X %d = %d \n", mynumber, D, mynumber * D);
		}
		
		
		
		
		
		
	}
	

}