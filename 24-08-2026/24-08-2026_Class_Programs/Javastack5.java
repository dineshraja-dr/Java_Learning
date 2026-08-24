package day2408;
import java.util.*;
public class Javastack5 
{
	private static int precedence(char c) {
		switch(c) 
		{
		case '+' :case'-':return 1;
		case '*' :case'/':return 2;
		case '^' :return 3;
		}
		return -1;
	}
	private static boolean isOperator(char c) {
		return c == '+'||c=='-'||c=='*'||c=='/'||c=='^';
		
	}
	
	public static String infixToPostfix(String exp) 
	{
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(char c : exp.toCharArray())  //A+B*C -->[A,+,B,*,C]
		{
			if(Character.isLetterOrDigit(c)) {
				
				result.append(c);
				System.out.println(result);
			}
			else if(c == '(') {
				stack.push(c);
				System.out.println(result);
			}
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '('){
					result.append(stack.pop());
				}
				stack.pop();
				System.out.println("Restlt :"+result);
				System.out.println("Stack :"+stack);
				}
			else if(isOperator(c)) {
				while(!stack.isEmpty() && precedence(c) < precedence(stack.peek()))
				{
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			result.append(stack.pop());
		}
		return result.toString();
		
		
	}
	public static int evalutePostfix(String num){
		Stack<Integer> stack = new Stack<>();
		System.out.println("----PosFix Evalution----");
		for(char c : num.toCharArray())
		{
			if(Character.isDigit(c)) {
				stack.push(c-'0');
			}
			else {
				int b = stack.pop();
				int a = stack.pop();
				int result = 0;
				switch(c) 
				{
				case '+':result = a+b;break;
				case '-'	:result = a-b;break;
				case '*':result = a*b;break;
				case '/':result = a*b;break;
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String exp = "A+B12*C4";
		String str = infixToPostfix(exp);
		System.out.println(str);	
		
		String num = "23+5*"; //->(2+3)*5 --> 25
		int numStr = evalutePostfix(num);
		System.out.println("Postfix Evalution is + "+numStr);		
	}
}
