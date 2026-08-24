package day2408;
import java.util.*;
public class Javastack {
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	stack.add(10);
	stack.push(20);
	stack.push(30);
//	for(int s:stack) {
//		System.out.println(s);
//		
//	}
	Iterator s = stack.iterator();
	while(s.hasNext()) {
		System.out.print(stack.peek()+" ");
		stack.pop();
	}
	System.out.println(stack);
}
}
