package study0214;

public class study0214JavaString3 {

	public static void main(String[] args) {
		
		String str = "member";		// == String str = new String("member");
		System.out.println(str);
		System.out.println(str.charAt(2));
		
		char[] c = new char[]{'a'};					//	배열
		String std = new String("student");	//	객체	서로의 구성 차이
		
		c[0] = 'a';		// new연산자 안씀, 못씀
		String[] names = new String[5];		// 배열
		names[0]	=	/*new String("박문수)*/"박문수";
		names[1] = new String("김정호"); /*"김정호"*/
		names[2] = "서경림";
		names[3] = "김명준";
		names[4] = "이정훈";
		
		// 김미란 이름 등록 되어있나??
		boolean isThere = false;
		for(String name : names) {
			if(name.equals( "김미란"))
				isThere = true;
		}
		if(isThere) {
			System.out.println("등록되어있는 이름입니다.");
		}else System.out.println("등록 안되어있음");
		
		// 똑같은 방법으로 어제 했던 메서드 활용하기
		String temp = String.join(",", names);
		// -> temp = 박문수,김정호,서경림,김명준,이정훈
		boolean hasName = temp.contains("김미란");
		if(hasName)
			System.out.println("등록되어있음");
		else System.out.println("안되어있음");
		
		
		
		
		
		
		
	}

}
// 참조변수 : 특정 공간의 메모리주소만 저장할 수 있는 변수
// 참조변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수
//		배열의 주소를 가지고 있는 참조변수는 -> 참조변수이름[인덱스] 방식
//		객체의 주소를 가지는 참조변수는 참조변수이름.xxxx 방식으로 사용
// int a = 10;