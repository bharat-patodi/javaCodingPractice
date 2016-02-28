public class transposeMatrix {
	public static void main(String args[]) {
		int[][] thisArrayWasPeaceful = {{0, 0, 0}, {1, 1, 1}, {2, 2, 2}};
		int[][] everythingChangedAfter1987 = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				everythingChangedAfter1987[i][j] = thisArrayWasPeaceful[j][i];
			}
		}

		System.out.println("\nThe peaceful Matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + thisArrayWasPeaceful[i][j] + "]" + " ");
			}
			System.out.println();
		}


		System.out.println("\nThe transposed Matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + everythingChangedAfter1987[i][j] + "]" + " ");
			}
			System.out.println();
		}
	}
}