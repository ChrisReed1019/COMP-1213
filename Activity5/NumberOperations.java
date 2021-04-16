/**
 * Operations of numbers.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-14-2021
 */
public class NumberOperations {
   //instance variables
   private int number;

   //constructor

   /**
    * Default constructor for number operations.
    * @param numberIn Number
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

   //methods

   /**
    * Returns int value.
    * @return Int value.
    */
   public int getValue() {
      return number;
   }

   /**
    * Returns odds under.
    * @return Odds under.
    */
   public String oddsUnder() {
      String output = "";

      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }

   /**
    * Returns powers two under.
    * @return Powers two under.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers *= 2;
      }
      return output;
   }

   /**
    * Returns number is greater.
    * @param compareNumber Number to be compared.
    * @return Is number greater.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      } else if (number < compareNumber) {
         return -1;
      } else {
         return 0;
      }
   }

   /**
    * Returns string version of class.
    * @return String version of class.
    */
   public String toString() {
      return number + "";
   }
}