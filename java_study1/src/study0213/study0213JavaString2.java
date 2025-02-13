package study0213;

public class study0213JavaString2 {

	public static void main(String[] args) {
		
		// 문자열 메서드
		String word = " I like eating a hamburger"	;
		// 문자열에서 특정 문자 추출
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(0));	// 띄어쓰기도 문자열의 하나
		// 문자열에서 지정된위치로 범위를 정해 문자열 추출
		System.out.println(word.substring(0));	// 해당 인덱스 이후로 출력
		System.out.println(word.substring(7, 14)); // 인덱스 포함 처음과 끝 사이 연속출력
		
		String temp = word.substring(7,14); // 추출해서 저장할수도 있음
		System.out.println(temp);
		
		//문자열의 길이
		System.out.println(word.length());
		
		
		////////////////////////////////////////////////////
		String text = "나랏말싸미 듕귁에 달아 문자와로 서로 사맛디 아니할쎄 이런 전차로 어린 백성이 니 르고저 할빼이셔도 마참내 제 뜻을 능히 펴지 못할 놈이 하니다. 내 이를 어여삐 너겨 새로 스물여덟자를 맹가노니 사람마다 수비니겨 날로쓰매 편아케 하고저 할 따라미니라";
		// 문자열에서 특정 문자 또는 문자열 인덱스 구하기
		int idx = text.indexOf("싸");
		System.out.println(idx);
		
		idx = text.indexOf("문자와로");
		System.out.println(idx);
		// 문자와로부터 출력할래
		idx = text.indexOf("문자와로");
		System.out.println(text.substring(idx));
		
		idx = text.indexOf("문댜와로");
		System.out.println(idx);
		// indexOf() 메서드는 문자열에서 특정 문자나 문자열의 인덱스를 알려주는데,
		// 만일 없는 값이라면 -1을 준다.
		
		// indexOf() 메서드를 통해 문자열에 특정 문자나 문자열이 포함되어있는지 알 수 있다.
		// 포함 여부 알 수 있는 메서드 !! 하나더 !!
		
		System.out.println(text.contains("듕귁에"));
		
		// 문자열 비교 - equals()	문자열A.equals(문자열B)
		// 결과는 true, false
		
		// 문자열 분할 -> 문자열을 배열로
		text = "서경림-김현진-김미란-김석진-주동건-정수영";
		System.out.println(text.split("-")[2]);
		
		String[] names = text.split("-");
		System.out.println(names[4]);
		
		// 배열 -> 문자열로 변환
		text = String.join("," ,  names);	// names[0] + "," + names[1] + "," + ....
		System.out.println(text);
		
		// 대문자, 소문자
		System.out.println(word);
		System.out.println(word.toUpperCase());
		word=word.toUpperCase();
		System.out.println(word.toLowerCase());
		
		// 문자열 합치기		"abc" + "zxc" > abczxc
		System.out.println("abc" + word);
		System.out.println("abc".concat(word));
		
		// String 클래스 타입의 변수가 비었냐?	(문자열이 저장되어있냐?)
		System.out.println(word.isBlank());
		System.out.println(word.isEmpty());
		
		word = "";
		
		System.out.println(word.isBlank());
		System.out.println(word.isEmpty());
		
		word = " ";
		
		System.out.println(word.isBlank());
		System.out.println(word.isEmpty());
		// isBlank() : 띄어쓰기 확인 안함(띄어쓰기와 같이 빈공간인 경우 비었다고 함)
		// isEmpty() : 띄어쓰기도 확인함(문자열의 인덱스가 존재하지 않아야됨)
		System.out.println(word.length());
		
//		word = null;
//		System.out.println(word.isBlank());
//		System.out.println(word.isEmpty());
//		// null이 저장되어있는 경우에는 문자열 관련 메서드 사용 불가
		
		// 문자열 치환
		
		word = "김현진은 너구리를 좋아한다.";
		
		System.out.println(word);
		System.out.println(word.replace("너구리", "강아지"));
		
//		바꾸고싶으면
		text = word.replace("너구리", "강아지");
		System.out.println(text);
		
		word = "010.1234.5678.9128";
		System.out.println(word.replaceAll("[0-4]", "a"));
		
		/*		정규 표현식
		 
		 		.		임의의 문자 1개를 의미
				^		시작을 의미	(^a : a로 시작하는 단어)
		 		$		$앞의 문자열로 문자가 끝나는지를 의미	(a$ : a로 끝나는 단어)
		 		[]		[]괄호 안의 문자가 있는지 확인해라 뜻	([a] : a문자가 있는지 확인)
		 		[^]	 []괄호안에 ^뒤의 문자가 있으면 제외해라
		 				[a-z] : a부터 z까지 문자 확인
		 				[^a-z] : a부터 z까지를 제외한 문자
		 		-		사이의 문자 또는 숫자를 의미	([a-z] : a부터 z까지 문자 확인
		 				[a-z0-9] : 알파벳소문자 전체, 0~9중 한 문자			(제대로 쓴거 맞음. 콤마 안들어간대)
		 		|		또는	[a|h]
		 		()		그룹	01(0|1) : 01뒤에 0 또는 1
		 		{}		개수	a{3}b : a가 3번 나오고 뒤에 b가 있다
		 				^\d{3}-\d{4}-\d{4}$	:	전화번호 정규표현식
		 				이걸로시작
		 									이걸로끝남
		 		\d		0~9 숫자
		 		\b		공백, 탭, /를 의미
		 		\B		\b의 부정(공백, 탭 등이 아닌 문자)
		 		\D		\d의 부정(0~9가 아닌 것)
		 		\w	알파벳 대소문자 + 숫자 + "_"	[a-zA-Z_0-9]
		 */
		
		word = "tomato98731";
		//	알파벳 제외한 나머지를 0으로 변경
		// 알파벳 소문자를 제외한 나머지를 0으로 변경
		System.out.println(word.replaceAll("[^a-z]", "0"));
		
		// 비밀번호 6자리 이상 12자리 이하, 영어 소문자, 숫자 포함
		// ^[a-z0-9]{6,12}$		(시작과 끝이 6~12자리의 a-z, 0-9를 포함해야 한다)
		
		// 주민등록번호확인
		// \d{6}\-\d{[1-4]}\d{6}	(하이픈(-)을 문자로 표시하기 위해 \ 사용)
		
		
		
		
		
	}

}
