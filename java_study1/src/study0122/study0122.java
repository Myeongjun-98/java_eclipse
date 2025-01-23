package study0122;

import java.util.Scanner;

public class study0122 {

	public static void main(String[] args) {
		
		int num = 20; // 대입연산자에 의해 오른쪽의 값을 왼쪽에 저장
		num = 20+3+1*10; // +, * 연산 후 대입연산 실행
		int num2 = 10, num3 = 55;  // 콤마( , )로 여러 번 실행할 수 있음
		System.out.println(num);
		
		num = num2 + 13 / num3 + 123;
		// 대입연산자는 다른 연산자들보다 우선순위가 낮다.
		System.out.println(num);
		
		// 사칙연산자
		System.out.println(num2 + num3);
		System.out.println(num3 - num2);
		System.out.println(num2 * 4);
		System.out.println(num2 + num3 * 2);     // *연산 후 +연산
		System.out.println(num3 / num2); 			// /연산은 몫
		System.out.println(num3 % 4); 				// %연산은 나머지
		System.out.println(10 / 3.0);
		System.out.println(10 % 3.0);
		
		// 복합 대입 연산자
		num = 10;
		num = num + 20;										// 연산자의 우선순위에 따라 이런 식도 성립이 된다.
		
		num = 10;
		num += 20;											// 위의 [ num = num + 20 ]; 와 같은 과정이다.
																	// +가 먼저니까, +를 먼저 수행 후 그 과정을 왼쪽에 덧씌운다는 뜻
		
		// num2 = num2 * 5;
		num2 *= 5;
		
		//num = num + 5 * num3;
		num += 5 * num3;
		
		Scanner scan = new Scanner(System.in); // 키보드 입력받기 위해 생성
		
		// 원의 둘레 구하기
		int r=0, dist=0;
		System.out.print("반지름 : " );
		r = scan.nextInt();
		dist = (int)(r * 2 * 3.14);           				// dist가 int로 설정되었으나 수식에 실수(3.14)가 포함되어 있기에 형 변환 진행
		System.out.println("원의 둘레 : " + dist);
		
		
	}

}
