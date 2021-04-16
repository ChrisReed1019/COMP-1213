/**
 * Customer class.
 *
 * @author Chris Reed - COMP-1213
 * @version 3-12-2021
 */
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;

   /**
    * Default constructor for customer class.
    * @param nameIn Name of customer.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }

   /**
    * Sets location variable.
    * @param locationIn String to set location as.
    */
   public void setLocation(String locationIn) { location = locationIn; }

   /**
    * Sets location to city and state.
    * @param city City of customer.
    * @param state State of customer.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

   /**
    * Adds amount to balance.
    * @param amount Amount to be added to balance.
    */
   public void changeBalance(double amount) { balance += amount; }

   /**
    * Returns location variable.
    * @return Location variable.
    */
   public String getLocation() { return location; }

   /**
    * Returns balance variable.
    * @return Balance variable.
    */
   public double getBalance() { return balance; }

   /**
    * Customer class toString method override.
    * @return String of customer class.
    */
   public String toString() {
      String output = name + "\n";
      output += location + "\n";
      output += "$" + balance;

      return output;
   }

   /**
    * Compareto method for customer.
    * @param obj Customer object to be compared.
    * @return 0 if equal. 1 if greater. -1 if lesser.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(balance - obj.getBalance()) < 0.000001) {
         return 0;
      } else if (balance < obj.getBalance()) {
         return -1;
      } else {
         return 1;
      }
   }
}