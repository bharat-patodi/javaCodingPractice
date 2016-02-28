import java.util.Scanner;

public class armstrongNumber {
	public static void main(String args[]) {
		// declaration and initialization of fields
		Scanner sc = new Scanner (System.in);
		int inputNumber = sc.nextInt();
		int inputWIP = inputNumber;
		int sum = 0;

		// the while loop
		while (inputWIP > 0) {
			sum += Math.pow(inputWIP % 10, 3);
			inputWIP = inputWIP / 10;
		}

		// the check
		if (sum == inputNumber) {
			System.out.println(inputNumber + " is an Armstrong number.");
		} else {
			System.out.println(inputNumber + " is not an Armstrong number.");
		}
	}
}