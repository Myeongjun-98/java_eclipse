package study0117;

public class Study0117 {

	public static void main(String[] args) {

		int num = 20;
		float pi = 3.14f;

		pi = num; // 자동 형변환
		// num = pi; 는 성립 안됨; 실수 범위를 정수 범위에 넣을 수 없으니까 but,
		num = (int) pi; // 강제 형변환 , 일시적03

		// 과제

		int 일년 = 365;
		int 흡연기간 = 20;
		int 하루담배 = 5; // 하루에 5개피씩 매일 흡연
		int 한개피단축 = 2;

		int 단축수명 = 하루담배 * 한개피단축 * 일년 * 흡연기간;
		int 단축수명시간 = 단축수명 * 60;
		int 단축수명일 = 단축수명시간 / 24;

		System.out.println("총 단축시간(분) : " + 단축수명);
		System.out.println("총 단축시간(시간) : " + 단축수명시간);
		System.out.println("총 단축시간(일)  : " + 단축수명일);

	}

}
