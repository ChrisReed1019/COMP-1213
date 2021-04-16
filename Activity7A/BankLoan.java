/**
 * Bank Loan class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-9-2021
 */

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
    * Constructor of BankLoan.
    * @param customerNameIn Customer name.
    * @param interestRateIn Interest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    * Borrow an amount of money from bank.
    * @param amount Amount to be borrrowed
    * @return Boolean if operation was successful.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
    * Pay amount back to bank.
    * @param amountPaid Amount to be paid.
    * @return Returns overcharge if any.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }

   /**
    * Returns the variable balance.
    * @return Returns balance.
    */
   public double getBalance() {
      return balance;
   }

   /**
    * Sets interest rate.
    * @param interestRateIn Interest rate to be set.
    * @return Boolean whether operation was successful.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }

   /**
    * Returns the variable interest rate.
    * @return Returns interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }

   /**
    * Charges interest based on interestRate.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }

   /**
    * Checks if amount is valid.
    * @param amount Amount to be checked.
    * @return Returns boolean whether amount if valid.
    */
   public static boolean isAmountValid(double amount) { return amount >= 0; }

   /**
    * Returns the variable loansCreated.
    * @return Returns loansCreated.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }

   /**
    * Checks if BankLoan object is in debt.
    * @param loan BankLoan object.
    * @return Returns true if in debt, false if not in debt.
    */
   public static boolean isInDebt(BankLoan loan) {
      return loan.getBalance() > 0;
   }

   /**
    * Resets loansCreated to 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

   /**
    * Returns class in string format.
    * @return String of class values.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
