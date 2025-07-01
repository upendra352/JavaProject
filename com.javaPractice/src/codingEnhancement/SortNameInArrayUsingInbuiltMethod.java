package codingEnhancement;
import java.util.Arrays;

public class SortNameInArrayUsingInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name= {"Banana", "Apple", "Grapes"};
	// Arrays.sort() can not sort String, it can sort Arrays. so we need to change Strings into char array	
	/*	String name="Banana";
		char[]arr=name.toLowerCase().toCharArray();
		Arrays.sort(arr);
		System.out.println(arr); */
		
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		for(String sArr:name) {
			System.out.println(sArr);
		}

	}

}
