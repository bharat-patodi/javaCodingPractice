public class simpleMethodsIntro {
	public static void main(String args[]) {
		System.out.println(addThis(10, 20) + " " + subtractThis(20, 10) + " " + multiplyThis(2, 5) + " " + divideThis(6, 6));
	}

	static public int subtractThis (int i, int j) {
		return (i - j);
	}

	static public int addThis (int a, int b) {
		return (a + b);
	}

	static public int multiplyThis (int c, int d) {
		return (c * d);
	}

	static public int divideThis (int e, int f) {
		return (e / f);
	}
}