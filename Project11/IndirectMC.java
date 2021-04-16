import java.text.DecimalFormat;

/**
 * Indirect Marketing Campaign Class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class IndirectMC extends MarketingCampaign {
   protected double costPerAd;
   protected int numberOfAds;
   /**
    * Base Cost of Indirect Campaign.
    */
   public static final double BASE_COST = 1500;

   /**
    * Base constructor for IndirectMC.
    * @param nameIn Name of object.
    * @param revenueIn Revenue of object.
    * @param costPerAdIn Double for costPerAd.
    * @param numberOfAdsIn Int for numberOfAds.
    */
   public IndirectMC(String nameIn, double revenueIn,
                   double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }

   /**
    * Returns the variable costPerAd.
    * @return Variable costPerAd.
    */
   public double getCostPerAd() { return costPerAd; }

   /**
    * Sets the variable costPerAd.
    * @param costPerAdIn Variable to set costPerAd as.
    */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }

   /**
    * Returns the variable costPerAd.
    * @return Variable costPerAd.
    */
   public int getNumberOfAds() { return numberOfAds; }

   /**
    * Sets the variable numberOfAds.
    * @param numberOfAdsIn Variable to set numberOfAds as.
    */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }

   /**
    * Returns the constant BASE_COST.
    * @return Constant BASE_COST.
    */
   public double getBaseCost() {
      return BASE_COST;
   }

   /**
    * Calculates cost of campaign.
    * @return Double of cost of campaign.
    */
   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }

   /**
    * ToString method of IndirectMC.
    * @return String representation of IndirectMC.
    */
   public String toString() {
      DecimalFormat monetaryFormat = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\n   ";
      output += "Base Cost: "
            + monetaryFormat.format(this.getBaseCost()) + "\n   ";
      output += "Ad Cost: "
            + monetaryFormat.format(numberOfAds * costPerAd);
      output += " = " + monetaryFormat.format(costPerAd) + " per ad * ";
      output += numberOfAds + " ads";

      return output;
   }
}