import java.util.Comparator;

/**
 * Comparator for ROI.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-5-2021
 */
public class ROIComparator implements Comparator<MarketingCampaign> {
   /**
    * Compares 2 MarketingCampaign objects based on ROI.
    * @param obj1 First object to be compared.
    * @param obj2 Second object to be compared.
    * @return 1 if obj1 is less, -1 if obj1 is greater, 0 if both equal.
    */
   public int compare(MarketingCampaign obj1, MarketingCampaign obj2) {
      if (obj1.calcROI() < obj2.calcROI()) {
         return 1;
      } else if (obj1.calcROI() > obj2.calcROI()) {
         return -1;
      } else {
         return 0;
      }
   }
}