package Set_4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordFromSentence3 {

	public static void main(String[] args) {
		String str = "I am Sandip Sandip";

		String[] arr = str.split(" ");

		Set<String> mySet = new LinkedHashSet<>();
		for (String ele : arr) {
			mySet.add(ele);
		}
		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
