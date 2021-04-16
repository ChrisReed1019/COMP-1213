/**
 * Search Engine Marketing Campaign Class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class SearchEngineMC extends IndirectMC {
   /**
    * Base cost of search engine marketing campaign.
    */
   public static final double BASE_COST = 2000;

   /**
    * Base constructor for SearchEngineMC.
    * @param nameIn Name of object.
    * @param revenueIn Revenue of object.
    * @param costPerAdIn Double for costPerAd.
    * @param numberOfAdsIn Int for numberOfAds.
    */
   public SearchEngineMC(String nameIn, double revenueIn,
                     double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }

   /**
    * Returns the constant BASE_COST.
    * @return Constant BASE_COST.
    */
   public double getBaseCost() {
      return BASE_COST;
   }
}