package study0123;

import java.util.Scanner;

public class study0123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		// 조건연산자
//		// (조건식) ? 참일경우 실행 내용 : 거짓일 경우 실행 내용
//		
//		String result = (10 > 5 )	? "5보다 크다" : 
//			"5보다 작다";
//		System.out.println(result);
//		
//		int age = 16;
//		int price = (age < 19) ? 1000 : 1500;
//		System.out.println(price);
//		System.out.printf("나이 : %d살, 버스요금 : %d원 \n", age, price);
//		
//		System.out.print("첫 번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		int num2 = scan.nextInt();		
//		
//		int res = (num1 > num2) ? num1 : num2;
//		// 조건식이 참이라면 res = num1, 거짓이라면 res = num2
//		
//		System.out.println("두 숫자 중 큰 숫자는 : " + res);
//
//		// 두 숫자를 입력받아서 두 수가 같다, 같지 않다 출력
//		System.out.println("첫 번째 숫자 : ");
//		int num3 = scan.nextInt();
//		System.out.println("두 번째 숫자 : ");
//		int num4 = scan.nextInt();
//		
//		String res1 = (num3 == num4) ? "두 숫자가 같다." : "두 숫자가 같지 않다.";
//		System.out.println(res1);
//		
//		
//		// 나혼자실습
////		int age1;
////		System.out.print("나이를 입력하세요 : ");
////		age1 = scan.nextInt();
////		String price1 = (age1 < 65 && age1 > 8) ? "일반요금입니다." : "무료입니다.";
////		System.out.printf(price1);
//	
//	System.out.print("정수 입력 : ");
//	int num = scan.nextInt();
//	
//	// 입력한 정수가 양수냐 음수냐, 0이냐
//	String 정수결과 = (num > 0) ? "양수입니다." : ((num == 0) ? "0입니다." : "음수입니다.");
//	System.out.println(정수결과);

//	// 바이킹을 타기 위해서는 키가 135 이상이어야 한다.
//	// 바이킹 탑승 가능여부를 출력하세요.
//	System.out.print("당신의 신장을 입력하세요 : ");
//	int 키 = scan.nextInt();
//	String 탑승가능여부 = (키 >= 135) ? "바이킹에 탑승 가능하십니다." : "바이킹 탑승 불가합니다.";
//	System.out.println(탑승가능여부);

//		System.out.print("1. 파미향짬뽕  2. 쿠켄 돈까스  3. 공주순대  4. 평양냉면 :");
//		int select = scan.nextInt();
////		int 선택 = (select == 1) ? 10000 : (select == 2) ? 9000 : 6500;
//		int 선택 = (select == 1) ? 10000 : 0;
//		선택 = (select == 2) ? 9000 : 선택;
//		선택 = (select == 3) ? 6500 : 선택;
//		선택 = (select == 4) ? 9000 : 선택;
//		System.out.println("가격 : " + 선택 +"원");
		
		// 정수 세 개를 키보드를 통해 입력받기
		// 세 정수 중에서 가장 큰 정수를 출력하세요
		// 두 개가 같은 경우, 세 개가 같은 경우는 배제하고!!!
		
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		int 정수입력1 = scan.nextInt();
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		int 정수입력2 = scan.nextInt();
//		System.out.print("마지막 번째 정수를 입력하세요 : ");
//		int 정수입력3 = scan.nextInt();
		System.out.print("세 정수를 입력하세요 : ");
		int 정수입력1 = scan.nextInt();
		int 정수입력2 = scan.nextInt();
		int 정수입력3 = scan.nextInt();
		int 가장큰정수출력 = (정수입력1 > 정수입력2) ? 정수입력1 : 정수입력2;
		가장큰정수출력 = (가장큰정수출력 > 정수입력3) ? 가장큰정수출력 : 정수입력3;
		System.out.println("가장 큰 정수는 " + 가장큰정수출력 + "입니다.");
		
		
		
	}
		
}
