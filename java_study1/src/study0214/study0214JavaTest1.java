package study0214;

import java.util.Scanner;

public class study0214JavaTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 문제 1
		 	학생 5명의 시험 성적을 키보드를 통해 입력받고
		 	평균 점수를 구하여 출력하세요.
		 	반드시 시험성적은 배열에 저장하기
		 		 */
		
		int p1 , p2, p3, p4, p5;
		System.out.printf("%d번째 학생의 성적을 입력하세요 : \n", 1);
		p1 = scan.nextInt();
		System.out.printf("%d번째 학생의 성적을 입력하세요 : \n", 2);
		p2 = scan.nextInt();
		System.out.printf("%d번째 학생의 성적을 입력하세요 : \n", 3);
		p3 = scan.nextInt();
		System.out.printf("%d번째 학생의 성적을 입력하세요 : \n", 4);
		p4 = scan.nextInt();
		System.out.printf("%d번째 학생의 성적을 입력하세요 : \n", 5);
		p5 = scan.nextInt();
		
		int a = 0;
		int[] score = new int[] {p1, p2, p3, p4, p5};
		for(int b : score) {
			a += b;
		}
		System.out.println("평균 점수 : " + (a / score.length));
		
		//////// 해설
		int total = 0, avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 학생 성적 입력 : ");
			score[i] = scan.nextInt();
			total = total + score[i];		// 총점구하기
		}
		avg = total/score.length;
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
	}

}
