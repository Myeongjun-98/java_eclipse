package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		/*	
		job 클래스를 이용해 익명클래스 다루기
		익명클래스 객체를 통해 직업을 입력하고
		myJob메서드 실행하여 내 직업을 출력
		
		Work 인페이스를 이용해 익명클래스 다루기
		working메서드를 실행하여
		내가 하는 일 출력하기
		*/

		Job job = new Job() {
			@Override
			public void myJob() {
				System.out.println(JobName);
			}
		};	// 익명클래스 정의와 객체생성
		job.JobName = "학생";
		job.myJob();
		
		Work work = new Work() {
			@Override
			public void working() {
				System.out.println("공부중");
			}
		};
	
		work.working();
	}

}
