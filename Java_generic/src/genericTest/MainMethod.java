package genericTest;

public class MainMethod {

	public static void main(String[] args) {

		포스틱 과자1 = new 포스틱("포스틱", 1500);
		포스틱 과자1_1 = new 포스틱("포스틱", 1450);
		SnackBox<포스틱> 포스틱상자 = new SnackBox<>();
		
//		Snack 과자10 = new Snack("포스틱", 1666000);
//		SnackBox<Snack> 포스틱상자10 = new SnackBox<>();
//		포스틱상자10.makeBox(과자10);
//		 안그랬는데 Snack으로 했어도 됨;;;;
		
		
//		포스틱상자.makeBox(과자1);
//		포스틱상자.makeBox(과자1_1);
		포스틱상자.makeBox(과자1, 과자1_1);
		
		예감 과자2 = new 예감("예감", 2100);
		SnackBox<예감> 예감상자 = new SnackBox<>();
		예감상자.makeBox(과자2);
		
		매운새우깡 과자3 = new 매운새우깡("매운새우깡", 1300);
		매운새우깡 과자3_1 = new 매운새우깡("매운새우깡", 1250);
		SnackBox<매운새우깡> 매운새우깡상자 = new SnackBox<>();
//		매운새우깡상자.makeBox(과자3);
//		매운새우깡상자.makeBox(과자3_1);
		매운새우깡상자.makeBox(과자3, 과자3_1);
		
		/////////////////////////
		// 배열만들기
		Snack [] 과자배열 = new Snack[] {
				new 예감("예감", 1300), new 매운새우깡("매운새우깡", 1400), new 매운새우깡("매운새우깡", 1500)
		};
		
		SnackBox<Snack> 박스 = new SnackBox<>();
		박스.makeBox(과자배열[0]);
		SnackBox<Snack> 박스1 = new SnackBox<>();
		박스1.makeBox(과자배열[1]);
		SnackBox<Snack> 박스2 = new SnackBox<>();
		박스2.makeBox(과자배열[2]);
		////// 왜 SnackBox로는 배열을 못만들었는가?
		//	못함.. 못해서 안했음
		// 그래서 컬렉션을 배움.......!!!!!!!!
	}

}
