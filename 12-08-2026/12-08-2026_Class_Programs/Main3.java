//Abstraction 
abstract class Demo{
	//abstract Method
	void display()//Marker Method
	{
		System.out.println("I am in Display");
	}
	
	//concrete Method 
	 void show(){
		System.out.println("I am in show..");
	}
	
}
public class Main3 extends Demo{
	void display() {
		System.out.println("I am in Main Class Display");
	}
	void show() {
		System.out.println("I am in Main show Display");
	}
	public static void main(String[] args) {
		Demo d = new Main3();
		d.display();
		d.show();
		
	}

}
