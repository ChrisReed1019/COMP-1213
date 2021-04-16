import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Accept coded ticket info and get information out of it.
 *
 * @author Chris Reed - COMP-1213
 * @version 2-4-2021
 */
public class MarsTicket {
   /**
    * Accept coded ticket info and get information out of it.
    * @param args Command line arguments - not used
    */
   public static void main(String[] args)
   {
      String ticket = "";
      Scanner input = new Scanner(System.in);
      DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat discountFormat = new DecimalFormat("0%");
      DecimalFormat prizeFormat = new DecimalFormat("000000");
      Random rand = new Random();
      double price;
      double discount;
      double cost;
      String time;
      String date;
      int prize;
      String seat;
      String desc;

      System.out.print("Enter ticket code: ");
      ticket = input.nextLine();
      ticket = ticket.trim();
      System.out.println();

      if (ticket.length() >= 27) {
         price = Double.parseDouble(ticket.substring(0, 8));
         discount = Double.parseDouble(ticket.substring(9, 11));
         time = ticket.substring(11, 15);
         date = ticket.substring(15, 23);
         seat = ticket.substring(23, 26);
         desc = ticket.substring(26);

         discount /= 100;
         price /= 10;

         cost = price * (1.0 - discount);
         prize = rand.nextInt(1000000);
         
         date = date.substring(0, 2) + "/" + date.substring(2, 4) 
               + "/" + date.substring(4, 8);
         time = time.substring(0, 2) + ":" + time.substring(2, 4);
         
         System.out.print("Ticket: " + desc);
         System.out.print("   Date: " + date);
         System.out.print("   Time: " + time);
         System.out.print("\nSeat: " + seat);
         System.out.print("   Price: " + priceFormat.format(price));
         System.out.print("   Discount: " + discountFormat.format(discount));
         System.out.print("   Cost: " + priceFormat.format(cost));
         System.out.print("\nPrize Number: " + prize);

      } else {
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 27 characters.");
      }
   }
}