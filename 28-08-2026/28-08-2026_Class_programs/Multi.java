package day2808;
import java.util.*;
class Mythread1 implements Runnable{
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println("Runnable : "+i);
		}
	}
}

public class Multi {
	public static void main(String[] args) {
		Mythread1 runnable = new Mythread1();
		Thread t1  = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
	}
}
