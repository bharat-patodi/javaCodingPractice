import java.util.Scanner;

public class numberOfDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theWIPNumber = sc.nextInt();
		int numberOfDigits = 0;

		while (theWIPNumber > 0) {
			theWIPNumber = theWIPNumber / 10;
			numberOfDigits++;
		}
		
		System.out.println(numberOfDigits);
	}
}