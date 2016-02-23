import java.util.Scanner;

public class DivideTwoInputNumbers {
	public static void main(String args[]) {
		Scanner giveMeNumbersToMultiply = new Scanner(System.in);
		System.out.println(giveMeNumbersToMultiply.nextInt() / giveMeNumbersToMultiply.nextInt());
	}
}