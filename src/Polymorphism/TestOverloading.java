package Polymorphism;

public class TestOverloading {

	public  int add(int a, int b) {
		return a + b;
	}

	public  int add(int a, int b, int c) {
		return a + b+c;
	}

	public static void main(String[] args) {
		TestOverloading t=new TestOverloading();
		
		System.out.println("add() with 2 parameter");
		
		System.out.println(t.add(4, 4));

		System.out.println("add() with 3 parameter");

		System.out.println(t.add(2, 3, 4));

	}

}
