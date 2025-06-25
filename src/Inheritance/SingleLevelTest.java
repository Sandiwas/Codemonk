package Inheritance; //single level

class One {
	public void print_geek() {
		System.out.println("Geek");
	}
}

class Two extends One {

	public void print_for() {
		System.out.println("for");
	}
}

public class SingleLevelTest {
	public static void main(String[] args) {
		Two t = new Two();
		t.print_geek();
		t.print_for();
		t.print_geek();
	}

}
