package Set_1;

public class PalindromNumber12 {

	public static void main(String[] args) {
		int num = 121;
		int remainder = 0;
		int reverse = 0;
		int sum = 0;
		int temp = num;
		
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
			sum = sum + remainder;
		}
		if(temp == reverse) {
			System.out.println("Given number is palindrome number");
		}else {
			System.out.println("Given number is not palindrome number");
		}
	}
}
