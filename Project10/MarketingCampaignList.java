import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * MarketingCampaignList class.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-4-2021
 */
public class MarketingCampaignList {
   private MarketingCampaign[] marketingCampaignArray;
   private String[] invalidRecordsArray;

   /**
    * Default constructor for MarketingCampaignList.
    */
   public MarketingCampaignList() {
      marketingCampaignArray = new MarketingCampaign[0];
      invalidRecordsArray = new String[0];
   }

   /**
    * Returns marketingCampaignArray.
    * @return marketingCampaignArray.
    */
   public MarketingCampaign[] getMarketingCampaignArray() {
      return marketingCampaignArray;
   }

   /**
    * Returns invalidRecordsArray.
    * @return invalidRecordsArray.
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecordsArray;
   }

   /**
    * Adds MarketingCampaign to marketingCampaignArray.
    * @param marketingCampaign MarketingCampaign to be added.
    */
   public void addMarketingCampaign(MarketingCampaign marketingCampaign) {
      MarketingCampaign[] tempArray = marketingCampaignArray;
      marketingCampaignArray = new MarketingCampaign[tempArray.length + 1];
      for (int i = 0; i < tempArray.length; i++) {
         marketingCampaignArray[i] = tempArray[i];
      }
      marketingCampaignArray[tempArray.length] = marketingCampaign;
   }

   /**
    * Adds String to invalidRecordsArray.
    * @param str String to be added.
    */
   public void addInvalidRecord(String str) {
      String[] tempArray = invalidRecordsArray;
      invalidRecordsArray = new String[tempArray.length + 1];
      for (int i = 0; i < tempArray.length; i++) {
         invalidRecordsArray[i] = tempArray[i];
      }
      invalidRecordsArray[tempArray.length] = str;
   }

   /**
    * Generates report.
    * @return String of report.
    */
   public String generateReport() {
      String output = "-------------------------------\n";
      output += "Marketing Campaign Report\n";
      output += "-------------------------------\n\n";
      for (MarketingCampaign object : getMarketingCampaignArray()) {
         output += object.toString() + "\n\n";
      }
      return output;
   }

   /**
    * Generates report by name.
    * @return String of report sorted by name.
    */
   public String generateReportByName() {
      Arrays.sort(getMarketingCampaignArray());
      String output = "-----------------------------------------\n";
      output += "Marketing Campaign Report (by Name)\n";
      output += "-----------------------------------------\n\n";
      for (MarketingCampaign object : getMarketingCampaignArray()) {
         output += object.toString() + "\n\n";
      }
      return output;
   }

   /**
    * Generates report by campaign cost.
    * @return String of report sorted by campaign cost.
    */
   public String generateReportByCampaignCost() {
      Arrays.sort(getMarketingCampaignArray(), new CampaignCostComparator());
      String output = "-------------------------------------------------\n";
      output += "Marketing Campaign Report (by Lowest Campaign Cost)\n";
      output += "-------------------------------------------------\n\n";
      for (MarketingCampaign object : getMarketingCampaignArray()) {
         output += object.toString() + "\n\n";
      }
      return output;
   }

   /**
    * Generates report by ROI.
    * @return String of report sorted by ROI.
    */
   public String generateReportByROI() {
      Arrays.sort(getMarketingCampaignArray(), new ROIComparator());
      String output = "-------------------------------------------------\n";
      output += "Marketing Campaign Report (by Highest ROI)\n";
      output += "-------------------------------------------------\n\n";
      for (MarketingCampaign object : getMarketingCampaignArray()) {
         output += object.toString() + "\n\n";
      }
      return output;
   }

   /**
    * Reads file and converts to array.
    * @param fileName Name of file to be read.
    * @throws FileNotFoundException May throw FileNotFoundException.
    */
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner fileInput = new Scanner(new File(fileName));
      while (fileInput.hasNext()) {
         String input = fileInput.nextLine();
         String[] inputArray = input.split(",");
         switch (inputArray[0].charAt(0)) {
            case 'D':
               addMarketingCampaign(
                     new DirectMC(inputArray[1],
                           Double.parseDouble(inputArray[2]),
                           Double.parseDouble(inputArray[3]),
                           Integer.parseInt(inputArray[4]))
               );
               break;
            case 'I':
               addMarketingCampaign(
                     new IndirectMC(inputArray[1],
                           Double.parseDouble(inputArray[2]),
                           Double.parseDouble(inputArray[3]),
                           Integer.parseInt(inputArray[4]))
               );
               break;
            case 'S':
               addMarketingCampaign(
                     new SearchEngineMC(inputArray[1],
                           Double.parseDouble(inputArray[2]),
                           Double.parseDouble(inputArray[3]),
                           Integer.parseInt(inputArray[4]))
               );
               break;
            case 'M':
               addMarketingCampaign(
                     new SocialMediaMC(inputArray[1],
                           Double.parseDouble(inputArray[2]),
                           Double.parseDouble(inputArray[3]),
                           Integer.parseInt(inputArray[4]))
               );
               break;
            default:
               break;
         }
      }
   }
}