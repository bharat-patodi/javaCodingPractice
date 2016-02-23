import java.util.Scanner;

public class SubtractTwoInputNumbers {
	public static void main(String args[]) {
		Scanner yourNumbersPlease = new Scanner(System.in);
		System.out.println(yourNumbersPlease.nextInt() - yourNumbersPlease.nextInt());
	}
}