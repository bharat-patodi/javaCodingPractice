import java.util.Scanner;

public class displayAlphabetsHalfTriangle {
	public static void main(String args[]) {

		Scanner sc = new Scanner (System.in);
		int theRange = sc.nextInt();

		for (int i = 1; i <= theRange; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j + 64));
			}

			System.out.println();
		}
	}
}
