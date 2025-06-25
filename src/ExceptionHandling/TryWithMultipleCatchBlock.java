package ExceptionHandling;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(10 / 2);
			System.out.println("first");
		} catch (Exception e) {
			System.out.println(10 / 2);
			System.out.println("Second");

		}
	}

}
//Order of catch block is important child first after  parent //CE
//we can't declare two catch block with same exception //CE