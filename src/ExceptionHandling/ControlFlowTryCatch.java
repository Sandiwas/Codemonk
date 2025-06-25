package ExceptionHandling;

public class ControlFlowTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println("Step 1");
			System.out.println(10/0);
			System.out.println("Step 3");
		} catch (ArithmeticException e) {
			System.out.println("Match");
		}
		System.out.println("Step 5");

	}
}
