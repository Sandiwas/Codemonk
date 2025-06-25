package Set_4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString1 {

	public static void main(String[] args) {
		String str = "Programming";
		System.out.println("Input string is " + str + " output String is " + removeDuplicateChar(str));

	}

	private static String removeDuplicateChar(String str) {

		char[] arr = str.toCharArray();

		Set<Character> mySet = new LinkedHashSet<>();
		for (char ch : arr) {
			mySet.add(ch);
		}
		StringBuffer sb = new StringBuffer();
		for (char ch : mySet) {
			sb.append(ch);
		}
		return sb.toString();
	}

}
