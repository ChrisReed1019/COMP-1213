/**
 * OnlineTextItem class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-26-2021
 */
public abstract class OnlineTextItem extends InventoryItem {
   /**
    * Default constructor for OnlineTextItem.
    * @param nameIn Name for product.
    * @param priceIn Price of product.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

   /**
    * calculateCost override.
    * @return Price of product.
    */
   public double calculateCost() {
      return price;
   }
}