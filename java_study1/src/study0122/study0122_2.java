package study0122;

import java.util.Scanner;

public class study0122_2 {

	public static void main(String[] args) {
		//비교연산자 - 두 개의 데이터를 비교하여 참, 거짓 결과
		System.out.println(10 > 5);
		System.out.println(11 < 4);
		
		Scanner scan = new Scanner(System.in);
				
		int num;
		
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		System.out.println("5보다 큰 숫자인가 ? : " + (num > 5));
		boolean big;
		big = num >= 10;
		System.out.println("10 이상인가 ? : " + big);
		
		System.out.println(10 == 10);  // 두 숫자가 같다.
		System.out.println(10 == 13);  // 두 숫자가 다르다.
		System.out.println("가나다" == "가나다");  // 두 문자가 다르다, 같다  // ! 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별?? // 되긴 하는데 하지 말라고 하심;;;
		
		String word = "가나다"; // 문자열은 클래스 String을 사용하여야 함.  //  이것이 적절한 방법..
		String word2 = new String("가나다");
		
//		System.out.println(word == word2);				// 문자열의 경우에는 이렇게 쓰지 말고...  // 이거 false나옴, 주소값으로 비교하게됨
		System.out.println(word.equals(word2));		// equals를 사용해라... 근데 false 나오네.. 뭐지..
		System.out.println('j' > 'k');	
		// 문자는 가능
		
		System.out.println(10 != 5);							// 부정연산은 같지 않으면 참
		
		// 놀이동산에 가서 어트랙션을 타는데 키가 140 이상만 탈 수 있다.
		int tall;
		System.out.print("키 : ");
		tall = scan.nextInt();
		System.out.println(tall >= 140);
		
		// 바이킹 탑승조건 : 키 140이상, 190이하
		// 비교연산자로 만들어진 조건식이 여러개인 경우 논리연산자를 이용
		System.out.println(tall >= 140 && tall <= 190);
		
		// 140 <= tall <= 190
//		System.out.println(140 <= tall <= 190); 			// 비교 데이터 타입 불일치 		// true <= 190 ???
		
		// 청소년 버스요금은 1000원이다. (청소년은 13세부터 19세)
		// 나이를 입력받아서 청소년이면 false, 아니라면 true가 출력되게 하세요
		int age ;
		System.out.print("나이입력 : ");
		age = scan.nextInt();
		System.out.println(age < 13 || age > 19);
		// if 청소년 true, 아니면 false일 시;
//		System.out.println(age <= 13 && age >= 19); // 도 괜찮지만, 만들어둔것이 있으니
//		System.out.println(!(age < 13 || age > 19)); // 반대로 표현하여 간단하게 표시할 수 있다.
		
		// 조건식 - 비교연산자와 논리 연산자를 사용하여 만든 식
		
		

	}

}
