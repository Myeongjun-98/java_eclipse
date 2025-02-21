package study0221;

public class JavaMethod3 {

	
	static void findSubject(Courses[] a){
		for(int i = 0; i < a.length; i++) {
			if(a[i].point == 2) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
	
		// 학점이 2학점인 과목을 찾아라!
		Courses[] course = new Courses[] {
				new Courses(1, "정보사회와 컴퓨터", 3),
				new Courses(2, "데이터베이스", 3),
				new Courses(3, "자료구조", 3),
				new Courses(4, "Java", 3),
				new Courses(5, "html	", 2)
		};
		
		findSubject(course);
		
		
		
		
	}

}

/*	메서드 정의를 위한 메서드 원형작성법
 	1. 메서드를 왜 만들어야하지?
 		- 메서드 만들어서 어디에 사용하려고?
 		- 메서드 만들어서 뭐 하려고?
 		- 메서드 안 만들면 코드가 복잡해지나?
 		- 반복문으로 충분히 표현히 안되나?
 		
 	2. 메서드를 구현하면 내가 편하다!
 		- 처음에는 하나하나 메서드를 만들어야해서 시간이 걸리이만
 		- 이후에는 이전에 만든 메서드를 사용 가능해서 시간이 단축된다
 		- 그래서 메서드도 설계를 따로 해주기는 한다.

	3. 메서드에 필요한것을 제공 (매개변수)
		- 여러개의 메서드는 서로 협력하여 일을 진행한다
		- 물양동이를 혼자서 200m 걸어가 옮기는것보다
		- 여러명이 한 줄로 서서 전달해서 옮기면 개개인이 덜 힘들다
		- 최종 목적지까지 도달하기 위해 다음 사람에게 필요한 것(양동이 - 매개변수)을 전달해준다.
		
	4. 다음 할 일을 하기 위해 필요한 요소 돌려받기(반환 - return)
		- 물을 담아서 양동이를 전달하였다면 계속 일을 하기 위해
		- 빈 양동이를 다시 받아와야 한다.
		- 매개변수가 정방향으로 데이터를 제공하는 방법이라면
		- 반환(return)은 역방향으로 데이터를 제공하는 방법이다.
*/
