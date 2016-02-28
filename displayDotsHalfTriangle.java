import java.util.Scanner;

public class displayDotsHalfTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theRows = sc.nextInt();

		for (int i = 1; i <= theRows; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}