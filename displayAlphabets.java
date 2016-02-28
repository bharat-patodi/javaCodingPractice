public class displayAlphabets {
	public static void main(String args[]) {
// One way to achiee this end.		
		for (int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}

System.out.println();
// This is an alternate way to do this.
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
	}
}