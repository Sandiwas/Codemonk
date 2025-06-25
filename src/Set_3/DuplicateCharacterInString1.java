package Set_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacterInString1 {

	public static void main(String[] args) {
		
		String str = "Programming";

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + count);
			}
		}

		for (char key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " = " + map.get(key));
			}
		}

	}

}

//T T = T
//T F = F
//F T = F
//F F = T
