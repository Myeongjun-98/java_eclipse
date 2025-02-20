package study0220;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member user1 = new Member();
		user1.id = 1001;
		user1.userId = "sky";
		user1.passWord = "1234";
		
//		user1.output();
		Member user2 = new Member(new String("gold"),"5432",1002);
//		user2.output();
		System.out.println(user1);
		
		String word = new String("원래는 이렇게 사용한다");
		// String은 클래스라서..
		String word1 = "그렇지만 이렇게도 사용할 수 있다.";
		System.out.println(word.toString());
		// 객체라 문자열(이것도 간결화 된 것이긴 하지만..)화 해서 출력해야함
		
		
		
	}

}
