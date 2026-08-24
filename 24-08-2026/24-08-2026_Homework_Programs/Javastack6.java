package day2408;
import java.util.*;
public class Javastack6 {
	public static void main(String[] args) {
		
		String[] str = new String[2];
		str[0] = "Dinesh";
		str[1] = "Raja";
		Stack<Character> stack = new Stack<>();
		String s = str[0];
		for(int i = 0;i < s.length();i++) {
			char ch = s.charAt(i);
			stack.push(ch);
		}
StringBuilder sb = new StringBuilder();
		
		Iterator su = stack.iterator();
		char ch1 = 0;
		while(su.hasNext()) {
			ch1 = stack.pop();
			sb.append(ch1);
		}
		System.out.println(sb.toString()+" "+str[1]);
	}
}
