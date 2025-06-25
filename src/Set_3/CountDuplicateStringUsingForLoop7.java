package Set_3;

public class CountDuplicateStringUsingForLoop7 {

	public static void main(String[] args) {
		String[] arr = { "java", "ruby", "js", "java", "ruby", "js" ,"java"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])){
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
