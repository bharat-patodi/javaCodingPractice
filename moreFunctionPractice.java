import java.util.Scanner;

public class moreFunctionPractice {
   static Scanner sc = new Scanner (System.in);
   static int theNumber = sc.nextInt();
   static int factorialValue = 1;
   static int count = 1;

   public static void main(String args[]) {
      System.out.println(factorial(theNumber));
      primeOrNot(theNumber);
   }

   public static int factorial(int n) {
      for (int i = 1; i <= n; i++) {
         factorialValue = factorialValue * i;
      }
      return factorialValue;
   }

   public static void primeOrNot (int n)  {
      if (n == 0) {
         System.out.println(theNumber + " is not prime.");
         return;
      }
      if (n == 1) {
         System.out.println("1 is neither prime nor composite.");
         return;
      }

      for (int i = 2; i < n/2; i++) {
         if (n % i == 0) {
            count++;
         }
      }

      if (count > 1) {
         System.out.println(theNumber + " is composite.");
      } else {
         System.out.println(theNumber + " is prime.");
      }
   }
}