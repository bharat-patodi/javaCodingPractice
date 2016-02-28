import java.util.Scanner;

public class evenNumbersToN {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int theExtent = sc.nextInt();

		for (int i = 0; i < theExtent; i++) {
			System.out.println(2 * i);
		}

	}
}