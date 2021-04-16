/**
 * OnlineArticle class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-26-2021
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;

   /**
    * Default constructor for OnlineArticle.
    * @param nameIn Name for product.
    * @param priceIn Price of product.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

   /**
    * Sets wordCount variable.
    * @param wordCountIn Int to set wordCount as.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}