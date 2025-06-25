package Set_1;

import java.util.ArrayList;

public class EvenAndODdNumber_5 {

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

		System.out.print("Even number are : ");
		for (int no : even) {
			System.out.print(no + " ");
		}
		System.out.println();
		System.out.print("Odd number are : ");
		for (int no : odd) {
			System.out.print(no + " ");
		}
	}

}
