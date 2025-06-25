package Set_4;

import java.util.ArrayList;

public class RemoveDuplicateCharInStringUSingArrayList2 {
	public static void main(String[] args) {
		String str = "amam";
		System.out.println("Input string is " + str + " output String is " + removeDuplicateCharInString(str));
	}

	private static String removeDuplicateCharInString(String str) {
		char[] arr = str.toCharArray();
		
		ArrayList<Character> mySet = new ArrayList<>();
		
		for (char ch : arr) {
		if(!mySet.contains(ch)) {
			mySet.add(ch);
		}
		}
		StringBuffer sb = new StringBuffer();

		for (char ele : mySet) {
			sb.append(ele);
		}
		return sb.toString();
	}
}
