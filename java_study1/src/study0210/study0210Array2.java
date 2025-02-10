package study0210;

import java.util.Scanner;

public class study0210Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 7개 정수를 저장할 수 있는 배열을 선언하고 정수 7개를 입력한 뒤 모두 출력하세요
		
		int[] myArray = new int[7];
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.print("정수 입력 : ");
			myArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.printf("%d번째 정수 : %d\n", i + 1, myArray[i]);
		}

		// 다음은 ☆지양☆할 것
		/* => 변수로 배열크기 설정하기
		정적 배열은 지정된 크기를 변경하기 어렵다.
		프로그램 실행 시 컴파일 과정에서 배열의 크기가 정해져 있어야 그만큼 공간을 할당받는데,
		배열의 크기가 확정되어있지 않으면 컴파일 과정에서 공간을 할당받지 못한다. 
		(윈도우에 의해 필요한 만큼	대여받는건데 정확한 크기가 없으면 대여 안해줌) */
		int size = 5;
		int [] age = new int[size];		
		age[0] = 10;
		System.out.println(age[0]	);
		
	}

}
