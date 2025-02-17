package study0214;

public class study0214JavaString3_1 {

	public static void main(String[] args) {
		
		// 학과명, 조교, 전화, 위치
		String[][] dept = new String[4][];		// 첫 번째 크기는 정해야하는데 두 번째 배열의 크기는 비워둘 수 있음
		dept[0] = new String[]{"컴퓨터공학과","정보과학과","정보통신공학과","정보산업공학과","전자공학과","문헌정보학과","전기공학과"};
		dept[1] = new String[] {"이지은","김영미","박순애","이춘애","이미선","김기범","박준용" };
		dept[2] = new String[] {"3333","3334","3335","3336","3337","3338","3339"};
		dept[3] = new String[] {"T101","T201","T301","T401","T501","T601","T701"};
		
		// 정보통신공학과의 과사무실 위치와 조교 이름은?
		String search = "정보통신공학과";
		int idx = -1;
		for(int k = 0; k < dept[0].length; k++) {
				if(dept[0][k].equals(search)) {
					idx = k; break;
			}
		}
		if(idx == -1) {//만약 학과가 존재하지 않으면
			System.out.println("등록되지 않은 학과입니다.");
			return; // return은 메서드를 종료시킨다. main메서드 종료되면 프로그램 끝
		}
		System.out.println("조교 : " + dept[1][idx] + " , 사무실 : " + dept[3][idx]);
		
		
		
	}

}
