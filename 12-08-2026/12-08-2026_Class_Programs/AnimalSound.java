package day3java;
//Level 1 Easy 

abstract class Animal{
	//Concrete Method
	public void eat() {
		System.out.println("Animal eat those food");
	}
	
	public abstract void sound(); 
}
class Dog extends Animal{
	
	public void sound() {
		System.out.println("Dog Bark");
	}
	
}

class Cat extends Animal{
	public void sound() {
		System.out.println("Cat Meow");
	}
}

class Cow extends Animal{
	public void sound() {
		System.out.println("Cow Maaa...");
	}
}
public class AnimalSound {
	public static void main(String[] args) {
	Animal cat = new Cat();
	Animal dog = new Dog();
	Animal cow = new Cow();
	dog.eat();
	dog.sound();
	
	cat.eat();
	cat.sound();
	
	cow.eat();
	cow.sound();
	}
}
