package study0121;

import java.util.Scanner;

public class study0121_1 {

	public static void main(String[] args) {
		
		System.out.println(" 한 줄에 하나씩 출력 !@$%@#$");
		System.out.print(" 한 줄에 이어서 출력 ");
		System.out.print("그 다음 \n 이어서 줄력");
		// print(ln)에서는 %가 문자열료 표현됨
		System.out.println(" % ");
		
		System.out.printf(" 그냥 print 처럼 사용 가능 ");
		System.out.printf(" println 처럼 \n 하려면 \n");
		System.out.printf(" 다음줄에 출력  \n");
		System.out.printf(" %d ", 100);
		// %를 문자로 표현하고 싶으면 %를 두 번 사용한다.
		System.out.printf(" %% ");
		// 형식 지정자를 사용하기 위해 주의할 것
		// 1. 형식지정자와 데이터 위치를 맞춰야한다.
		System.out.printf(" %d %f ", 100, 3.14);
		// 2. 형식 지정자와 데이터 갯수 맞추기
		System.out.printf(" %d %d %d ", 10, 20, 30);
		
		System.out.println(2025+"년" + 1+"월" + 21+"일");
		System.out.printf("%d년 %d월 %d일 \n", 2025, 1, 21);
		
		float fnum = 5.12345f;
		System.out.println("println 출력 : " + fnum);
		System.out.printf("printf 출력 : %.1f \n", fnum);
		//%.1 = 소수점 1자리까지만 출력해라
		
		int num = 15;
		System.out.println(num);
		System.out.printf("%4d\n", num);
		// 자리수 지정 가능 [ ↑ 정수를 4자리로 표현해라.]    =>  __15 같은 느낌
		System.out.printf("%-4d\n", num);
		// 4자리를 확보하고 왼쪽에 정렬 => 15__
		
		/* 형식 지정자 ( 서식문자 )
		 * %d, %i : 10진수 정수
		 * %f : 10진수 실수
		 * %c : 문자
		 * %s : 문자열
		 * %b : boolean 타입
		 * %o : 8진수
		 * %x : 16진수
		 * */
		
		
		
	}

}
