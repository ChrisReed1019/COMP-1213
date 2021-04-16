/**
 * Division class.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-9-2021
 */
public class Division {
   /**
    * Divides 2 numbers and gives int result.
    * @param numerator Numerator to divide.
    * @param denominator Denominator to divide.
    * @return Int result of 2 numbers.
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
    * Divides 2 numbers and gives double result.
    * @param numerator Numerator to divide.
    * @param denominator Denominator to divide.
    * @return Double result of 2 numbers.
    * @throws IllegalArgumentException Can throw IllegalArgumentException.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator " 
            + "cannot be zero.");
      }
      return (double) numerator / denominator;
   }
}