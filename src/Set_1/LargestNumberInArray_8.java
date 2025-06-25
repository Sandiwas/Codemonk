package Set_1;

public class LargestNumberInArray_8 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1, 6, 7 };
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest number in array is "+largest);
	}

}
