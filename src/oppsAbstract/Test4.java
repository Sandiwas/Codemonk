package oppsAbstract;
//Observation 6

//Similar to the interface we can define static methods in an abstract class that can be called independently without an object. 

//Class 1
//Abstract class
abstract class Helper {

	// Abstract method
	public static void demofun() {

		System.out.println("Geeks for Geeks");
	}
}
//Class 2
//Main class extending Helper class
public class Test4 extends Helper {

	// Main driver method
	public static void main(String[] args) {

		// Calling method inside main()
		// as defined in above class
		
		Helper.demofun();
	}
}
