package collection6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMethod {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("이성계");
		set.add("강감찬");
		set.add("문익점");
		set.add("박문수");
		set.add("정약용");
		
		set.add("김유신");		//		중복을 넣어도 그대로 데이터는 한 개임.
		System.out.println(set);		//  set은 지금까지와 달리 순차적으로 저장되지 않는 모습.
		
		// HashSet은 직접 값 한개씩 출력 불가
		// 그래서 다른것들을 써야함. 
		// 1. ArrayList
		System.out.println("1. ArrayList화");
		ArrayList<String> array = new ArrayList<>(set);
		System.out.println(array.get(2));
			
		// 2. Iterator -> ArrayList, LinkedList, Vector 내장되어있음
		Iterator<String> it = set.iterator();
		System.out.println("2. Iterator");
		while(it.hasNext()) {		// DB연결 시 ResultSet과 흡사
			System.out.println(it.next());
		}
		
		/*
		 		거래 내역 - 3달치 거래 내역을 가져온다.
		 		만원 이하, 5만원 이하, 10만원 이하
		 	거래내역을 DB에서 가져와서 ArrayList나 Vector에 저장
		 	반복문 돌리면서 if문 사용해서 
		 	만원이하인 경우 Hashset A에 저장
		 	5만원 이하는 HashSet B에 저장
		 	10만원 이하는 HashSet C에 저장
		*/
		
		// remove 이용, 데이터 삭제 가능
		System.out.println("3. remove");
		set.remove("김유신");
		System.out.println(set);
		System.out.println(set.contains("강감찬"));
		
		// 집합 직접 구현하기
		HashSet<String> 찬양과일 = new HashSet<>();
		찬양과일.add("바나나");
		찬양과일.add("수박");
		찬양과일.add("딸기");
		찬양과일.add("참외");
		찬양과일.add("키위");
		찬양과일.add("메론");
		
		HashSet<String> 예나과일 = new HashSet<>();
		예나과일.add("체리");
		예나과일.add("자두");
		예나과일.add("메론");
		예나과일.add("무화과");
		예나과일.add("망고");
		예나과일.add("바나나");
		예나과일.add("수박");
		예나과일.add("오렌지");
		
		System.out.println("3. 교집합");
		HashSet<String> 교집합 = new HashSet<>();
		Iterator<String> 과일 = 찬양과일.iterator();		// 과일 은 찬양과일에서 하나씩 빼온다
		while(과일.hasNext()) {		//	다음에 데이터가 있는지 여부를 판단한다.
			String fruit = 과일.next();		//	과일에서 하나씩 빼온다
			if(예나과일.contains(fruit)) {		// 겹치면
				교집합.add(fruit);		// 교집합에 표시(값을 삽입)
			}
		}
		System.out.println(교집합);
		
		// 차집합, 찬양과일의 차집합 구하기
		//	위에서 구한 교집합을 배제하고 만들어보기
		System.out.println("4. 차집합");
		HashSet<String> 차집합 = new HashSet<>();
		과일 = 찬양과일.iterator();		//	iterator은 일회성이라서 같은 스크립트 내 다시 사용 가능
		while(과일.hasNext()) {
			String fruit = 과일.next();
			if(!예나과일.contains(fruit)) {
				차집합.add(fruit);
			}
		}
		System.out.println(차집합);
		
		// 합집합
		// 찬양과일과 예나과일의 모든 과일
		System.out.println("5. 합집합");
		HashSet<String> 합집합 = new HashSet<>();
		과일 = 찬양과일.iterator();
		while(과일.hasNext())
			합집합.add(과일.next());
		과일 = 예나과일.iterator();
		while(과일.hasNext())
			합집합.add(과일.next());
		System.out.println(합집합);
		
		// Set 의 메서드를 이용하여 교집합, 차집합, 합집합
		System.out.println("<교집합 표현 retainAll>");
		HashSet<String> 교집합2 = new HashSet<>(찬양과일);
		교집합2.retainAll(예나과일);
		System.out.println(교집합2);
		
		System.out.println("<차집합 표현 removeAll");
		HashSet<String> 차집합2 = new HashSet<>(찬양과일);	// 차집합을 구하고자 할 집합을 여기에 써준다.
		차집합2.removeAll(예나과일);
		System.out.println(차집합2);
		
		System.out.println("합집합표현 addAll");
		HashSet<String> 합집합2 = new HashSet(찬양과일);
		합집합2.addAll(예나과일);
		System.out.println(합집합2);
		
		
		
		
	}

}

/*	
	Set - 순차저장 안 됨, 중복불가
	
	HashSet - 그룹화 목적( 집합 - 교집합, 합집합, 차집합 )
	TreeSet - 오름차순 정렬, 검색에 특화
	

*/
