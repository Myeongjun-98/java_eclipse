package study0218;

import java.util.Scanner;

public class ClassArray {

	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
//		Member member = new Member();
//		member.name = "김유신";
//		member.job = "군인";
//		member.age = 38;
		
		Member[] members = new Member[5];
		// 5명의 정보 저장 가능은 한데 아직...
//		members[0].name = "박문수";
//		System.out.println(members[0].name);
//		이거 오류임
		
//		그래서 공간 확보먼저 해야함
		
//		for(int i = 0; i < members.length; i++)
//			members[i] = new Member();
//		
//		members[0].name = "박문수";
//		System.out.println(members[0].name);
//		members[0].job="감찰관";
//		members[0].age=34;
//		members[1].name="이순신";
//		members[1].job="군인";
//		members[1].age=31;
//		members[2].name="문익점";
//		members[2].job="산업스파이";
//		members[2].age=45;
		
//		
//		for(int i = 0; i < members.length; i++) {
//			System.out.println(members[i].name);
//			System.out.println(members[i].age);
//			System.out.println(members[i].job);
//		}
			
//		Member info = new Member();
		
//		/*
//			class타입으로 변수지정 후 출력해보기		
		
		
//		  영화제목, 장르, 관객수, 개봉년도
//		 */
//		
//		MovieInfo movieInfo = new MovieInfo();
//		
//		movieInfo.title = "재밌는영화";
//		movieInfo.genre = "코미디";
//		movieInfo.viewCount = 100000000;
//		movieInfo.revealday = 2025;
//		
//			System.out.print(movieInfo.title + " ");
//			System.out.print(movieInfo.genre + " ");
//			System.out.print(movieInfo.viewCount + " ");
//			System.out.print(movieInfo.revealday + " ");
		
		
//		System.out.println(info);	
//		System.out.println(info.name);
//		
//		Member m1 = new Member();
//		System.out.println(m1.name);
		
		Member info = new Member();
				System.out.println(info.job);
		
		Member info1 = new Member(20, "군인", "김유신");	 		// 클래스에 지정된 대로 순서 지켜야함(age, job)
			System.out.println(info1.age + info1.job);
	
	
	
	
	
	}
	
}
