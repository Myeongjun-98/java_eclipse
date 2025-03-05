package generic2;

public class Alcohol {
	protected String name;		// 술 이름
	protected String cmp;		//	회사명
	protected int abv;				// 도수
	
	protected Alcohol(String name, String cmp, int abv) {
		this.name = name;
		this.cmp = cmp;
		this.abv = abv;
	}
	
	public void aa() {
		System.out.println("나는소주당");
	}
	
	
}
/*
	제네릭 타입의 제한
		T extends 부모클래스명		->	부모와 자식만 가능
		T super 클래스명	->	해당 클래스와 클래스의 부모만 가능
	
	?
		
		
*/