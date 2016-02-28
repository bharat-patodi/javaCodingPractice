import java.util.Scanner;

public class numberToAlphabet {
	public static void main(String args[]) {

		Scanner sc = new Scanner (System.in);
		int theNumeral = sc.nextInt();
		int theNumeralPart;
		String theDigit = "";

		// the while loop
		while (theNumeral > 0) {
			theNumeralPart = theNumeral % 10;
			theNumeral = theNumeral / 10;

			// the switch statement to print the right number choice
			switch (theNumeralPart) {
				case 0: theDigit = "Zero";
						break;

				case 1: theDigit = "One";
						break;

				case 2: theDigit = "Two";
						break;

				case 3: theDigit = "Three";
						break;

				case 4: theDigit = "Four";
						break;

				case 5: theDigit = "Five";
						break;

				case 6: theDigit = "Six";
						break;

				case 7: theDigit = "Seven";
						break;

				case 8: theDigit = "Eight";
						break;

				case 9: theDigit = "Nine";
						break;

			}	

			System.out.print(theDigit + " ");
		}
	}
}