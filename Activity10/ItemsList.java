/**
 * OnlineTextItem class.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-2-2021
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;

   /**
    * Default ItemsList Constructor.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }

   /**
    * Add item to list.
    * @param itemIn Item to be added.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }

   /**
    * Calculates total of inventory items.
    * @param electronicsSurcharge Amount to be added to electronics items.
    * @return Calculates total of items in list.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;

      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += electronicsSurcharge + inventory[i].calculateCost();
         } else {
            total += inventory[i].calculateCost();
         }
      }

      return total;
   }

   /**
    * ToString method for ItemsList.
    * @return String of ItemsList.
    */
   public String toString() {
      String output = "All inventory:\n\n";

      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }

      return output;
   }
}
