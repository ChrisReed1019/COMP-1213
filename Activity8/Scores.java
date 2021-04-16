/**
 * Scores class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-18-2021
 */
public class Scores {
   private int[] numbers;

   /**
    * Scores default constructor.
    * @param numbersIn Numbers value for object.
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }

   /**
    * Finds evens in number array.
    * @return Returns int array of all even numbers.
    */
   public int[] findEvens() {
      int numEvens = 0;
      for (int num : numbers) {
         if (num % 2 == 0) {
            numEvens++;
         }
      }
      int[] array = new int[numEvens];
      int i = 0;
      for (int num : numbers) {
         if (num % 2 == 0) {
            array[i] = num;
            i++;
         }
      }
      return array;
   }

   /**
    * Finds odds in number array.
    * @return Returns int array of all odd numbers.
    */
   public int[] findOdds() {
      int numOdds = 0;
      for (int num : numbers) {
         if (num % 2 != 0) {
            numOdds++;
         }
      }
      int[] array = new int[numOdds];
      int i = 0;
      for (int num : numbers) {
         if (num % 2 != 0) {
            array[i] = num;
            i++;
         }
      }
      return array;
   }

   /**
    * Finds average of all numbers in array.
    * @return Double value of average.
    */
   public double findAverage() {
      double total = 0;
      for (int num : numbers) {
         total += num;
      }
      return total / numbers.length;
   }

   /**
    * Default toString method for scores class.
    * @return String value of class.
    */
   public String toString() {
      String output = "";

      for (int i = 0; i < numbers.length; i++) {
         output += numbers[i] + "\t";
      }

      return output;
   }

   /**
    * ToString method of scores class but returns in reverse order.
    * @return Numbers string in reverse order.
    */
   public String toStringInReverse() {
      String output = "";

      for (int i = numbers.length - 1; i >= 0; i--) {
         output += numbers[i] + "\t";
      }

      return output;
   }
}