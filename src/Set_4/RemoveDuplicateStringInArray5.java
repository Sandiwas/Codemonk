package Set_4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStringInArray5 {

	public static void main(String[] args) {
		String[] arr = { "java", "ruby", "js", "java", "ruby", "js", "js" };

		Set<String> myset = new LinkedHashSet<>();
		for (String ele : arr) {
			myset.add(ele);
		}
		System.out.println(myset);

	}

}
