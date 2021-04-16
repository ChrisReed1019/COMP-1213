import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Cone List Driver.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-18-2021
 */
public class ConeListApp {
   /**
    * Print info on a file of cone list.
    * @param args Command line arguments - not used
    * @throws IOException IOException throws.
    */
   public static void main(String[] args) throws IOException
   {
      Scanner userInput = new Scanner(System.in);
      ConeList coneList;
      ArrayList array = new ArrayList<Cone>();
      System.out.print("Enter file name: ");
      Scanner fileInput = new Scanner(new File(userInput.nextLine()));
      System.out.println();
      String name = fileInput.nextLine();
      while (fileInput.hasNext()) {
         array.add(new Cone(fileInput.nextLine(),
                 Double.parseDouble(fileInput.nextLine()),
                 Double.parseDouble(fileInput.nextLine())));
      }
      coneList = new ConeList(name, array);
      System.out.println(coneList.toString());
      System.out.print(coneList.summaryInfo());
   }
}