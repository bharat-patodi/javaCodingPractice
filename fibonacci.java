import java.util.Scanner;

public class fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theRange = sc.nextInt();
		int[] theSequence = new int[theRange];
		theSequence[0] = 0;
		theSequence[1] = 1;

		for (int i = 2; i < theRange; i++) {
			theSequence[i] = theSequence[i - 1] + theSequence[i - 2];
		}

		for (int i = 0; i < theRange; i++) {
			System.out.print (" " + theSequence[i]);
		}
	}
}