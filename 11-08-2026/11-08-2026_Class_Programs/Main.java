//Multilevel inheritance & Hierarchial
class Vehicle{
    static void start(){
        System.out.println("My car starting");
    }
    static void stop(){
        System.out.println("I am going to stop my vehicle");
    }
    static void run(){
        System.out.println("Car Running");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Car Constructor");
    }
    static void run(){
        System.out.println("I am driving");
    }
}


// class EvCar extends Car{
//     static void start(){
//         System.out.println("Ev Driving ");
//     }
// }
class Bike extends Vehicle{
    Bike(){
        super();
        System.out.println("I am in Bike Constructor");
    }
    static void gear(){
        System.out.println("Changing Gear");
    }
}


public class Main
{
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		
		
// 		EvCar ev = new EvCar();
		
	}
}
