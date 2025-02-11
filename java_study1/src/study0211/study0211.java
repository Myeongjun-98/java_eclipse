package study0211;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class study0211 {

	public static void main(String[] args) {
		
		int[] num1231231 = new int[]	{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int a : num1231231) {	// 해당 형식은 배열, 객체 등 집합체?에만 써짐
			System.out.println(a);	// a에 num의 인덱스값[0] 저장 후 출력 => a에 num의 인덱스값[1] 저장 후 출력 => ...	
		}	// 배열의 인덱스 사용 불가
			// 배열의 데이터를 변경하거나 삭제 불가
		
		// 문제
		// tall배열은 A반 학생들의 키를 저장한 것이다.
		// A반에 평균키 이상의 큰 키를 찾아서 출력하세요.
		float [] tall = new float[] {167.2f, 163.4f, 175.7f, 173.8f, 158.3f};
		
		float b = 0;		// float b 선언
//		for (int i = 0; i < tall.length; i++) {
//			b += tall[i];
//		}											// 평균을 구하기 위해 tall배열의 모든 값을 더함
		for(float a : tall) {				// 위 주석을 간단하게 표현
			b += a;
		}

		float avg = b/tall.length;		// 평균구함
		
		for (float a : tall) {				// tall의 모든 배열 중 평균(avg)보다 큰 값 출력
			if(a >= avg) {
				System.out.println(a);
			}
		}
		
		// 배열 관련 메서드
		// 자바에서 데이터 출력 메서드이름은 toString
		int[] num = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println(Arrays.toString(num));
		
		
		// arraycopy( 복사배열, 복사배열시작 인덱스, 저장배열, 저장시작 인덱스, 크기)
		int[] a = new int[7];
		System.out.println(Arrays.toString(a));
		System.arraycopy(num, 0, a, 1, 4/*num.length 활용 가능*/);
		System.out.println(Arrays.toString(a));
		
		// 배열 비교
		boolean isSame = Arrays.equals(num, a);
		System.out.println(isSame);
		
		// study0210Array2에서 가져옴
		// 일부 이 메서드가 사용된다고 함
//		System.out.println(num.compareTo(a));
		// compareTo : 0이라면 두 문자열 동일
		//			양수 : 전자가 후자보다 사전적 순서가 뒤일경우 
		//			음수 : 후자가 전자보다 사전적 순서가 뒤일경우
		
		// 배열 정렬
		int[] arr = new int [] {624, 34236, 6346, 1263, 1523, 1231, 155132, 12421, 53, 1223, 1223, 15321, 136};
		System.out.println(" ============================== 정렬 전 ==============================");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);			// 오름차순 정렬
		System.out.println(" ============================== 정렬 후 ==============================");
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = new Integer[] {246, 7323, 113, 426};
		Arrays.sort(arr2, Collections.reverseOrder()); // 내림차순 정렬(이긴한데 배열 타입이 기본타입?이면 안됨)
		// comparator 구현 필요
		System.out.println(Arrays.toString(arr2));
		
		// String 배열
		String[] names = {"이순신","이성계","김춘추","정약용","문익점"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);	// 오름차순 정렬
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, Collections.reverseOrder()); // 내림차순 정렬 (Integer, String은 클래스타입이라 잘 되는 모습)
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
