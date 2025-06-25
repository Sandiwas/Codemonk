package Set_1;

public class AmstrongNumber11 {

	public static void main(String[] args) {
		int n = 153;
		int a;
		int c = 0;
		int temp = n;

		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);

		}
		if (temp == c) {
			System.out.println("Given number is armstrong number ");
		} else {
			System.out.println("Given number is not palindrome number ");
		}
	}

}
