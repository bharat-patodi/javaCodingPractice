public class addDiagonalElementsOfMultidimensionalArrays {
	public static void main (String args[]) {
		int[][] blueSquare =  {{1, 1, 1}, {2, 2, 2}, {4, 4, 4}};
		int[][] yellowSquare = {{3, 3, 3}, {2, 2, 2}, {0, 0, 0}};
		int[][] minkSquare = new int[3][3];

		// Adding the diagonal elements and zeroing out the other elements
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == j) {
					minkSquare[i][j] = blueSquare[i][j] + yellowSquare[i][j];
				} else {
					minkSquare[i][j] = 0;
				}
			}
		}

		// Displaying the resultant array.
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + minkSquare[k][j] + "]" + " ");
				}

			System.out.println();
			}
		}
	}