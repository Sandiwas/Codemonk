package Set_6;

public class LinearSerch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		
		boolean flag = false;
		int search_element = 50;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (search_element == arr[i]) {
				System.out.println("element found at " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Not found");
		}
	}
}