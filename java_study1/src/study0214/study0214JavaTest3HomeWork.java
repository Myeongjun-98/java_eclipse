package study0214;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class study0214JavaTest3HomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
			문제3.
				영화관 예약 사이트를 만드려고 한다.
				영화관에 관별로 좌석수가 다르다.
				3관의 좌석수는 96개 ( 8줄  12열 )이다.
				
				좌석에 예약 완료된 곳은 1로 표시
				비어있는 좌석은 0으로 표시
				
				몇 명 예약할것인지 인원수를 입력하면
				연속적으로 비어있는 자리로 지정해준다.
				몇 번째 좌석에 예약이 되었는지 출력
		*/
		// 좌석들의 이미 예약되어있는 여부는 알아서.
		// 연속적인 자리 없으면 -1 출력하게?하기.
		
		String[][]	theater = new String [8][12];
		int convert;
		
		for(int i = 0; i < theater.length; i++) {			// 랜덤추출로 영화관 자리 만들어버리기
			for(int k = 0; k < theater[i].length; k++) {
				convert = (int)(Math.random() * 10 + 1);
				if(convert > 6)			// 자리가 예악되었을 확률 40%
					theater[i][k] = "□"; 			// 비어있을 확률 60%
				else theater[i][k] = "■";
			}
		}
		
		while(true) {		// 좌석예약 시스템 시작
			//////////////////////////////////////////////////////////////////////// 출력코드
			for(int i = 0; i < theater.length; i++) {				
				for(int k = 0; k < theater[i].length; k++) {
					System.out.print(" " + theater[i][k]);
					}
				System.out.println();
				}
			/////////////////////////////////////////////////////////////////////////
			System.out.print("예약 인원수를 입력하세요. : ");		// 입력받기
			int people = scan.nextInt();
			
			String [] input = new String[people];			// 입력한 수 만큼의 index크기를 가지는 □배열 input[]생성
			for(int a = 0; a < people; a++) {						// 
				input[a] = "□";
			}
			
			String inputString = String.join("", input);		//input[]을 연속된 □의 문자열로 변환
			boolean found = false;		// 탐색결과를 판단하기 위한 boolean found
			
			for(int i = 0; i < theater.length; i++) {					// 탐색과정			
				String theaterString = String.join("", theater[i]);		// theater의 i열의 □■값을 문자열화한 theaterString을 생성
				int searching = theaterString.indexOf(inputString);		// theaterString 내에서 inputString의 첫 번째 index값 searching을 구함
				if(searching != -1) {				// 최초 값을 찾았을 때
					for(int j = searching; j < (searching + people); j++)	{	// 찾은 index부터 people만큼 ■로 변환함.
						theater[i][j] = "■";
						found = true;
						char col = (char)(i + 65);
						System.out.println(col + "열 " + j + "번 좌석을 예약하였습니다.");
						}System.out.println();
				}if (found == true)				// 값 찾았을 시 시퀀스 끝
					 break;
			}
			if (found == false)				// 값 못 찾았을 시
				System.out.println(" 예약 가능한 연속된 좌석이 없습니다. 다시 시도해주세요.");
			
		} // while 끝.
		
		
		
		
	}

}
