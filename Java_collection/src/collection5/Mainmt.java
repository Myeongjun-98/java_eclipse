package collection5;

import java.util.LinkedList;
import java.util.Queue;

public class Mainmt {
	public static void main(String[] args) {
		
		// FIFO(First In First Out) 구조
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(100);
		queue.offer(20);
		queue.offer(343);
		
		System.out.println(queue);
		// 큐에서 내보내기 - 먼저 들어온 순서
		queue.poll();
		System.out.println(queue);
		
		
		
		
		
		
		
		
	}
}
