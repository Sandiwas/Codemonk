package oppsAbstract;

//2. Abstract Class having constructor, data member, and methods
//Elements abstract class can have
//
//data member
//abstract method
//method body (non-abstract method)
//constructor
//main() method.
//Below is the implementation of the above topic:

abstract class Subject {
	
	public Subject() {
		System.out.println("Lerning subject");
	}
	abstract public void syllbus();
	
	public void lern() {
		System.out.println("Preparing right now");
	}
}

class IT extends Subject  {
	public void syllbus() {
	System.out.println("c,c++,java");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Subject a = new IT();
		a.syllbus();
		a.lern();

	}
}
