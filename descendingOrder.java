import java.util.Scanner;

public class descendingOrder {
	public static void main(String args[]) {
		// A new scanner object
		Scanner sc = new Scanner(System.in);

		float[] gopher = new float[3];
		float[] descendingGopher = new float[3];

		gopher[0] = sc.nextFloat();
		gopher[1] = sc.nextFloat();
		gopher[2] = sc.nextFloat();

		if(gopher[0] > gopher[1]) {
			if(gopher[1] > gopher[2]) {
				descendingGopher[0] = gopher[0];
				descendingGopher[1] = gopher[1];
				descendingGopher[2] = gopher[2];
			} else if (gopher[0] > gopher[2]) {
				descendingGopher[0] = gopher[0];
				descendingGopher[1] = gopher[2];
				descendingGopher[2] = gopher[1];
			} else {
				descendingGopher[0] = gopher[2];
				descendingGopher[1] = gopher[0];
				descendingGopher[2] = gopher[1];
			}
		}

		if(gopher[1] > gopher[2]) {
			if(gopher[2] > gopher[0]) {
				descendingGopher[0] = gopher[1];
				descendingGopher[1] = gopher[2];
				descendingGopher[2] = gopher[0];
			} else if (gopher[1] > gopher[0]) {
				descendingGopher[0] = gopher[1];
				descendingGopher[1] = gopher[0];
				descendingGopher[2] = gopher[2];
			} else {
				descendingGopher[0] = gopher[0];
				descendingGopher[1] = gopher[1];
				descendingGopher[2] = gopher[2];
			}
		}

		if(gopher[2] > gopher[0]) {
			if(gopher[0] > gopher[1]) {
				descendingGopher[0] = gopher[2];
				descendingGopher[1] = gopher[0];
				descendingGopher[2] = gopher[1];
			} else if (gopher[2] > gopher[1]) {
				descendingGopher[0] = gopher[2];
				descendingGopher[1] = gopher[1];
				descendingGopher[2] = gopher[0];
			} else {
				descendingGopher[0] = gopher[1];
				descendingGopher[1] = gopher[2];
				descendingGopher[2] = gopher[0];
			}
		}


		if (gopher[0] == gopher[1] && gopher[1] == gopher[2]) {
			for (int i = 0; i < 3; i++) {
				descendingGopher[i] = gopher[i];
			}
		}

		for (int j = 0; j < 3; j++) {
			System.out.println(descendingGopher[j]);
		}

	}
}