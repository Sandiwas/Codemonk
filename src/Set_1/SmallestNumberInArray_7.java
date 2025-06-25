package Set_1;

public class SmallestNumberInArray_7 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1, 6, 7 };

		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Samllest number in array is "+smallest);
	}

}
