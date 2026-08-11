//import java.util.*;
//class Student {
//	String name;
//	int age;
//	//constructor 1
//	Student(){
//		name = "Unknown";
//		age= 0;
//	}
//	//constructor 2
//	Student(String name){
//		this.name = name;
//		age = 0;
//	}
//	//consructor 3
//	Student(String name,int age){
//		this.name = name;
//		this.age = age;
//	}
//	void display() {
//		System.out.println("Name: "+name);
//		
//		System.out.println("Age: "+age);
//		System.out.println();
//	}
//	
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student("Dr");
//		Student s3 = new Student("Dinesh",19);
//		s1.display();
//		s2.display();
//		s3.display();
//	}
//}
import java.util.*;
class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		Student[] students = {
				new Student("Dr"),new Student("Raja"),new Student("Drr")
			
		};
		for(Student s:students) {
			System.out.println(s.name);
		}
	}
}
