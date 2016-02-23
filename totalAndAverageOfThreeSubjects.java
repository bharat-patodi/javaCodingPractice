import java.util.Scanner;

	public class totalAndAverageOfThreeSubjects {
		public static void main (String args[]) {
			Scanner sc = new Scanner (System.in);
			float scoreOne = sc.nextFloat();
			float scoreTwo = sc.nextFloat();
			float scoreThree = sc.nextFloat();
			System.out.println("The total score = " + (scoreOne + scoreTwo + scoreThree) + "\nThe average = " + (scoreOne + scoreTwo + scoreThree)/3);
		}
	}