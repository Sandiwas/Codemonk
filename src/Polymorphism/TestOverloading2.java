package Polymorphism;

class Animal1 {
}
class Monkey extends Animal1 {
}

public class TestOverloading2 {

	public void m1(Animal1 a) {
		System.out.println("Animal version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {

		TestOverloading2 t = new TestOverloading2();

		Animal1 a = new Animal1();
		t.m1(a);

		Monkey m = new Monkey();
		t.m1(m);

		Animal1 c = new Monkey();
		t.m1(c);
	}
}
