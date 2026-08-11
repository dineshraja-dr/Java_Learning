class A{
    static {
        System.out.println("I am in Static");
    }
    static void display(){
        System.out.println("I am in static show");
    }
    void show(){
        System.out.println("I am not in static");
    }
}

public class Main2
{
	public static void main(String[] args) {
		A a = new A();
		a.show();
		a.display();
		System.out.println("Hello World");
	}
}