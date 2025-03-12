package pw;

import java.util.Scanner;

public class MainMethod {

public static String passWording(String string) {		// 문자열의 홀수번째 인덱스는 -5, 짝수번째 인덱스는 +5 하여 암호화하는 메서드
	
	String sum = "";
	
	for(int i = 0; i < string.length(); i++) {
		char element = string.charAt(i);
		
		if(i%2 == 0) {
			element += 5;
		}else element -= 5;
		
		sum += element;
	}
	System.out.println("생성된 암호 : " + sum);
	return sum;
}

public static String unPassWording(String string) {		// 복호화
	
	String sum = "";
	
	for(int i = 0; i < string.length(); i++) {
		char element = string.charAt(i);
		
		if(i%2 == 0) {
			element -= 5;
		}else element += 5;
		
		sum += element;
	}
	
	System.out.println("복호화 된 암호 : " + sum);
	return sum;
}
	
	public static void main(String[] args) {		///////////////// 메인
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("변환할 암호 입력 : ");
		String input = scan.nextLine();
		
		String pw = passWording(input);			// 암호화 실행 및 암호 생성
		
		unPassWording(pw);	// 복호화 실행
		
	}

}
