package study0219;

public class ClassConstructor {

	public static void main(String[] args) {
		
		Food f1 = new Food("돈까스", 8000);
		// 기본생성자 메서드가 존재하기에 Food() 실행됨
		System.out.println(f1.foodName);
		
		Food f2 = new Food();
		
		/*	상품
			상품명, 브랜드, 수량
			
			상품을 등록하고자 하는데 필요한 클래스를 정의하고
			상품 정보 저장하기 위한 생성자메서드를 아래와 같이 구현
			- 기본 생성자 메서드
			- 상품명과 수량 초기화 가능한 생성자 메서드
			- 상품명, 브랜드, 수량 초기화 가능한 생성자메서드
		*/

		/*		메서드 **
			출력타입(반환타입)	메서드이름(매개변수){
				메서드 활용
			}
		
			int sum() {
				int num1 = 10;
				int num2 = 20;
				System.out.println(num1 + num2)
				이 경우는 매개변수가 필요없음. 메서드(함수) 내부에서 데이터를 만들어내니깐
			}
			int sum(int a, int b) {
				int num1 = a;
				int num2 = b;
				System.out.println(num1 + num2)
				이 경우는 매개변수 필요하니깐 매개변수 넣어줘야댐
				
				int x = 23; y = 2435;
				sum(x, y);
			}
			
		
		*/
		
	}

}
