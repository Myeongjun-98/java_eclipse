package study0217;

import java.util.Arrays;

public class study0217JavaTest4 {

	public static void main(String[] args) {
		
		/*
			문제 4
			
			도서관의 관리자로 대출한 사람들의 기록을 관리하고 있다.
			도서관에서 여러 사람들이 책을 대출하며 각 사람은 여러권의 책을 대출할 수 있다.
			각 사람이 대출한 책의 제목을 배열로 저장하고 그 사람의 대출 내역을 출력하는 프로그램을 작성하시오
			
			조건
				-	도서관에는 3명의 이용자가 있고 최대 5권까지 대출
				-	각 이용자의 이름과 대출한 책 제목을 출력
				
			# 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고 배열 선언 시 초기값 지정해도 되고
		
		*/
		
		/*
		  	도서관의 배열 => []	( 이름)
		  	
		  	사람의 배열 => String 사람 =	[]	[]	(	(사람의 아이디), 빌린책(5까지, 5의크기)
		  
		  
		 */
		
//		String[] 도서관 = new String[] {"이런책", "그런책", "저런책", "이상한책", "나쁜책"	, "좋은책", "잘생긴책","예쁜책",
//				"못생긴책","흉측한책","바보책","똑똑한책","천재책","둔재책","자바","JS","html","css","jquery"};
//		
//		String[][] 사람 = new String[3][5];

		String[][] book = new String[][]	{
			{"짱구", "이런책", "그런책", "저런책", "이상한책"},
			{"철수", "나쁜책"	, "좋은책", "잘생긴책"},
			{"훈발", "똑똑한책","천재책","둔재책","자바","JS"}
		};
		
		for(String[] info : book) {
			for(String tmp : info) {
				System.out.println(tmp);
			}
			System.out.println();
		}
		
		/*
			문제 5
			농장 수확량 계산
			농장의 일일 수확량을 배열에 저장했다
			전체 수확량을 구하고, 평균 수확량을 구하세요
			가장 많은 수확량은 얼마인지 출력
		*/
		
		int []	 harvest = {9, 10, 11, 8, 7, 5};
		float avg = 0;
		int max = 0;
		
		for(int i = 0; i < harvest.length; i++) {
			avg += harvest[i];
			if( harvest[i] > max)
				max = harvest[i];
		}
	
		avg = avg/harvest.length;
		
		System.out.println("평균값 : " + avg);
		System.out.println("최대값 : " + max);
		
		Arrays.sort(harvest); // 정렬 오름차순
		System.out.println("가장 많은 수확량 : " + harvest[harvest.length-1]);
		
		
	}

}
