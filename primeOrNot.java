import java.util.Scanner;

public class primeOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theInput = sc.nextInt();
		int count = 1;

		// The special case of 1
		if (theInput == 1) {
			System.out.println("1 is neither prime nor composite.");
			return;
		}

		// The count for the number of 
		for (int i = 2; i <= theInput / 2; i++) {
			if (theInput % i == 0) {
				count++;
			}
		}

		// The check and the final statement 
		if (count == 1) {
				System.out.println(theInput + " is prime.");
		} else {
				System.out.println(theInput + " is not prime.");
		}

	}
}