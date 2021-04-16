/**
 * Inventory Item class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-26-2021
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   /**
    * Default shipping cost per pound.
    */
   public static final double SHIPPING_COST = 1.5;

   /**
    * Constructor for electronicsItem.
    * @param nameIn Name of item.
    * @param priceIn Cost of item.
    * @param weightIn Weight of item.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   /**
    * calculateCost override.
    * @return calculateCost plus shipping cost for weight.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}