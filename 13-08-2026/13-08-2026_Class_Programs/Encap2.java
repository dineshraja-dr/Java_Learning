package day1308;


class Demo3{
	static int x = 10;
	int y = 20;
	
}
public class Encap2 extends Demo3 {
	public static void main(String[] args){
		
		Demo3 d = new Demo3();
		System.out.println("x = "+d.x);
		System.out.println("y = "+d.y);
		d.x = 100;
		d.y = 200;
		
		System.out.println("x = "+d.x);
		System.out.println("y = "+d.y);
		//After 
		Demo3 d1 = new Demo3();
		System.out.println("x = "+d.x);
		System.out.println("y = "+d.y);
		
	}

}
