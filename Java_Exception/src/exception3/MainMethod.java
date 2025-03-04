package exception3;

public class MainMethod {

	public static void main(String[] args) {
		
		int[] arr = {10, 40, 50, 20};
		
		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println("인덱스 문제있음");
			System.out.println(e.getMessage());
		}
		
		String str = "123ab";
		// 문자열 => 정수변환하는 메서드
		int num = 0;
		
		try {
			num = Integer.parseInt(str);
		} catch (Exception e) {
		System.out.println("문자랑 숫자랑 겹쳐쓰지 마세요라");
		System.out.println(e.getMessage());
		}
		System.out.println("정수 : " + num);
		
		String word = "good Bye!!";
		
		try {
			System.out.println(word.substring(word.indexOf("B")));
		} catch (Exception e) {
			System.out.println("혹시 안들어갔을수도 있으니까 예외처리할게 그게 맞잖아 아니 진짜로 그럴수도있잖아 있다고 보장할 수 있냐고");
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(word.substring(word.indexOf("m")));
		} catch (Exception e) {
			System.out.println("없는문자 찾지 마세요라");
			System.out.println(e.getMessage());
		}
		
	}

}
