/**
 * App for marketing campaign.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-5-2021
 */
public class MarketingCampaignPart2 {
   /**
    * Main method for marketing campaign app.
    * @param args File name input.
    */
   public static void main(String[] args) {
      if (args.length > 0) {
         String fileName = args[0];
         MarketingCampaignList array = new MarketingCampaignList();
         
         try {
            array.readFile(fileName);
            System.out.println(array.generateReport());
            System.out.println(array.generateReportByName());
            System.out.println(array.generateReportByCampaignCost());
            System.out.println(array.generateReportByROI());
         } catch (Exception exception) {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.\n");
         }
      } else {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.\n");
      }
   }
}