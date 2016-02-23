import java.util.Scanner;

public class CalculateAreaOfCircle {
	public static void main(String args[]) {
		Scanner calculatingArea = new Scanner(System.in);
		// Declare a constant for pi and a variable for radius
		double pi = 3.1416;
		double radius = calculatingArea.nextInt();
		// Calculate and display the area by taking radius value from the user
		System.out.println(pi * radius * radius);
	}
}