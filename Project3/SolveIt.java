import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Solves an equation with the variable x.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-4-2021
 */
public class SolveIt {
   /**
    * Solves an equation with the variable x.
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      double x;
      double result;
      Scanner input = new Scanner(System.in);
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");

      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(input.nextLine());

      result = (6 * Math.pow(x, 3.0) + Math.sqrt(3 * Math.pow(x, 2.0)
             + 2 * x + 1)) / (Math.abs(2 * x) + 4);
      int index = Double.toString(result).indexOf('.');
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: " + index);
      System.out.println("# of characters to right of decimal point: " 
                     + (Double.toString(result).length() - index - 1));
      System.out.println("Formatted Result: " + decimalFormat.format(result));

   }
}