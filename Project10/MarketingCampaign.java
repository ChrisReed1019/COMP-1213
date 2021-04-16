import java.text.DecimalFormat;


/**
 * Marketing Campaign Class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public abstract class MarketingCampaign 
         implements Comparable<MarketingCampaign> {
   protected String name;
   protected double revenue;
   protected static int count = 0;

   /**
    * Base constructor for MarketingCampaign.
    * @param nameIn Name of object.
    * @param revenueIn Revenue of object.
    */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }

   /**
    * Returns the variable name.
    * @return Variable name.
    */
   public String getName() { return name; }

   /**
    * Returns the variable revenue.
    * @return Variable revenue.
    */
   public double getRevenue() { return revenue; }

   /**
    * Returns the variable count.
    * @return Variable count.
    */
   public static int getCount() { return count; }

   /**
    * Sets the variable name.
    * @param nameIn Variable to set name as.
    */
   public void setName(String nameIn) { name = nameIn; }

   /**
    * Sets the variable revenue.
    * @param revenueIn Variable to set revenue as.
    */
   public void setRevenue(double revenueIn) { revenue = revenueIn; }

   /**
    * Sets the static variable count to 0.
    */
   public static void resetCount() { count = 0; }

   /**
    * Calculates the ROI.
    * @return Double value of ROI.
    */
   public double calcROI() { 
      return (revenue - campaignCost()) / campaignCost();
   }

   /**
    * compareTo method for MarketingCampaign.
    * @param object Object to be compared to.
    * @return Int indicating the results of the comparison.
    */
   public int compareTo(MarketingCampaign object) {
      return name.toLowerCase().compareTo(object.name.toLowerCase());
   }

   /**
    * ToString method of MarketingCampaign.
    * @return String representation of MarketingCampaign.
    */
   public String toString() {
      DecimalFormat monetaryFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat roiFormat = new DecimalFormat("0.##%");
      String output = name + " (" + this.getClass() + ")\n";
      output += "Revenue: " + monetaryFormat.format(revenue) + "   ";
      output += "Campaign Cost: "
         + monetaryFormat.format(campaignCost()) + "   ";
      output += "ROI: " + roiFormat.format(calcROI());

      return output;
   }

   /**
    * Calculates cost of campaign.
    * @return Double of cost of campaign.
    */
   public abstract double campaignCost();
}