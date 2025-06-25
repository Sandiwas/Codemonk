package Set_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountDuplicateElementUsingSet5 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 4, 2, 3, 4, 2 };

		Set<Integer> myset = new LinkedHashSet<>();
		for (int ele : arr) {
			if(!myset.add(ele)) {
				System.out.print(ele+" ");
			}
		}

	}
}
