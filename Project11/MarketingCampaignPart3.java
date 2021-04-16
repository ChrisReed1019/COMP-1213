import java.io.FileNotFoundException;

/**
 * MarketingCampaignPart3 class.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-12-2021
 */
public class MarketingCampaignPart3 {
   /**
    * Main method.
    * @param args File name for input.
    */
   public static void main(String[] args) {
      if (args.length > 0) {
         try {
            String fileName = args[0];
            MarketingCampaignList array = new MarketingCampaignList();
            array.readFile(fileName);
            System.out.print(array.generateReport());
            System.out.print(array.generateReportByName());
            System.out.print(array.generateReportByCampaignCost());
            System.out.print(array.generateReportByROI());
            System.out.print(array.generateInvalidRecordsReport());

         } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
               System.out.println("*** Attempted to read file: "
                     + args[0]
                     + " (No such file or directory)");
            }
         }
      } else {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   }
}