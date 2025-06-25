package Set_3;

public class CountDuplicateElemntUsingForLoosps6 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 4, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}
