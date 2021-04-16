import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for DirectMC.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class DirectMCTest {
   /**
    * Test toString method.
    */
   @Test public void testToString() {
      DirectMC test1 = new DirectMC("Test1", 10000, 3, 2000);
      Assert.assertTrue(test1.toString().contains(test1.name));
   }

   /**
    * Tests gets and sets of class.
    */
   @Test public void testManipulators() {
      DirectMC test1 = new DirectMC("Test1", 10000, 3, 2000);
      test1.setName("Test2");
      Assert.assertTrue(test1.getName() == "Test2");
      test1.setRevenue(12000);
      Assert.assertTrue(test1.getRevenue() == 12000);
      test1.setCostPerMailPiece(4);
      Assert.assertTrue(test1.getCostPerMailPiece() == 4);
      test1.setNumberOfMailPieces(3000);
      Assert.assertTrue(test1.getNumberOfMailPieces() == 3000);
   }

   /**
    * Tests count of class.
    */
   @Test public void testCount() {
      DirectMC test1 = new DirectMC("Test1", 10000, 3, 2000);
      Assert.assertTrue(MarketingCampaign.getCount() > 0);
      MarketingCampaign.resetCount();
      Assert.assertTrue(MarketingCampaign.getCount() == 0);
   }
}
