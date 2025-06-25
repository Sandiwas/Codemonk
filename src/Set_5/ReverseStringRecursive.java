package Set_5;

public class ReverseStringRecursive {

	public static void main(String[] args) {

		String str = "java";
		System.out.println(reversString(str));

	}

	private static String reversString(String str) {
		if (str.length() == 0) {
			return str;
		}
		return reversString(str.substring(1)) + str.charAt(0);
	}

}
