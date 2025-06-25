package oppsInterface;

interface Base {
	int a = 10;  //by default public static final
    void display(); // public abstract
}

interface Base1 extends Base {
	int a = 10;
	void display();
}

class TestClass implements Base1 {
	public void display() {
		System.out.println("Geek");
	}

	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);

	}

}
