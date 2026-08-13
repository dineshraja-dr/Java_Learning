package day1308;


class Student{
	private String name;
	private int age;
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//getter for name
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//getter for name
	public int getAge() {
		return age;
	}
	
}
public class Encap{
	public static void main(String[] args){
		
		Student s = new Student();
		s.setName("Dinesh");
		s.setAge(19);
		System.out.println("Name : "+s.getName());
		System.out.println("Age : "+s.getAge());
	}

}
