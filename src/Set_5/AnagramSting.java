package Set_5;

import java.util.Arrays;

public class AnagramSting {

	public static void main(String[] args) {
		String str1 = "army";
		String str2 = "mary";

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram Sting ");
		} else {
			System.out.println("Not Anagram Sting");
		}
	}

}
