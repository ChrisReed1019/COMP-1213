/**
 * Program to store UserInfo.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-8-2021
 */
public class UserInfo {
   //instance variables
   private static final int OFFLINE = 0, ONLINE = 1;
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;

   //constructor

   /**
    * Takes in first and last name of user.
    *
    * @param firstNameIn First Name
    * @param lastNameIn Last Name
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not Specified";
      age = 0;
      status = OFFLINE;
   }
   //methods

   /**
    * Location modifier.
    *
    * @param locationIn Input variable
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }

   /**
    * Age modifier.
    *
    * @param ageIn Input variable
    * @return Returns whether age was set.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }

   /**
    * Outputs location.
    *
    * @return Returns location.
    */
   public String getLocation() {
      return location;
   }

   /**
    * Outputs age.
    *
    * @return Returns age.
    */
   public int getAge() {
      return age;
   }

   /**
    * Sets status to online.
    */
   public void logOn() {
      status = ONLINE;
   }

   /**
    * Sets status to offlin.
    */
   public void logOff() {
      status = OFFLINE;
   }

   /**
    * Returns String version of object.
    *
    * @return returns String version of object
    */
   public String toString() {
      String output = "Name: " + firstName + " "
              + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      } else {
         output += "Online";
      }

      return output;
   }
}
