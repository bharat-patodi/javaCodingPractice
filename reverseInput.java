import java.util.Scanner;

public class reverseInput {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theWIPNumber = sc.nextInt();
		int reverseWIPNumber = 0;
		int numberOfDigits = 0;

		while (theWIPNumber > 0) {
			reverseWIPNumber = theWIPNumber % 10;
			theWIPNumber = theWIPNumber / 10;
			numberOfDigits++;
		}	
		
		System.out.print(numberOfDigits);
	}
}