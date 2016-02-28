public class inputOperator {
	public static void main(String args[]) {
		int theFirstOne = sc.nextInt();
		int theSecondOne = sc.nextInt();
		enum Operator {+, *, /, -};

		switch (Operator) {

			case +: theFirstOne + theSecondOne;
					break;

			case *: theFirstOne * theSecondOne;
					break;

			case /: theFirstOne / theSecondOne;
					break;

			case -: theFirstOne - theSecondOne;
					break;

		}
	}
}