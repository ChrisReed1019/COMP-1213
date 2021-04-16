/**
 * Invalid Category Exception.
 *
 * @author Chris Reed - COMP-1213
 * @version 4-12-2021
 */
public class InvalidCategoryException extends Exception {
   /**
    * Constructor for InvalidCategoryException.
    * @param categoryIn Category of exception.
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}
