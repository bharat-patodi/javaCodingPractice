import java.util.Scanner;

public class inputArrayPrintReverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array length and then the different array numbers:");
		int theRange = sc.nextInt();
		int[] theArray = new int[theRange];

		for (int i = 0; i < theRange; i++) {
			theArray[i] = sc.nextInt();
		}

		for (int j = theRange -1; j >= 0; j = j - 1) {
			System.out.print(theArray[j] + " ");
		}
	}
}