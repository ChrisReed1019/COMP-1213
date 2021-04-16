/**
 * Program to use UserInfo.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-8-2021
 */
public class UserInfoDriver {
   /**
    * Uses UserInfo
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);

      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Auburn");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}