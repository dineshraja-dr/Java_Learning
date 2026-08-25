package day2508;
import java.util.*;
public class Queue1 {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
	    queue.add(10);
	    queue.offer(20);
	    queue.offer(30);
	    queue.offer(40);
//	    System.out.println(queue);
//	    queue.offer(55);
//	    queue.remove();
//	    queue.poll();
//	    System.out.println(queue);
//	    System.out.println(queue.poll());
//	    System.out.println(queue);
//	    
//	    System.out.println(queue.peek());
//	    System.out.println(queue.remove(55));
//	    System.out.println(queue.poll());
//	    System.out.println(queue);
	    System.out.println(queue.poll());
		
	}
}
