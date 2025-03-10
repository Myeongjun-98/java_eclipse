package study0123;

public class study0123_1 {

	public static void main(String[] args) {
		// 비트 논리 연산자
		System.out.println(27&13);			// &연산, 두 가지 다 참이어야 참
		// 1 1 0 1 1  > 27
		// 0 1 1 0 1  > 13
		// ----------
		// 0 1 0 0 1  >  9
		System.out.println(27 | 13);			// |연산, 하나라도 참이라면 참
		// 1 1 0 1 1  > 27
		// 0 1 1 0 1  > 13
		// ----------
		// 1 1 1 1 1  >  31
		System.out.println(27 ^ 13);			// ^(xor)연산, 두 가지가 참이라면 거짓, 하나라도 참이라면 참
		// 1 1 0 1 1  > 27							// 다름을 표현하기 위해 자주 쓰임
		// 0 1 1 0 1  > 13
		// ----------
		// 1 0 1 1 0  > 22 
		System.out.println(~13);				// ~연산, not연산.
		// 1 1 0 1  >  13
		// ----------
		// 0 0 1 0 > -14????
		
		// 0 0 0 0 1 1 0 1  >  13
		// -----------------
		// 1 1 1 1 0 0 1 0   >  -14         		// 부호비트가 양수에서 음수로 변환되어, 1의 보수를 취함.         
		 													//	 보수란? n1에서 n2가 부족한 수 // 4에서 6의 보수 = 2
															// (음수부호비트)11110010을 표현하기 위해서 여기에 2의 부호를 취해야함
															// but, 2진수에서 2를 쓸 수 없으니 1의 보수에 +1을 함으로 2의 보수를 표현.
		// 즉 1의 보수를 구한 후 +1을 하기 위해 다시
		// 1 1 1 1 0 0 1 0  > -14
		// -----------------
		// 0 0 0 0 1 1 0 1 > 13  (음수부호소유)
		//   					   +   1
		// -----------------
		//							 14	
															// 양수범위 : 0 1 2 3 4 5 6 7 ..
															// 음수범위 :    1 2 3 4 5 6 7 ..
															// 음수범위의 숫자가 하나 적어서 하나를 더해준다(+1)는 개념
	}

}
