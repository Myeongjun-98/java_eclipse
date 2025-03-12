package Control;

import java.util.Scanner;

import Service.ActiveService;
import Service.MemberService;
import Service.SchoolService;


public class MyMain {
	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		System.out.println("\n\n===============메뉴================");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int subMenu(SchoolService schoolService, String id) {
		System.out.println("\n ===== 아이러브스쿨 ===== \n");
		System.out.println("1. 학교찾기");
		System.out.println("2. 동창회");
		System.out.println("3. 소모임");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		int  num = sc.nextInt();
		
		// 재귀호출 // 자신이 자신을 참조함
		if(num == 1) {
			schoolService.searchSchool(id);
		}else if(num == 2) {
			schoolService.myReunion();
		}else if(num == 3) {
			schoolService.smallGather();
		}else {
			return 0;
		}
		return subMenu(schoolService, id);	// subMenu 계속 실행되게 함
	}

	public static void main(String[] args) {
		// 서비스 클래스들을 통해 로그인과 학교 찾기를 할 것이다.
		MemberService memberService = new MemberService();
		SchoolService schoolService = new SchoolService();
		
		// 메뉴
		while(true) {
			switch(menu()) {
			case 1 :	// 로그인
				String id = memberService.signIn();
				if(id != null) {		// 로그인성공
					subMenu(schoolService, id);
					return;
				}else System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
				break;
			case 2 : 
				memberService.signUp();
				
				break; // 회원가입
			case 3 :	 return; // 종료, 메인메서드가 종료됨
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
/*		재귀호출로 팩토리얼 구현하기
	int fac(int a){
		if(a == 1){
		return 1}
		return a * fac(a-1);
	}
	
	fac(5);		1번째 메서드
		a - > 5
		return 5 * fac(5-1);
		
			fac(4)		2번째 메서드
				a -> 4
				return 4 * fac(4-1);
				
					fac(3)		3번째 메서드
						a -> 3
						return 3 * fac(3-1);
							
							fac(4)		4번째 메서드
								a -> 2
								return 2 * fac(2-1);		5번째 메서드
									a -> 1
										return 1
*/
/*
	float aa (int b){
		if (b > 5){
			aa (b - 1)}
			return b/2.0;
	
	aa( 6 );

*/
