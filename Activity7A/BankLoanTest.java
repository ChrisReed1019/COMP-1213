import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Bank Loan test class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-9-2021
 */
public class BankLoanTest {
   /**
    * Method to test chargeInterest.
    */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
