package day1308;
//Constructor using to  the Encapsulation

class Student1{
	private String name;
	private int age;
	//setter for name
	Student1(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
}
public class EncapConstructor{
	public static void main(String[] args){
		
		Student1 s = new Student1("Dinesh",19);
		
		
	}

}
