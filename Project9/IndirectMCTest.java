import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for IndirectMC.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-29-2021
 */
public class IndirectMCTest {
   /**
    * Test toString method.
    */
   @Test
   public void testToString() {
      IndirectMC test1 = new IndirectMC("Test1", 10000, 2, 3500);
      Assert.assertTrue(test1.toString().contains(test1.name));
   }

   /**
    * Tests gets and sets of class.
    */
   @Test
   public void testManipulators() {
      IndirectMC test1 = new IndirectMC("Test1", 10000, 2, 3500);
      test1.setName("Test2");
      Assert.assertTrue(test1.getName() == "Test2");
      test1.setRevenue(12000);
      Assert.assertTrue(test1.getRevenue() == 12000);
      test1.setCostPerAd(4);
      Assert.assertTrue(test1.getCostPerAd() == 4);
      test1.setNumberOfAds(4000);
      Assert.assertTrue(test1.getNumberOfAds() == 4000);
   }
}