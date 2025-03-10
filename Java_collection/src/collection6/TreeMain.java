package collection6;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(35); 	tree.add(41); 	tree.add(29);
		tree.add(9);		tree.add(15);		tree.add(20);
		tree.add(56); 	tree.add(49); 	tree.add(11);
		tree.add(17);		tree.add(89);	tree.add(39);
		
		System.out.println(tree);
		
		// headset(X);
		// ..보다 작은 값들 (일치하는 것 X)
		System.out.println(tree.headSet(20));
		
		// tailset(X);
		// ..의 이상값들 (일치하는것 포함)
		System.out.println(tree.tailSet(35));
		
		// first();
		// 맨 앞(작은값)
		System.out.println(tree.first());
		
		// last();
		// 맨 뒤(큰 값)
		System.out.println(tree.last());
		
		// higher(X);
		// 가장 가까운 초과값 (자신 포함 X), 없으면 null
		System.out.println(tree.higher(29));
		
		// lower(X);
		// 가장 가까운 미만값 (자신 포함 X), 없으면 null
		System.out.println(tree.lower(30));
		
		//	ceiling(X);
		// 가장 가까운 이상값 (자신 포함 O), 없으면 null
		System.out.println(tree.ceiling(39));
		
		// floor(X);
		// 가장 가까운 이하값 (자신 포함O), 없으면 null
		System.out.println(tree.floor(17));
		
		// subset(X, Y)
		// 범위지정 검색, (X = 포함O /// Y = 포함X), 없으면 [ ]
		System.out.println(tree.subSet(17, 41));
		
		
		
		
	}

}
