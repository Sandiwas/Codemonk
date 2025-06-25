package Inheritance;

class A {
	public void printA() {
		System.out.println(" Class A");
	}
}

class B extends A {
	public void printB() {
		System.out.println(" Class B");
	}
}

class C extends A {
	public void printC() {
		System.out.println(" Class C");
	}
}

class D extends A {
	public void printD() {
		System.out.println(" Class D");
	}
}

public class TestHirarchical {

	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();

		b.printA();
		b.printB();
		c.printA();
		c.printC();
		d.printA();
		d.printD();
	}

}
