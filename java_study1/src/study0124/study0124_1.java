package study0124;

import java.util.Scanner;

public class study0124_1 {

	public static void main(String[] args) {
		// 바이킹 탑승 - 키가 140이상만 탑승
		int tall = 163;
		// if문에는 조건식이 반드시 if뒤에 붙어야 한다.
		if (tall > 140) {// 중괄호에는 조건에 따라 실행될 내용 작성
			System.out.println("탑승 가능합니다");
			System.out.println("키가 140 이상입니다");
			// 여러 실행내용 사용 가능!!!
			// if문 내에서 변수를 선언하거나 계산식을 쓸 수도 있음
		} else {// else는 조건식이 거짓일 경우 실행
			System.out.println("탑승 불가합니다");
			System.out.println("키가 140 미만입니다");
		};
		
		// 두 숫자 중 큰 수는?
		int num1 = 35;
		int num2 = 12;
		
		if (num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
		// 철수와 민수 중 누구의 발이 더 큰가?
		int 철수 = 275;
		int 민수 = 260;
		
		if (철수>민수)	{
			System.out.println("철수");
		}else {
			System.out.println("민수");
		}
		// 편의점에서 도시락을 사먹는데, 가격이 5200원이다.
		// 내 통장 잔액이 4530원이라면, 얼마가 더 필요한가??
		int price = 5200;
		int account = 4530;
		if (price > account) {
			System.out.println("당신은 " + (price - account) +"원이 더 필요합니다.");
		}else {
			System.out.println("잔액이 충분합니다.");
		}
		
		// 바이킹 탑승조건 - 키가 140이상 190이하만 가능
		// 키의 변수는 tall
		if (tall >= 140 && tall <= 190) {System.out.println("탑승 가능합니다");
		} else {
			System.out.println("탑승 불가합니다");
		}
		
		// 후룸라이드 탑승하려면 키가 130이상이거나 몸무게 45kg이상만 가능
		tall = 125;
		int wg = 35;
		if (!(tall >= 130 || wg >= 45)) {
			System.out.println("탑승 불가합니다");
		}else {
			System.out.println("탑승 가능합니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
