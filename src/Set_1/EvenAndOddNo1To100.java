package Set_1;

public class EvenAndOddNo1To100 {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} 
		}
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			} 
		}
	}
}
