package study0210;

public class study0210Hw중복구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberNumber;
		
		int [] arr = new int[15];			// arr변수를 길이 15의 배열로 선언
		for (int i = 0; i < arr.length; i++) {
			boolean isBeen = true;		// 기본값 false로 하고 if문 ==로 수정,  isBeen = true로 하면 쉬울거같은데 오류나서 안됨;;
			
			do {
				int number = ((int)(Math.random() * 25 + 1)) * 2;		// 1~50 중 무작위 짝수
				
				for(int k = 0; k <= i; k++) {
					if(arr[k] != number)
						isBeen = false;
				}
				
				arr[i] = number;
			}while(isBeen);

		}
		
		for(int i = 0; i < arr.length; i++) {		// arr의 각 index값 출력
			System.out.println(arr[i]);
		}
		System.out.println("");

	
	}
}
