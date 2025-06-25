package Inheritance;

class Solarsystem {

}

class Earth extends Solarsystem {
}

class Marsh extends Solarsystem {

}

class Moon extends Earth {

}

public class TestHybrid {

	public static void main(String[] args) {
		Solarsystem s = new Solarsystem();
		Earth e = new Earth();
		Marsh m = new Marsh();

		System.out.println(s instanceof Solarsystem);
		System.out.println(e instanceof Earth);
		System.out.println(m instanceof Marsh);

	}

}
