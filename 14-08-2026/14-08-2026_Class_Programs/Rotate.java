package day1408;

import java.util.*;
public class Rotate
{
	public static void main(String[] args) {
	    
		List<Integer> num = new ArrayList<>();
//		num.add(10);
//		num.add(20);
//		num.add(30);
//		num.add(40);
//		num.add(50);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		for(int i = 0;i<n;i++) {
			m = sc.nextInt();
			num.add(m);
		}
		System.out.println("Before Rotate :"+num);
		//Normal Method
//		int k=2;
//		for(int i=0;i<k;i++)
//		{
//			int last = num.remove(num.size()-1);
//		    num.add(0,last);
//		}
//		System.out.println("Rotated list : "+ num);
	Collections.rotate(num,-2);
		System.out.println("Right Rotate"+num);
		
		
		sc.close();
	}
}