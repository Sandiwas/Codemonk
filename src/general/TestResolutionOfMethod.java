package general;

class Parent {
	void m1() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	void m2() {
		System.out.println("child");

	}

}

public class TestResolutionOfMethod {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();

		Child c = new Child();
		c.m1();
		c.m2();
		
		Parent p1 = new Child();
		p1.m1();
	}

}
