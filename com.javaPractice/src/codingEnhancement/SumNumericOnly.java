package codingEnhancement;

public class SumNumericOnly {

	public static void main(String[] args) {
		
		String[] arr = {"1", "2", "?", "3"};
        int sum = 0;

        for (String s : arr) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                // Ignore non-numeric values like "?"
            }
        }

        System.out.println("Sum of numeric values: " + sum);

	}

}
