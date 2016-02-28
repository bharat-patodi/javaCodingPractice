import java.util.Scanner;

public class oddNumbersToN {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int theExtent = sc.nextInt();
		for (int i = 1; i < theExtent; i = i + 2) {
			System.out.println(i);
		}
	}
}