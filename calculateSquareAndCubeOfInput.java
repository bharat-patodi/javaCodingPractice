import java.util.Scanner;

public class calculateSquareAndCubeOfInput {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		float favNumber = sc.nextFloat();
		System.out.println("Number: " + favNumber + " Square: " + favNumber * favNumber + " Cube: " + favNumber * favNumber * favNumber);
	}
}