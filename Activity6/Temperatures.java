import java.util.ArrayList;

/**
 * Temperature class.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-22-2021
 */
public class Temperatures {
   //instance variables
   private ArrayList<Integer> temperatures;
   //constructor

   /**
    * Base constructor for Temperatures class.
    * @param temperaturesIn Temperatures array list.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

   //methods

   /**
    * Returns lowest temp.
    * @return Lowest temp.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i : temperatures) {
         if (i < low) {
            low = i;
         }
      }
      return low;
   }

   /**
    * Returns highest temp.
    * @return Highest temp.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (int i : temperatures) {
         if (i > high) {
            high = i;
         }
      }
      return high;
   }

   /**
    * Checks if number is less than than the minimum temperature.
    * @param lowIn Number to be checked.
    * @return Which number is lower.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

   /**
    * Checks if number is greater than the maximum temperature.
    * @param highIn Number to be checked.
    * @return Which number is higher.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

   /**
    * Java toString override.
    * @return String of class.
    */
   public String toString() {
      String output = "\tTemperatures: " + temperatures;
      output += "\n\tLow: " + getLowTemp();
      output += "\n\tHigh: " + getHighTemp();
      return output;
   }
}