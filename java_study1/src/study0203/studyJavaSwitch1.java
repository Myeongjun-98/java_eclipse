package study0203;

public class studyJavaSwitch1 {

	public static void main(String[] args) {
		
//		// switch문
//		// if문
//		if (10 > 5) {
//			System.out.println("aaa");
////			break;		if문 단독으로 시행 불가능
//			System.out.println("aaa");
//			System.out.println("aaa");
//		}
//
//		
//		switch(3) {
//		case 1:
//			System.out.println("1을 선택");
//		case 3:
//			System.out.println("3를 선택");
//		case 10:
//			System.out.println("10을 선택");
//			}
//		// 실행 지점부터 중괄호 } 끝날때 까지 실행함
//		// >> 3을 선택
//		//	 >>	10을 선택
//		
//		switch(3) {
//		case 1:
//			System.out.println("1을 선택");
//			break;			// 해당 제어문을 강제 종료
//		case 3:
//			System.out.println("3를 선택");
////			if () {
////				switch() {}
////			}
//			break;
//		case 10:
//			System.out.println("10을 선택");
//			break;
//			}
//		// break로 실행시점을 멈출 수 있음. if문 단독으로는 break 쓸 수 없으나 다른 형태와 같이 사용한다면 가능함.
//		// 만약 여기서 switch.case 안에 if문을 생성, break를 한다면 해당 case에 대해 break할 수 있음
//		// case에 문자열이 들어간다면 switch문에도 문자열이 들어가면 되지만,
//		// 여러 case에 문자열과 실수 및 정수가 혼재한다면 switch문 오류남
//		// 다만 '문자'의 경우 코드변환으로 숫자가 될 수 있으니 가능할 수 있음.
	
		int num = 5;
		switch(num) {
		case 10:
			System.out.println("10 선택");
			break;
		case 30:
			System.out.println("30 할꺼야??");
			break;
		case 20:
			System.out.println("case에 표현하는 데이터는 정수, 문자, 문자열");
			break;
		case 50:
			System.out.println("입력된 값에 맞는 case 실행은 break 또는 }까지 실행");
			break;
			default:
				System.out.println("case에 존재하지 않는 값입니다.");
		}
		/*
		  	if(점수 <= 100 && 점수 >= 90){
		  	System.out.println("A학점");
		 	else if (점수 >= 80) {
		 	System.out.println("B학점");
		 	...}
		 */
	//		위의 if 범위를 switch로 구현한다면,
		int 점수 = 79;
		switch(점수) {
		case 100:
		case 99:
		case 98:
		case 97:
			// ...... 범위를 표현하기 위해 break 쓰지 않았음. 
			System.out.println("A학점");
		}
		// 혹은,
		int 점수1 = 75;
		switch(점수1/10) {
		case 10:
		case 9:
			System.out.println("A학점");
		 	break;
		case 8:
			System.out.println("B학점");
		 	break;
		case 7:
			System.out.println("C학점");
		 	break;
		 default : 
		 	System.out.println("F학점");
			//.... 범위를 나누기로 줄여 표현
		}
	}

}
