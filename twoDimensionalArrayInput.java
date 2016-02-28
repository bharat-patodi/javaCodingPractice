import java.util.Scanner;

public class twoDimensionalArrayInput {
	public static void main(String args[]) {
		int[][] theArray = new int[3][2];
		Scanner sc = new Scanner (System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				theArray[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("[" + theArray[i][j] + "]" + " ");
			}
			System.out.println();
		}
	}
}