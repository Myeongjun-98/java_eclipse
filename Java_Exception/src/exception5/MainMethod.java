package exception5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// 오류 유무 상관없이 무조건 실행
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		int total = 0;
	
		try {
			System.out.print("현금 : ");
			money = scan.nextInt();
			total = money * 5;
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요.");
			e.printStackTrace();
		}finally {
			System.out.println("총 금액 : " + total);
		}	// 파일열기, 데이터베이스 연결에서는 반드시 파일을 닫고, 데이터베이스 연결을 해제하는것이 좋다.
		
		//////////////////////
		
		String fileName = "c://test//data.txt";	// 파일 지정
		
		// 자동 자원 반환 - 파일 열기와 같은 작업 시 사용한 컴퓨터 자원(메모리, 버퍼 등)을 반환해야한다.
		//		자동으로 반환까지 해주는 try-catch
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();
			System.out.println(line);
		} catch (Exception e) {
			System.out.println("파일 열고 읽기 오류");
			e.printStackTrace();
		}
		
		// 자동 자원 반환 이용 X시 FM
//		BufferedReader read = null;
//		try {
//			read = new BufferedReader(new FileReader(fileName));	// 파일 열기
//			String line = read.readLine();
//			System.out.println(line);
//			
//		} catch (Exception e) {
//			System.out.println("파일 열고 읽기 오류");
//			e.printStackTrace();
//		}finally {
//			try {
//				read.close();		// 파일을 꼭 닫아야 나중에 에러 안생김
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
