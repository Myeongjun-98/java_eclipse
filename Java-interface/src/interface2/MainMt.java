package interface2;

public class MainMt {

	public static void main(String[] args) {
		/*
		 떡볶이, 카페 클래스
		 
		 store 인터페이스
		 	->	메서드 : cooking();
		 	
		 	각 클래스 객체 생성하여 cooking메서드를 실행시켜 떡볶이를 만들었다. 제주그린티라떼를 만들었다라고 출력하시오.
		*/
		
		Store 음식주문 = new DdeokBoKki();
		Store 음료주문 = new Cafe();
		
		음식주문.cooking();
		음료주문.cooking();
		
		
	}

}
