package Set_1;

public class PrintPrimeNumber1To100 {

	public static void main(String[] args) {
		int n = 100;
		int s;
		for (int i = 2; i < n; i++) {
			s = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					s = 1;
					break;
				}
			}
			if (s == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
