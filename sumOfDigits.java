import java.util.Scanner;

public class sumOfDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theNumber = sc.nextInt();
		int digitSum = 0;
		while (theNumber > 0) {
			digitSum += theNumber % 10;
			theNumber = theNumber / 10;
		}
		System.out.println(digitSum);
	}
}