package day2408;
import java.util.*;
public class Javastack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<n;i++) {
			String s = arr[i];
			for(int j = 0;j<s.length();j++) {
				char ch = s.charAt(j);
				stack.push(ch);
			}
			
			
		}
		System.out.println("Pushed Elements in Stack "+stack);
		StringBuilder sb = new StringBuilder();
		
		Iterator s = stack.iterator();
		char ch1 = 0;
		while(s.hasNext()) {
			ch1 = stack.pop();
			sb.append(ch1);
		}
		System.out.println("This elements to poped from stack"+sb.toString());
		System.out.println(sb.reverse().toString());
	
		
	}
}
