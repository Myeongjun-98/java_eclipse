package study0214;

import java.util.Arrays;
import java.util.Scanner;

public class study0214JavaTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};
		
		/*
		 문제 2
		 알파벳 문자 하나를 입력하세요.
		 입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요.
		 출력한 단어가 총 몇개인지 출력하세요. 
		 */
//		String StringWord;
//		StringWord = String.join("," , word);
		
//		System.out.print("문자열 입력 : ");
//		char alp = scan.next().charAt(0);
//		int idx = 0;
//		
//		for(int i = 0; i < word.length; i++) {
//			if(word[i].charAt(0) == alp) {
//				System.out.println(word[i]);
//				idx++;
//			}
//		System.out.println("찾아낸 단어 수 : " + idx);
//		}

		System.out.print("알파벳 입력 : ");
		char alp2 = scan.nextLine().toLowerCase().charAt(0);
		// 알파벳을 무조건 소문자로 변환
		
		int total = 0;
		
		for( String str : word) {
			if(str.charAt(0) == alp2) {
				System.out.println(str);
				total ++;
			}
		}System.out.println("총 단어 수 : " + total);
		

		
		
	}

}
