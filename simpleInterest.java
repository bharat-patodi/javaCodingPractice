import java.util.Scanner;

public class simpleInterest {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		// principal
		int principal = sc.nextInt();
		// interest rate
		float rate = sc.nextFloat();
		// time period in years
		int timePeriod = sc.nextInt();
		// simple interest formula
		System.out.println(principal * rate * timePeriod / 100);
	}
}
		