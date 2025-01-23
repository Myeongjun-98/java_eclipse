package study0122;

import java.util.Scanner;

public class study0122_1 {

	public static void main(String[] args) {
		// 증감 연산자			++, --
		int a = 10, b = 10 , result =0;
		// ++
		System.out.println("++ 전 : " + a);
		a++;
		System.out.println("++ 후 : " + a);
		++a;
		System.out.println("++ a : " + a);
		
		// 증감연산자의 위치가 변수 앞, 변수 뒤에 위치했을 때 각각의 차이 :
		a = 10;
		b = 10;
		result = a++;
		System.out.println(" result = a++ :" + result);
		result = ++b;
		System.out.println(" result = ++b :" + result);
		
//		r= a++;
//		r = a;
//		a = a+1;
//		
//		r = ++b;
//		b = b+1;
//		r = b;
//                        	=>  우선순위 때문에 다른 값이 나옴		
//						 	=>  증감연산자가 변수 뒤에 붙으면 우선순위가 낮지만, 변수 앞에 붙으면 우선순위가 높아져서
//							=>  n++ => 나중증가, ++n => 우선증가
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
