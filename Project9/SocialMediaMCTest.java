import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for SocialMediaMC.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class SocialMediaMCTest {
   /**
    * Test campaignCost of class.
    */
   @Test public void testCalculate() {
      SocialMediaMC test = new SocialMediaMC("Test1", 35000.00, 3, 8000);
      Assert.assertTrue(test.campaignCost() == 27000);
   }
}
