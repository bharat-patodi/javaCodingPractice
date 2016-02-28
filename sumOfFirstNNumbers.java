import java.util.Scanner;

public class sumOfFirstNNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theRange = sc.nextInt();
		int myIterator = 1;
		int numberSum = 0;
		while (myIterator <= theRange) {
			numberSum += myIterator;
			myIterator++;
		}
			System.out.println(numberSum);
	}

}