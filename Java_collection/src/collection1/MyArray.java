package collection1;

import javax.management.RuntimeErrorException;

public class MyArray {
	int[] arr;
	
	// 정수추가 메서드	(새로 만들고 주소를 덮어씌우는 방식)
	public void add(int num) {
		if(arr == null) {
			arr = new int[1];
		}else {
			int[] temp = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr=temp;
		}
		arr[arr.length-1] = num;
	}
	// 정수
	
	public int get(int i) {
		if(arr.length <= i) {
			throw new RuntimeException("인덱스범위 초과");
		}
		return arr[i];
	}
}
