package Inheritance; //single level

class One1 {
	public void print_geek() {
		System.out.println("Geek");
	}
}

class Two1 extends One1 {

	public void print_for() {
		System.out.println("for");
	}
}

class Three extends Two1 {

	public void print_LastGeeks() {
		System.out.println("LastGeeks");
	}
}

public class MultiLevelTest {
	public static void main(String[] args) {
		Three t = new Three();
		t.print_geek();
		t.print_for();
		t.print_LastGeeks();
	}

}
