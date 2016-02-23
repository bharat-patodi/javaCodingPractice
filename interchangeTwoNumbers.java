import java.util.Scanner;

public class interchangeTwoNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		float firstNumber = sc.nextFloat();
		float secondNumber = sc.nextFloat();
		float thirdNumber = firstNumber;
		// original values
		System.out.println(firstNumber + " " + secondNumber + " ");	
		// interchanging commencing
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		// interchanged values
		System.out.println(firstNumber + " " + secondNumber + " ");
	}
}