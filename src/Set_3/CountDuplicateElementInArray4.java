package Set_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateElementInArray4 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 4, 2, 3, 4, 2 };

		Map<Integer, Integer> map = new LinkedHashMap<>();

		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i])+count);
			}
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " = " + map.get(key));
			}
		}
	}

}
