package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMethod {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("수박", 15000);		map.put("바나나", 5400);
		map.put("앵두", 2300);		map.put("딸기", 12400);
		
		System.out.println(map);
		
		map.put("수박", 19000);		// value가 변경됨
		System.out.println(map);
		
		// 포함 여부는 contains인데 key, value 각각 있다. (containsKey, containsValue)
		if(map.containsKey("수박")) 
			System.out.println("key로 수박이 사용중");
		
		// 키 반환 = Set
		System.out.println(map.keySet());
		// 값 반환 = values
		System.out.println(map.values());
		
		// 특정 value를 조회하는 방법 : 해당하는 Key를 입력
		System.out.println(map.get("앵두"));
		// 없을 시, null 반환
		System.out.println(map.get("사과"));
		
		// 맵에 저장되어있는 특정 key의 value 변경
		map.put("앵두", 3100);	
		System.out.println(map);
		map.replace("앵두", 4300);
		System.out.println(map);
		// 둘 다 value를 바꾸지만
		// put 메서드는 새로운 값 저장 또는 변경(수정)
		// replace는 변경(수정)만 가능
		map.put("토마토", 5600);
		System.out.println(map);
		map.replace("구아바", 9800);
		System.out.println(map);
		
		// key를 꺼내옴
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// 전체 조회 (배열형식으로)
		System.out.println("entrySet");
		System.out.println(map.entrySet());
		
		// Map이 key와 value로 이루어져있어 활용하기 어려우므로 entrySet 활용함
		System.out.println("entrySet 활용");
		for ( Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent);	// 출력하면 K = V
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
		
		////////////////
		
		HashMap<String, Active> cmd = new HashMap<>();
		cmd.put("회원가입", new Member());
		cmd.put("게시판", new Board());
		cmd.put("게임", new Game());
		
		cmd.get("게시판").save();
		cmd.get("회원가입").save()	;
		cmd.get("게임").save();
		
		String command = "게시판";
		
		Active action = cmd.get(command);
		action.save();
		
		
	}

}

/*	
	Map
		key 와 value로 이루어진 구조
		key는 중복 불가, value는 중복 가능
		조회방법은 key를 통해 value찾기
		
		HashMap, TreeMap
		
		*조회는 빠르지만 메모리사용이 List, Tree에 비해 굉장히 크다고 함*

*/