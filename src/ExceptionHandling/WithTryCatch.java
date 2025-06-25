package ExceptionHandling;

public class WithTryCatch {
	public static void main(String[] args) {
		System.out.println("Start");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {

			System.out.println(10 / 2);

		}
		System.out.println("Stop");
	}
}
