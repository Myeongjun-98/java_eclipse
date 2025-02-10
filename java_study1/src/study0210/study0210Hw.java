package study0210;

import java.util.Scanner;

public class study0210Hw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 랜덤범위 1 ~ 50
		// 랜덤 숫자 중에서 짝수 15개를 배열에 저장
		// 15개 전부 저장되면 배열 출력
		// 숫자 중복 상관없음
		// 중복 없이도 해볼까?
		
		int [] arr = new int[15];			// arr변수를 길이 15의 배열로 선언
		for (int i = 0; i < arr.length; i++) {
			int number = ((int)(Math.random() * 25 + 1)) * 2;		// 1~50 중 무작위 짝수
			arr[i] = number;
		}
		
		for(int i = 0; i < arr.length; i++) {		// arr의 각 index값 출력
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		
		
		
						// 무작위 수가 나왔을 때
						// 그 때까지 나온 배열의 i값을 다시 반복해서 랜덤수와 같은 수가 있는지 검사?하고
						// 다시 랜덤 돌려서 같지 않으면 통과해야함
						// 1. 배열 내 수를 검사하는  for
						// 2. 조건 만족시까지 반복하는 while
		
		
		
	}

}
