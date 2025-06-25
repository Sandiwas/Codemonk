package Set_1;

public class FibonacciSeries_4 {
	public static void main(String[] args) {
		int n = 10;
		int first = 0;
		int second = 1;
		int third;
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");
			third = first + second;
			first = second;
			second = third;
		}
	}
}
