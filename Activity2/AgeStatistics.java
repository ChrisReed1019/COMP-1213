import java.util.Scanner;

/**
 * Program that displays someone's name, age,
 * and gender, along with calculations for
 * age in minutes and centuries well as max
 * heart rate based on age and gender.
 *
 * @author Chris Reed - COMP-1213
 * @version 1-25-2021
 */
public class AgeStatistics {
   /**
    * Takes in name, age, and gender and prints information on it.
    *
    * @param args Command line arguments - not used
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //prompt user for name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();

      //prompt user for age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //prompt user for gender
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();

      //print age in minutes
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");

      //print age in centuries
      System.out.println("\tYour age in centuries is "
              + (double) ageInYears / 100 + " centuries.");

      System.out.print("Your max heart rate is ");

      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
      } else {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }

      System.out.print(maxHeartRate + " beats per minute.");
   }
}