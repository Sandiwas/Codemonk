package Set_1;

import java.util.ArrayList;

public class EvenAndOddNumberSizeAddition_6 {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1, 6, 7 };

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		System.out.print("Even number are ");
		for (int no : even) {
			sum1 = sum1 + no;
			System.out.print(no + " ");
		}
		System.out.println();
		System.out.println("Sum of all even number in array are " + sum1);
		System.out.println("Total number of even number in array is " + even.size());

		System.out.print("odd number in array is ");

		for (int no : odd) {
			sum2 = sum2 + no;
			System.out.print(no +" ");
		}
		System.out.println();
		System.out.println("Sum of all Odd number in array are  " + sum2);
		System.out.println("Total number of odd number in array is  " + odd.size());
	}

}
