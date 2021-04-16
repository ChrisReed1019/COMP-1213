import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver to Temperatures class.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-22-2021
 */
public class TemperatureInfo {
   /**
    * Takes in xml info and manipulates it with Temperatures class.
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String tempInput = "";
      ArrayList<Integer> tempList = new ArrayList<Integer>();

      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempList.add(Integer.parseInt(tempInput));
         }
      } while (!(tempInput.equals("")));

      Temperatures temps = new Temperatures(tempList);

      char choice = 'E';

      do {
         System.out.print("Enter choice - [L]ow temp, "
                 + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;

            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;

            case 'P':
               System.out.println(temps);
               break;

            case 'E':
               System.out.println("\tDone");
               break;

            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}