import java.util.Scanner;

/**
 *  Program that allows the user to enter an amount of petroleum
 *  and outputs multiple different types of outputs.
 * @author Chris Reed - COMP-1213
 * @version 1-28-2021
 */
public class PetroleumUnits {
   /**
    * Takes input of ounces and outputs
    * barrels, gallons, quarts, and ounces.
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int petroleumInput;
      int barrels;
      int gallons;
      int quarts;

      System.out.print("Enter amount of petroleum in ounces: ");
      petroleumInput = input.nextInt();

      if (petroleumInput <= 1000000000) {
         System.out.println("Petroleum amount in units: ");
         int temp = petroleumInput;
         barrels = temp / 5376;
         temp -= barrels * 5376;
         gallons = temp / 128;
         temp -= gallons * 128;
         quarts = temp / 32;
         temp -= quarts * 32;
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + temp);
         System.out.println(petroleumInput + " oz = (" + barrels
                 + " bl * 5376 oz) + (" + gallons + " gal * 128 oz) + ("
                 + quarts + " qt * 32 oz) + (" + temp + " oz)");
      } else {
         System.out.println("Amount must not exceed 1,000,000,000.");

      }
   }
}