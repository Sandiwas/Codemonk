package Set_5;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "I am working on PC";
		String result = "";
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		System.out.println(result);
	}

}
