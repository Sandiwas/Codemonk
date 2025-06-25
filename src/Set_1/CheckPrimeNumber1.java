package Set_1;

public class CheckPrimeNumber1 {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		if (isPrime(3)) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}
	}
}
