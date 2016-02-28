import java.util.Scanner;

public class inputNArrayElements {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theRange = sc.nextInt();
		// Dynamic allocation of the size of the array
		int[] theArray = new int[theRange];

		for (int i = 0; i < theRange; i++) {
			theArray[i] = sc.nextInt();
		}

		for (int i = 0; i < theRange; i++) {
			System.out.print(theArray[i] + " ");
		}
	}
}