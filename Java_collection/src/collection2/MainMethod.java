package collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainMethod {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("김춘추");
		names.add("박은희");
		names.add("최예너");
		names.add("정소영");
		names.add("김현직");
		names.add("서경석");
		
		System.out.println(names);
		
		// 이순신 이름이 등록죄지 않으면 등록하고 있으면 등록 안하고 하려면?
//		if(names.contains("이순신") == false) {
		if(!names.contains("이순신")) {
			names.add("이순신");
		}
		System.out.println(names);
		
		// list -> Array(배열)
		String[] arr = names.toArray(new String[names.size()]);
		Arrays.sort(arr);	// 배열의 정렬
		System.out.println(Arrays.toString(arr));	// 배열을 출력(문자열화)
		
		// Array(배열) -> list
		ArrayList<String> n = new ArrayList<>(Arrays.asList(arr));
		
		// ArrayList 정렬법 (오름차순)
		System.out.println("==== 정렬 전 ( names ) ====");
		System.out.println(names);
		
		Collections.sort(names);		//	정렬 !!!!
		System.out.println("==== 정렬 후 ( names ) ====");
		System.out.println(names);
		
		// ArrayList 정렬법 (오름차순)
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);		
		
		// 최예너 -> 최예나 변경
		names.set(names.indexOf("최예너"), "최예나");
		System.out.println(names);
		
		// 김씨성을 가진 사람만 출력
		for(String name : names) {
			if(name.charAt(0) == '김') {
				System.out.println(name);
			}
		}
		
		names.add("박수영"); names.add("김나영");
		// 이름에 '영'을 '진'으로 변경
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).contains("영")) {
				names.set(i, names.get(i).replace("영", "진"));
			}
		}
		System.out.println(names);
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(100);
		number.add(544);
		number.add(213);
		number.add(11);
		number.add(32);
		
		for(Integer a : number) {
			System.out.println(a);
		}
		
		//	1~50 랜덤 범위에서 25개 숫자를 저장, 중복 없음
		ArrayList<Integer> bingo = new ArrayList<>();
//		while(true) {
//			int rannum = (int)(Math.random()*50+1);	// 랜덤수 생성
//			if(!bingo.contains(rannum))	// 랜덤수를 포함하지 않을 시 add
//			bingo.add(rannum);
//			
//			if(bingo.size() == 25)	// ArrayList bingo의 사이즈가 25가 되면 종료.
//				break;
//		}
		
		do {		// 해설 , do - while 이용
			int temp = (int)(Math.random()*50+1);
			if( !bingo.contains(temp) )
				bingo.add(temp);
			
		}while(bingo.size() != 25);
		
		
		
			System.out.println(bingo);
		
		
		
	}

}
