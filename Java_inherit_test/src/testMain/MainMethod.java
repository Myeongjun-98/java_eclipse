package testMain;

public class MainMethod {
/*
	원, 사각형, 삼각형 도형을 그릴것이다.
	그리고자 하는 도형의 크기를 지정하여 draw메서드로 그리기 수행할것이다.
	
	상속 관계로 알맞은 클래스들을 정의하여 원, 사각형, 삼각형이 그려질 수 있도록 하세요.
	
	* draw메서드의 내용은 다음과 같이
		원클래스의 객체로 draw를 실행한다면
			System.out.println("지름이 " + width + "인 원을 그린다.")
 */
	public static void main(String[] args) {
		
		Circle circle = new Circle(3);
		Rectangle rectangle = new Rectangle(4, 2);
		Triangle triangle = new Triangle(7, 11);
		
		circle.draw();
		triangle.draw();
		rectangle.draw();
/*
		결제 방법 : 체크카드, 신용카드, 현금결제, 계좌이체
		
		상속관계로 부모클래스와 자식클래스를 정의하세요
		
		결제방법의 공통은 금액, 결제일
			기능은 결제 처리 (processPay)메서드
			*processPay 메서드 실행 시 
			*	=> 체크카드결제 금액 : 45000원 결제일 2025.02.01
*/
		Cash cash = new Cash(10000, "2025.02.11");
		cash.processPay();
		CheckCard checkcard = new CheckCard(14900, "2025.02.21");
		checkcard.processPay();
		CreditCard creditcard = new CreditCard(2495000, "2025.02.22");
		creditcard.processPay();
		AccountTransfer accountTransfer = new AccountTransfer(13500,"2025.02.26");
		accountTransfer.processPay();
		
		
	}

}
