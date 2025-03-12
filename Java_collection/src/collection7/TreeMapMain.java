package collection7;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(100, "이순신");		tree.put(341, "김유신");
		tree.put(541, "장영실");		tree.put(874, "나문희");
		tree.put(241, "이순재");		tree.put(234, "박하선");
		
		System.out.println(tree);
		
		//  트리맵의 검색 메서드 - 트리맵에서 검색은 key를 검색하는 것
		
		// headMap(X) : X보다 큰 값 찾기(중복 X)
		System.out.println("<초과, 이하 찾기>");
		System.out.println("<tree.headMap>");
		System.out.println(tree.headMap(300));
		// tailMap(X) : X 포함 작은 값 찾기(중복 O)
		System.out.println("<tree.tailMap>");
		System.out.println(tree.tailMap(250));
		
		// 첫 번째 요소 : key, Entry(key와 value를 포함하는 객체(라고이해하면될듯))
		System.out.println("<첫 번째, 마지막 요소 찾기>");
		System.out.println(tree.firstKey());
		System.out.println(tree.firstEntry());
		// 마지막 요소
		System.out.println(tree.lastKey());
		System.out.println(tree.lastEntry());
		
		// 다음 요소 찾기
		System.out.println("<다음 요소 찾기>");
		System.out.println(tree.higherKey(345));
		System.out.println(tree.higherEntry(345));
		System.out.println(tree.lowerKey(300));
		System.out.println(tree.lowerEntry(500));
		
		// 지정 값 이상 / 이하 값 찾기
		System.out.println(tree.ceilingKey(342));
		System.out.println(tree.ceilingEntry(342));
		System.out.println(tree.floorKey(342));
		System.out.println(tree.floorEntry(342));
		
		// 범위검색
		System.out.println("<범위 검색>");
		System.out.println(tree.subMap(200, 600));
		
		
		
		
	}

}
