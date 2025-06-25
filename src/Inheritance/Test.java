package Inheritance;

//Base class or super class
class Employee {
	int salary = 60000;
}

// SubClass or Inherited class
class Engineer extends Employee {
	int benifits = 10000;
}

//Driver Class
public class Test {

	public static void main(String[] args) {
		Engineer e = new Engineer();

		System.out.println("Salary : " + e.salary + "\nBenifits : " + e.benifits);
	}

}
