import java.util.Scanner;

public class maxOrMin {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the array and then the different values: ");
		int theRange = sc.nextInt();
		int[] theArray = new int[theRange];
		// initialize the array fields
		for (int i = 0; i < theRange; i++) {
			theArray[i] = sc.nextInt();
		}

		int maxValue = theArray[0];
		int minValue = theArray[0];

		// Calculating the maximum value
		for (int j = 0; j < theRange; j++) {
			if(maxValue < theArray[j]) {
				maxValue = theArray[j];
			}
		}
		System.out.println("The largest value in the Array is: " + maxValue);

		// Calculating the minimum value
		for (int k = 0; k < theRange; k++) {
			if(minValue > theArray[k]) {
				minValue = theArray[k];
			}
		}
		System.out.println("The smallest value in the Array is: " + minValue);

	}

}