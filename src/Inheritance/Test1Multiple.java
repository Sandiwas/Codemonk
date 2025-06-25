package Inheritance;

interface oneclass {
	public void PrintGeeks();
}

interface Twoclass {
	public void Printfor();
}

interface Threeclass extends oneclass, Twoclass {

}

class Child implements Threeclass {

	@Override
	public void Printfor() {
		System.out.println("for");
	}

	@Override
	public void PrintGeeks() {
		System.out.println("Geeks");
	}

}

public class Test1Multiple {

	public static void main(String[] args) {
		Child e = new Child();
		e.PrintGeeks();
		e.Printfor();
		e.PrintGeeks();
	}
}