import java.util.*;
class Employee {
	String name;
	int salary;
	int single;
	Employee(String name,int salary,int single){
		this.name = name;
		this.salary = salary;
		this.single=single;
		
		
	}
	public static void main(String[] args) {
		Employee[] employees= {
				new Employee("Dr",35000,1),new Employee("Guru",455,0),new Employee("Raja",400,1)};
	for(Employee e : employees) {
		System.out.print("Employee Name "+e.name+" Salary "+e.salary+" ");
		if(e.single == 1) {
			System.out.println("He is Single ");
		}
		else {
			System.out.println("He is commited");
		}
	}
	System.out.println();
	
	System.out.println(employees.length);
	}
	
	
	}

