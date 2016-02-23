import java.util.Scanner;
public class findLargest{
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		float firstNumber = sc.nextFloat();
		float secondNumber = sc.nextFloat();
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " is the larger one.");
		} else if (firstNumber == secondNumber) {
			System.out.println("Both numbers are equal.");
		} else { 
			System.out.println(secondNumber + " is the larger one.");
		}	
	}
}	