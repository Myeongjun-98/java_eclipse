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

		System.out.println(a.get(1));
		/////////////////////////////////////////////////////
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("ㅁㄴㅇㄻㄴㅇㄻㄴㅇ");
		list.add(3.141414);
		list.add('a');
		list.add(5521);
		list.add('a');
		
		System.out.println(list.size());	// 크기 - 데이터 몇개 저장되어있는가
		System.out.println(list.get(1));	// 인덱스위치의 데이터 출력
		System.out.println(list.indexOf('a'));	//	배열에 특정데이터 어디에 있는지
		System.out.println(list.lastIndexOf('a'));
		System.out.println(list.get(2));
		list.remove(2);		// 인덱스를 지정하여 해당 데이터 삭제
		System.out.println(list.get(2));
		list.remove("ㅁㄴㅇㄻㄴㅇㄻㄴㅇ");	// 삭제할 데이터 직접 입력하여 삭제
		
		
		
		
		
		
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