package collection1;

import java.util.ArrayList;

public class MainMethod {

	public static void main(String[] args) {
		
		// 배열에 정수를 추가로 저장될 수 있게 하기
		MyArray a = new MyArray();
		a.add(100);
		a.add(123123);
		a.add(50);
		a.add(123);
		a.add(5125);

//		System.out.println(a.get(1));
		/////////////////////////////////////////////////////
		ArrayList list = new ArrayList();
		list.add("처음");
		list.add(100);
		list.add("ㅁㄴㅇㄻㄴㅇㄻㄴㅇ");
		list.add(3.141414);
		list.add('a');
		list.add(5521);
		list.add('a');
		list.add("끝");
		
		System.out.println(list.size());	// 크기 - 데이터 몇개 저장되어있는가
		System.out.println(list.get(1));	// 인덱스위치의 데이터 출력
		System.out.println(list.indexOf('a'));	//	배열에 특정데이터 어디에 있는지(첫 번째를 찾음)
		System.out.println(list.lastIndexOf('a'));	// 특정데이터가 중복 시 마지막에 있는 거
		System.out.println(list.get(2));
		list.remove(2);		// 인덱스를 지정하여 해당 데이터 삭제
		System.out.println(list.get(2));
		list.remove("ㅁㄴㅇㄻㄴㅇㄻㄴㅇ");	// 삭제할 데이터 직접 입력하여 삭제
		
		System.out.println("여기다!");
		System.out.println(list.size());	
		list.remove(a);		// 안지워짐
		list.remove("a");	// 안지워짐
//		list.remove('a');		// 인덱스로 인식해서 오류발생
		System.out.println(list.size());
		System.out.println("여기까지다!");
		
		for(int i = 0; i < list.size(); i++) {		// 반복문을 사용, 전체 출력
			System.out.println(list.get(i));
		}
		
		for(Object o : list) {		// 향상된 for문 => 타입은 Object
			System.out.println(o);
		}
		
		list.add(1, "내가원하는곳");	// (인덱스, 내용) 형식으로 삽입 가능
		for(Object o : list) {
			System.out.println(o);
		}
	
		System.out.println(list);		//	배열을 그냥 출력해줌 편함
		System.out.println(list.contains(100));	// 포함 여부를 알려줌
		
		list.clear();	// 지워버림
		System.out.println(list);
		
		
		
		
		
	}

}
/*
	자바 컬렉션 프레임워크
		자료구조와 알고리즘을 클래스화 시켜놓은것
		자료구조 - 데이터를 저장관리하는 방법
		알고리즘 - 저장된 데이터를 가공하는 방법
		
		Collection				/			Map
			List									HashMap
				ArrayList						TreeMap
				LinkedList						Properties
				Vector
				Stack
				Queue
			Set
				HashSet
				TreeSet


*/