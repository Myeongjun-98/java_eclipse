package interface1;

public class MainMethod {

	public static void main(String[] args) {
		
		김명준 준 = new 김명준();
		최예나 나 = new 최예나();
		
		준.moving();
		나.moving();
		
		Move 명준 = new 김명준();
		Move 예나 = new 최예나();
		명준.moving();
		// 명준.target();은 안됨;;; Move에 묶여서 moving()밖에 실행 못함
		
		Attack 명준1 = new 김명준();
		Attack 예나1 = new 최예나();
		
		명준1.target();
		
		Active new명준 = new 김명준();
		Active new예나 = new 최예나();
		new명준.moving();
		new명준.target();
		
		
	}

}
/*
	서로 다른 클래스를 다형성으로 표현하고자 한다면 인터페이스를 implements하면 된다.
	
	두 개 이상의 인터페이스를 연결구현 하는 경우에는 인터페이스가 서로 다르므로
	각각 인터페이스 타입으로 사용해야한다.
	
	그럼 다형성의 의미가 사라지기때문에 인터페이스들의 상속을 한다.
	
	클래스들의 관계가 상속관계를 이룰 수 없는 경우에 다형성으로 처리하고자 한다면
	인터페이스를 이용, 또는 상속관계로 다형성을 구현하고자할때에도 인터페이스를 사용 
	
	게시판 - 공략게시판
	게시판 - 자유게시판
	
	게시판 부모클래스에 - 게시글저장(save()); , 게시글보기(view());

	게시판 - 저장, 보기, 수정, 삭제		C R U D	 (Create, Read, Update, Delete)
	회원 - 저장, 보기, 수정, 삭제	(포함이나 상속이 아니지만 메서드가 비슷함)
	
	회원 - 가입(저장), 내정보(보기), 내 정보 변경(수정), 탈퇴(삭제)
				데이터베이스 동작이 필요하므로 CRUD동작이 하나의 타입으로 처리가 가능하도록 만드는 것
				
*/