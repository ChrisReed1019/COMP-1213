/**
 * Inventory Item class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-26-2021
 */
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate;

   /**
    * Default constructor for InventoryItem.
    * @param nameIn Name for product.
    * @param priceIn Price of product.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

   /**
    * Returns name variable string.
    * @return Name variable.
    */
   public String getName() { return name; }

   /**
    * Calculate total cost of product.
    * @return Price times taxRate.
    */
   public double calculateCost() { return price * (1 + taxRate); }

   /**
    * Sets variable tax rate.
    * @param taxRateIn Double for taxRate to be set to.
    */
   public static void setTaxRate(double taxRateIn) { taxRate = taxRateIn; }

   /**
    * ToString method for InventoryItem.
    * @return String representation of InventoryItem.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}