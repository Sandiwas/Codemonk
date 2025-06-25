package Polymorphism;

public class TestOverloading1 {

	public static int add(int a, int b) {
		return a + b;
	}

	public static  int add(int a, int b, int c) {
		return a + b;
	}

	public static void main(String[] args) {
	
		
		System.out.println("add() with 2 parameter");
		
		System.out.println(add(4, 5));

		System.out.println("add() with 3 parameter");

		System.out.println(add(2, 4, 6));

	}

}
