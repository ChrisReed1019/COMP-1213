import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for SearchEngineMC.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class SearchEngineMCTest {
   /**
    * Test campaignCost of class.
    */
   @Test public void testCalculate() {
      SearchEngineMC test = new SearchEngineMC("Test1", 27500.00, 2.50, 5000);
      Assert.assertTrue(test.campaignCost() == 14500);
   }
}
