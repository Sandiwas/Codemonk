package Polymorphism;

class Animal {
	public void eat() {
		//System.out.println("eat() method of base  class");
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal {
	public void eat() {
	//	System.out.println("eat() method of derived class");
		System.out.println("Dog is eating...");

	}

	public void eatAnimal() {
		super.eat();
	}
}

public class TestOverrding {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal a = new Animal();

		// call the eat method of Dog Class
		d.eat();

		// call the eat method of Animal
		a.eat();

		Animal a1 = new Dog();

		// Polymorphism : a1 reference pointing to the dog object
		a1.eat();

		// To call the base class method , you need to use a dog Reference
		d.eatAnimal();
	}

}
