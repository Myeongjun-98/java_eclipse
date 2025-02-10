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
		(윈도우에 의해 필요한 만큼	대여받는건데 정확한 크기가 없으면 대여 안해줌)
		부득이하다면 변수 타입에 final을 붙여서 상수로 만들어주자 */
		/*final */int size = 5;
		int [] age = new int[size];		
		age[0] = 10;
		System.out.println(age[0]	);
		
		int [] sum = new int[3];
		int [] a = new int[] {10, 20, 30};
		int [] b = new int[] {1, 5, 9};
				
		// a배열과 b배열의 합을 sum에 저장
		for( int i = 0; i < sum.length; i++) {
			sum [i] = a[i] + b[i];
			System.out.printf(" sum[%d] = %d\n", i, sum[i]);
		}
		
		// A와 B배열의 데이터를 total배열에 저장하기
		// A배열의 값 먼저 저장하고 이어서 B배열의 값 저장될 수 있게!
		// 저장한 뒤 total배열 값 출력
		// 결과 -> 10 20 30 40 50 55 44 33 22 11
		int [] total = new int[10]	;
		int [] A = new int[] {10, 20, 30, 40, 50};
		int [] B = new int[]	 {55, 44, 33, 22, 11};
		
		for( int i = 0; i < total.length; i++) {
			if(i < 5)
			total [i] = A[i];
			if(i >= 5)
			total [i] = B[i-5];
//			System.out.printf("total[%d] = %d\n", i, total[i]);
			System.out.print(total[i] + " ");
		}
		
//		for(int i=0; i<a.length; i++) {		// 더 계량된(더 간단한) 해설코드
//			total [i] = A[i];
//			total [i] = B[i-5];
//		}
//			System.out.print(total[i] + " ");
		
		char [] name = new char[5];
		name[0] = 'j';
		name[1] = 'o';
		name[2] = 'h';
		name[3] = 'n';
		// name -> john 문자로 저장
		// 즉 문자의 배열 = ''문자열''
		/* 문자열은 배열이지만 char배열로는 온전한 문자열 입력이 어렵다.
			배열이기때문에 인덱스를 통해 문자 하나씩 입력 저장해야한다.
			그래서 자바에서는 문자열의 사용을 편하게 하기 위해 String클래스가 존재한다.
			String클래스에는 내부적으로 char배열이 생성되도록 되어있다.
			
			문자도 다른 배열의 데이터타입처럼 힙메모리를 사용하긴 하지만 바로 변환이 되어서? 가능하다.
		 */ 
		System.out.println(name);
		System.out.println("member".length());
		
		String myName = "john";
		System.out.println(myName);
		myName = "설경구";
		System.out.println(myName);
//		System.out.println(myName[0]); 	-> String은 클래스타입이기 때문에 index값 구하기 안됨, String은 배열이라기보다는 객체 즉,
		System.out.println(myName.charAt(0));
		
		String youName = new String("박문수");
		System.out.println(youName);
		
		System.out.println((int)myName.charAt(0)); 		// 형변환해서 아스키코드 봐봤음
		
		// 두 배열이 같은 배열인지 검사
		int [] ㄱ = new int[] {11, 20, 55};
		int [] ㄴ = new int[] {13, 20, 55};
		
		boolean isSame = true;
		
		for( int i = 0; i < ㄱ.length; i++) {
			if( a[i] != b[i] )
				isSame=false;
		}
		if(isSame) {
			System.out.println("같은 배열입니다.");
		}else System.out.println("다른 배열입니다.");
		
		char [] name1 = new char[] {'주','동','건'};
		char [] name2 = new char[] {'장','동','건'};
		isSame = true;
		
		// 두 배열이 같은 배열인지 검사 ( 문자의 문자열 )
		// name1과 name2의 이름이 같은 이름인가?
		for(int i = 0 ; i < name1.length; i++ ) {
			if(name1[i] != name2[i])
				isSame = false;
		}
		if(isSame) {
			System.out.println("같은 이름입니다");}
		else {
				System.out.println("다른 이름입니다.");
			}
		
		// 두 문자열이 같은 문자열인지 검사
		// 1.
		String name3 = "양동근";
		String name4 = "양동이";
		if(name3.equals(name4)) 				// 문자열 비교시 반드시 .equals 사용하기!!!!!!!
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		// 2.
		System.out.println(name3.compareTo(name4));
		// compareTo : 0이라면 두 문자열 동일
		//			양수 : 전자가 후자보다 사전적 순서가 뒤일경우 
		//			음수 : 후자가 전자보다 사전적 순서가 뒤일경우

		
		
	}
}
