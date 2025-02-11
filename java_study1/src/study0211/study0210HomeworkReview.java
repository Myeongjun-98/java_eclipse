package study0211;

public class study0210HomeworkReview {

	public static void main(String[] args) {

		// 해설

		int[] num = new int[15];

		int idx = 0;
		while (true) {
			int temp = (int) (Math.random() * 50 + 1);
			if (temp % 2 == 0) { // 2(나머지)나누기 했을 때 나머지가 0이면 짝수
				boolean isSame = false;		// 같으면 true, 같지 않으면 false
				for ( int i = 0; i < idx; i++) {
					if(num[i] == temp) {
						isSame = true;
					}
				}
				num[idx++] = temp;

			}
			if (idx == num.length)
				break;

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
