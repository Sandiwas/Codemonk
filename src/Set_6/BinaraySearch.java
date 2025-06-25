package Set_6;

public class BinaraySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		boolean flag = false;
		int key = 60;
		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
		
			int m = (l + h) / 2;

			if (key == arr[m]) {
				System.out.println("Element Found ");
				flag = true;
				break;
			}
				if (key > arr[m]) {
					l = m + 1;
				}
				
				if (key < arr[m]) {
					h = m - 1;
				}
			}
			if (flag == false) {
				System.out.println("Not Found");
			}
		}

	}
