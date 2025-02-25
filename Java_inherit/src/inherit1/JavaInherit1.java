package inherit1;

public class JavaInherit1 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.onOff = true;	// 전원 On
		tv.brand = "삼성";
		tv.price = 1200000;
		tv.name = "OLED ST60";
				
				
		Computer com = new Computer()	;
		com.onOff = true;
		
		Aircon aircon = new Aircon();
		aircon.onOff = true;
		
		tv.power();
		tv.power();
		aircon.power();
		aircon.power();
		com.power();
		com.power();
		
	}

}

/*	
 	상속 : 	클래스들의 관계를 부모-자식 관계로 설정한다.
 		
 		부모클래스의 변수 또는 메서드를 자식 클래스에서 사용가능하다.
 		여러 클래스들의 공통요소를 부모클래스로 구성한다.
 		예) TV, 컴퓨터, 냉장고, 에어컨
 			전기(파워), 플러그, 가격, 브랜드 등등...
			가전제품 부모클래스에 파워, 가격, 브랜드를 정의한다.


		상속을 하는 이유 1 : 한꺼번에 처리
		-------------------------------------------------------------------
			CSS에서 글자색을 red로 설정한다.
			<div id = "a">
				<div class = "b"></div>
				<ul class = "c"></ul>
				<p class = "d"><p>
			</div>
			.b { color : red; }	.c { color : red; }  .d { color : red; }
											↓
			#a { color : red; }
		-------------------------------------------------------------------
		이유 2 : 다형성 - 다양한 형태
			TV t = new TV();
			Computer com = new Computer();
			 					↓
			 가전제품 tv = new TV();
			 가전제품 com = new Computer();
			 
			 
			 
			 
			 
			 
*/