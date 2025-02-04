package study0203;

import java.util.Scanner;

public class homeworkResolving0204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 가위 2. 바위 3. 보 : ");
		int me = sc.nextInt();
		
		int com = (int)(Math.random()*3+1);

		// switch문으로 표현 시
		switch(me-com) {
		case 0:
			System.out.println("비김");
			break;
		case -1:
		case 2:
			System.out.println("패배");
			break;
		case -2:
		case 1:
			System.out.println("승리");
			break;
		default : System.out.println("올바르지 않은 값 입력"); 
		}

		
		// if문으로 표현 시
//		if(me == com) {		// 서로 같은 값이면 비김
//			System.out.println("비김");
//		}else if((me==1 && com ==3) || (me==2 && com==1) || (me == 3 && com ==1))
//		System.out.println("이김");
//		else
//			System.out.println("패배");
		
		
	}

}
