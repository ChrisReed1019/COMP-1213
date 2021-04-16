import java.util.Scanner;

/**
 * Allows for input of variables in cone class.
 *
 * @author Chris Reed - COMP-1213
 * @version 2--2021
 */
public class ConeApp {
   /**
    * Uses cone and outputs different operations.
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String label = "";
      double radius = 0;
      double height = 0;
      Cone cone1;

      System.out.println("Enter label, height, and radius for a cone.");
      System.out.print("\tlabel: ");
      label = input.nextLine();
      System.out.print("\theight: ");
      height = Double.parseDouble(input.nextLine());
      if (height <= 0) {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
      System.out.print("\tradius: ");
      radius = Double.parseDouble(input.nextLine());
      if (radius <= 0) {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }

      cone1 = new Cone(label, height, radius);
      System.out.print(cone1.toString());

   }
}