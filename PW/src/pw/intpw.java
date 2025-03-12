package pw;

public class intpw {

	public static void main(String[] args) {
		
		int test = 642;
		
		
		// 2진수화, 10진수화 메서드
//		String binary = Integer.toBinaryString(test);
//		System.out.println(binary);
//		
//		int a = Integer.parseInt(binary, 2);
//		System.out.println(a);
//		
		String testtest = Integer.toBinaryString(test);
		int random = (int)(Math.random()*4+4);
		String randomBinary = Integer.toBinaryString(random);
		System.out.println("만들어진 랜덤 수" + randomBinary);
		
		String madePw =testtest + randomBinary;
		System.out.println(madePw);
		
		int completePw = Integer.parseInt(madePw, 2);
		System.out.println(completePw);
		
		
	}

}
