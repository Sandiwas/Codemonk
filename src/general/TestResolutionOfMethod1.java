package general;

class Parent1 {
	void m1() {
		System.out.println("parent");
	}
}

class Child1 extends Parent1 {
	void m1() {
		System.out.println("child");

	}

}

public class TestResolutionOfMethod1 {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.m1();

		Child1 c = new Child1();
		c.m1();

		Parent1 p1 = new Child1();
		p1.m1();

	}

}
