import java.util.Scanner;

/**
 * A program that takes in 3 variables and solves for
 * an expression.
 *
 * @author Chris Reed - COMP-1213
 * @version 1-28-2021
 */
public class ExpressionSolver {
   /**
    * Takes in variables and solves in expression.
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double x;
      double y;
      double z;
      double result;

      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75) / xyz");
      System.out.print("\tx = ");
      x = input.nextDouble();

      System.out.print("\ty = ");
      y = input.nextDouble();

      System.out.print("\tz = ");
      z = input.nextDouble();

      if (x * y * z != 0) {
         result = ((9 * x + 6.25) * (6 * y - 4.5) * (3 * z + 2.75)) 
                     / (x * y * z);
         System.out.println("result = " + result);
      } else {
         System.out.println("result is \"undefined\"");
      }
   }
}