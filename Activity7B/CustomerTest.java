import org.junit.Assert;
import org.junit.Test;

/**
 * Customer test class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-12-2021
 */
public class CustomerTest {
   /**
    * Test of one argument setLocation.
    */
   @Test public void setLocationTest1() {
      Customer customer = new Customer("Doe, Jane");
      customer.setLocation("Auburn, AL");
      Assert.assertEquals("Auburn, AL", customer.getLocation());
   }

   /**
    * Test of two argument setLocation.
    */
   @Test public void setLocationTest2() {
      Customer customer = new Customer("Doe, Jane");
      customer.setLocation("Auburn", "AL");
      Assert.assertEquals("Auburn, AL", customer.getLocation());
   }

   /**
    * Test of changeBalance method.
    */
   @Test public void changeBalanceTest() {
      Customer customer = new Customer("Doe, Jane");
      customer.changeBalance(100);
      Assert.assertEquals(customer.getBalance(), 100, .000001);
   }

   /**
    * Test of toString method.
    */
   @Test public void toStringTest() {
      Customer customer = new Customer("Doe, Jane");
      customer.setLocation("Auburn, AL");
      customer.changeBalance(400);
      Assert.assertEquals("Doe, Jane\nAuburn, AL\n$400.0", customer.toString());
   }

   /**
    * Test of 0 output of compareTo method.
    */
   @Test public void compareToTest1() {
      Customer customer1 = new Customer("Doe, John");
      customer1.changeBalance(100);

      Customer customer2 = new Customer("Doe, Jane");
      customer2.changeBalance(100);

      Assert.assertTrue(customer1.compareTo(customer2) == 0);
   }

   /**
    * Test of 1 output of compareTo method.
    */
   @Test public void compareToTest2() {
      Customer customer1 = new Customer("Doe, John");
      customer1.changeBalance(300);

      Customer customer2 = new Customer("Doe, Jane");
      customer2.changeBalance(200);

      Assert.assertTrue(customer1.compareTo(customer2) == 1);
   }

   /**
    * Test of -1 output of compareTo method.
    */
   @Test public void compareToTest3() {
      Customer customer1 = new Customer("Doe, John");
      customer1.changeBalance(100);

      Customer customer2 = new Customer("Doe, Jane");
      customer2.changeBalance(200);

      Assert.assertTrue(customer1.compareTo(customer2) == -1);
   }
}
