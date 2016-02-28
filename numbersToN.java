import java.util.Scanner;

public class numbersToN {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theLimit = sc.nextInt();
		int myIterator = 1;
		while(myIterator <= theLimit) {
			System.out.print(myIterator + " ");
			myIterator++;
		}
	}
}