import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ConeList menu application.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-24-2021
 */
public class ConeListMenuApp {
   /**
    * Manipulate ConeList and Cone classes.
    * @param args Command line arguments - not used
    * @throws IOException IOException can be thrown.
    */
   public static void main(String[] args) throws IOException
   {
      Scanner userInput = new Scanner(System.in);
      ConeList coneList = new ConeList("*** no list name assigned ***",
              new ArrayList<Cone>());
      char input = ' ';
      System.out.println("Cone List System Menu");
      System.out.println("R - Read File and Create Cone List");
      System.out.println("P - Print Cone List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Cone");
      System.out.println("D - Delete Cone");
      System.out.println("F - Find Cone");
      System.out.println("E - Edit Cone");
      System.out.println("Q - Quit");

      while (Character.toLowerCase(input) != 'q') {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = userInput.nextLine().charAt(0);
         switch (Character.toLowerCase(input)) {
            case 'r':
               ArrayList<Cone> array = new ArrayList<Cone>();

               System.out.print("\tFile name: ");
               Scanner fileInput = new Scanner(new File(userInput.nextLine()));
               String name = fileInput.nextLine();

               while (fileInput.hasNext()) {
                  array.add(new Cone(fileInput.nextLine(),
                          Double.parseDouble(fileInput.nextLine()),
                          Double.parseDouble(fileInput.nextLine())));
               }

               coneList = new ConeList(name, array);
               System.out.println("\tFile read in and Cone List created");
               break;
            case 'p':
               System.out.println();
               System.out.println(coneList);
               break;
            case 's':
               System.out.println();
               System.out.println(coneList.summaryInfo());
               break;
            case 'a':
               System.out.print("\tLabel: ");
               String label = userInput.nextLine();
               System.out.print("\tHeight: ");
               double height = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius: ");
               double radius = Double.parseDouble(userInput.nextLine());
               coneList.addCone(label, height, radius);
               System.out.println("\t*** Cone added ***");
               break;
            case 'd':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               Cone tempCone = coneList.deleteCone(label);
               if (tempCone != null) {
                  System.out.println("\t\"" + tempCone.getLabel()
                         + "\" deleted");
               } else {
                  System.out.println("\t\"" + label + "\" not found");
               }
               break;
            case 'f':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               if (coneList.findCone(label) != null) {
                  System.out.println(coneList.findCone(label));
               } else {
                  System.out.println("\t\"" + label + "\" not found");
               }
               break;
            case 'e':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
               if (coneList.editCone(label, height, radius)) {
                  System.out.println("\t\"" + label + "\" successfully edited");
               } else {
                  System.out.println("\t\"" + label + "\" not found");
               }
               break;
            case 'q':
               break;
            default:
               System.out.println("\t*** invalid code ***");
         }
         System.out.println();
      }
   }
}