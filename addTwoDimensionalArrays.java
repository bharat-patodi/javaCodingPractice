public class addTwoDimensionalArrays {
	public static void main(String args[]) {
		int[][] myArray = {{78, 20, 102, 54}, {2, 12, 22, 32}};
		int[][] yourArray = {{1, 2, 3, 4}, {0, 23, 25, 27}};
		int[][] ourArray = new int[2][4];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				ourArray[i][j] = myArray[i][j] + yourArray[i][j];
			}
		}

		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 4; b++) {
				System.out.print("[" + ourArray[a][b] + "]" + " ");
			}

			System.out.println();
		}
	}
}