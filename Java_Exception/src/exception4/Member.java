package exception4;

public class Member {
	private String name;
	private int age;
	
	public Member() {	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void nameCount() {
		
		if(name == null) {
			throw new NullPointerException("이름 입력안함");
			// 예외 발생시키기 - throw
		}
		
		if(name.length() == 2) {
			System.out.println("이름이 외자다.");
		}else if(name.length() == 4) {
			System.out.println("이름이 3자이다.");
		}else if(name.length() == 3) {
			System.out.println("이름이 2자이다.");
		}
		
	}

	public int getBirthYear() throws NullPointerException {
		if(age == 0) {	// 나이 입력 안한 경우
			throw new NullPointerException("나이 입력안함");
		}
		return 2025 - age;
	}







}
