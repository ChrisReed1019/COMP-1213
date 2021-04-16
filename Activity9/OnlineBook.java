/**
 * OnlineBook class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-26-2021
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;

   /**
    * Default constructor for OnlineBook.
    * @param nameIn Name for product.
    * @param priceIn Price of product.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

   /**
    * Sets author variable.
    * @param authorIn Int to set wordCount as.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }

   /**
    * ToString overried for OnlineBook.
    * @return String representation of OnlineBook.
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
}