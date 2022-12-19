import java.util.Scanner;

/**
 * TradeStock - class to exercise the Stock class.
 * 
 * @author D. Patric (adapted from J. Leone/R. Niemi
 * @version 2201
 */

public class TradeStock {

   public static void main(String[] args) {
      // declarations
      Scanner in = new Scanner(System.in);
      String name; // Name of stock
      String symbol; // Symbol of stock
      double price; // price per share of stock
      int shares; // number of shares of stock

      // instantiate Stock object with price and symbol
      Stock myStock = new Stock();

      // get name and symbol
      System.out.print("Enter name of stock: ");
      name = in.nextLine();
      if (!myStock.setName(name)) { // if name has none letters then the following error massage:
         System.out.println("Invalid name - Name must be!"); // error massage
         System.exit(0); // system exit
      }


      System.out.print("Enter symbol of stock: ");
      symbol = in.nextLine();
      if (!myStock.setSymbol(symbol)) { // if symbol has less then 3 and more then the following error message:
         System.out.println("Invalid symbol - Symbol must have 3 to 6 letters!"); // error message
         System.exit(0); // system exit
      }



      // prompt user for price and set it
      System.out.print("Enter price of stock: ");
      price = in.nextDouble();
      if (!myStock.setPrice(price)) { // if price less and 0 then the following error message:
         System.out.println("Invalid price - Must be grater then $0.00!"); // error message
         System.exit(0); // system exit
      }


      // prompt user for number of shares and set it
      System.out.print("Enter number of shares: ");
      shares = in.nextInt();
      if (!myStock.setShares(shares)) { // if shares less/and inclusively and multiple of 10 then
                                                             // 10 and more then 1000 then the following error massage:
         System.out.println("Invalid number of shares - Must be between  10 and 1000, inclusively and multiple of 10!"); // error
                                                                                                                         // message
         System.exit(0); // system exit
      }
      in.close(); // closes scanner
      // print stock info using spaces with each output
      System.out.printf("%nName: %s%n", myStock.getName());
      System.out.printf("Symbol: %s%n", myStock.getSymbol());
      System.out.printf("Price:  %.2f%n", myStock.getPrice());
      System.out.printf("Shares: %d%n", myStock.getShares());


   }
}