package oppsAbstract;


//1. Example of Abstract Class that has Abstract method
//Below is the implementation of the above topic:

abstract class Sunstar {
	 public abstract void printInfo();
}

class Empolyee extends Sunstar {
	public void printInfo() {
		String name = "Sachin";
		int age = 23;
		float salary = 22.2f;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
	}
}

public class Test {
	public static void main(String[] args) {
		Sunstar a = new Empolyee();
		a.printInfo();

	}
}
