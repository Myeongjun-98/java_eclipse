package exception2;

public class MainMethod {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4};
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗엉났슴니당");
			e.printStackTrace();		// 에러메세지 출력, 개발 후엔 제거해야 좋은 코든
		}
		
		try {
			String name = null;
			if( name != null || name.equals("이순신")) {
				System.out.println("이순신제독이시다");
			}else {
				System.out.println("아님");
			}
		}catch(Exception e) {
			System.out.println("공란이라 그럼;;;");
			e.printStackTrace();
			System.out.println(e.getMessage()); 	// 또 다른 예외처리
		}
			
		
		
	}

}
