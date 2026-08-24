package day2408;
import java.util.*;
public class Javastack2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack();
		int web = sc.nextInt();
		for(int i = 0;i<web;i++) {
			stack.push(sc.next());
		}
		String c = stack.get(0);
		System.out.println(c);
		Iterator s = stack.iterator();
		while(s.hasNext()) {
			System.out.println(stack.pop()+" ");
			System.out.println("|");
			System.out.println("V");
		}
		sc.close();
	}
}
