package study0206;

import java.util.Scanner;

public class study0206Hw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 베스킨라빈스 31 게임 만들기
		 나와 컴퓨터 둘이서 진행
		 31을 제시하는 쪽이 패배
		 나 부터 시작
		 숫자 몇 개를 제시할것인지 갯수를 입력하면 자동으로 숫자가 나온다.
		 컴퓨터는 랜덤을 이용해서 몇 개를 제시할것인지 해야한다.
		 숫자는 1개부터 3개까지 가능
		 */

		 System.out.println("컴퓨터가 ~ 좋아하는 ~ 랜덤 ~ 게임 ~");
		 System.out.println("베스킨 ~ 라빈스 ~ 써리 ~ 원 !");

		 int lastNumber = 0;		// 출력 초기값
		 
		 do {
			System.out.print("1개 ~ 3개 중 출력할 숫자 갯수를 결정하세요. : ");	 
			int myDecision = scan.nextInt();
			
			if (!(myDecision >= 1 && myDecision <= 3)) {				// 1~3이외의 값을 입력했을 경우 다시 입력하기
				System.out.println("1~3 사이의 값을 입력해주세요! ");
				System.out.println("");
			}else {
			
				System.out.print("나의 턴 : ");
				switch (myDecision) {											// 입력 숫자에 따른 출력 숫자 갯수 구현
				case 3:
					lastNumber += 1;
					System.out.print(lastNumber + " ");
					if (lastNumber == 31)
						break;
				case 2:
					lastNumber += 1;
					System.out.print(lastNumber + " ");
					if (lastNumber == 31)
						break;
				case 1:
					lastNumber += 1;
					System.out.print(lastNumber + " ");
					if (lastNumber == 31)
						break;
				}

				System.out.println("");
				
				int comDecision = (int)(Math.random() * 3 + 1);		// 컴퓨터가 뽑아내는 1~3값
				
				System.out.print("컴퓨터의 턴 : ");							// 랜덤 숫자에 따른 출력 숫자 갯수 구현
				switch (comDecision) {
				case 3:
					lastNumber += 1;
					System.out.print(lastNumber + " ");
					if (lastNumber == 31)
						break;
				case 2:
					lastNumber += 1;
					System.out.print(lastNumber + " ");
					if (lastNumber == 31)
						break;
				case 1:
					lastNumber += 1;
					System.out.print(lastNumber + " ");
					if (lastNumber == 31)
						break;
				}
				System.out.println("");
				System.out.println("");
			}
		}
		while (lastNumber < 31); 
		 
		 
	
	
	
	
	}

}
