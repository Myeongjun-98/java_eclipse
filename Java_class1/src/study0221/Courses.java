package study0221;

public class Courses {
	// 수강과목
	int cNo;	// 과목번호
	String cName;	// 과목이름
	int times;		// 시수
	int point;		//학점
	
	Courses(){};
	Courses(int cNo, String cName, int times){
		this.cNo = cNo;
		this.cName = cName;
		this.times = times;
		this.point = times;		// 시수에 따라 학점 부여?
	}
	
	public String toString() {
		return "과목번호 : " + this.cNo + ", 과목이름 : " + this.cName + ", 과목시수 : " + this.times + ", 학점 : " + this.point;
	}
	
	
	
	
}
