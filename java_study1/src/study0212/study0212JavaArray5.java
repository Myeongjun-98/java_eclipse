package study0212;

import java.util.Arrays;

public class study0212JavaArray5 {

	public static void main(String[] args) {
		// 1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원배열이 여러개로 이루어진 구조
		// 3차원 배열 : 같은 타입의 2차원배열이....
		
		int[] a = new int [] {3, 4, 5};		// 1차원 배열 - 3의 크기
		int[] b = new int [] {1, 20, 60};	// 1차원 배열 - 3의 크기
		int[] c = new int [] {23, 98, 54};
		// A반 학생의 성적 -> 1차원 배열
		// 1학년 전체 학생성적 -> 2차원 배열
		
//		int [][] abc = new int[2][3];		// 1차원 배열이 2개, 3의 크기를 가짐 => 3의 크기를 가진 1차원 배열이 2개있음.
//		int [][] abc = new int[][] { {1, 2, 3} , {4, 5, 6} };
		int [][] abc = new int [][] {a, b, c};
		System.out.println(Arrays.toString(abc));		// 각 배열의 주소값 출력함
		System.out.println(abc[0][0]); 		// 2차원배열 순서의 인덱스를 출력 ( a배열의 0인덱스 )

		
		int[][] arr = new int[3][4];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 50;
		arr[1][3] = 100;
		arr[2][1] = 40;
		
//		for ( int i = 0; i < 3; i++) {
//			for ( int k = 0; k < 4; k++) {
//				System.out.println(arr[i][k]);
//				아래로 바꿀 수 있음
		for ( int i = 0; i < arr.length; i++) {
			for ( int k = 0; k < arr[i].length; k++) {
				System.out.println(arr[i][k]);
								
		// 1차원 배열 -> 향상된 for문 : for(int a : array){}
		for(int l = 0; l < arr.length ; l++) {
			for (int num : arr[l]) {
				System.out.println(num);
			}
		}
		// or
		for(int[] tmp : arr) {
			for( int num : tmp) {
				System.out.println(num);
			}
		}
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
