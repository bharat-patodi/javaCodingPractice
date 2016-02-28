import java.util.Scanner;

public class pingalTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theRange = sc.nextInt();



		for (int i = 1; i <= theRange; i++) {
			for (int j = theRange; j > i; j = j - 1) {
				System.out.print(" ");
			}

			for (int k = 1; k < 2 * i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
