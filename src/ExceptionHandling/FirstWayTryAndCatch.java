package ExceptionHandling;

public class FirstWayTryAndCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Start");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Match");

		}
		System.out.println("Stop");

	}

}
