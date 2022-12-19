/**
 * Stock - class to emulate corporate stocks.
 * 
 * @author D. Patric (adapted from J. Leone/R. Niemi
 * @version 2201
 */

public class Stock {
   private String name; // name of company
   private String symbol; // Symbol of company on Stock Exchange
   private double price; // price per share
   private int shares; // number of shares
   private static final double CommissionRate = 0.01;

   /**
    * Constructor with name and symbol
    */
   public Stock(String _name, String _symbol) {
      name = _name;
      symbol = _symbol;
      price = 0.0;
      shares = 0;
   }

   /**
    * Default constructor to the Stock class - SetS the value of the name and
    * symbol to the empty String
    * 
    */
   public Stock() {
      name = "";
      symbol = "";
   }

   /**
    * Get name of stock
    * 
    * @return name of stock
    */
   public String getName() {
      return name;
   }

   /**
    * Get symbol of stock
    * 
    * @return symbol of stock
    */
   public String getSymbol() {
      return symbol;
   }

   /**
    * Get price of stock
    * 
    * @return price of stock
    */
   public double getPrice() {
      return price;
   }

   /**
    * Get number of shares
    * 
    * @return number of shares
    */
   public int getShares() {
      return shares;
   }

   /**
    * Set name of shares
    * if name has more then 0 letters then return true
    * 
    * @return true if valid
    * @return false if invalid
    */
   public boolean setName(String name) {
      if (name.length() > 0) {
         this.name = name;
         return true;
      }
      return false;
   }

   /**
    * Set symbol of shares
    * if symbol has more then 0 letters then return true
    * 
    * @return true if valid
    * @return false if invalid
    */
   public boolean setSymbol(String symbol) {
      if (symbol.length() >=3 && symbol.length() <=6) {
         this.symbol = symbol;
         return true;
      }
      return false;
   }

   /**
    * Set price of shares
    * if price less/and 0
    * 
    * @param newPrice price of shares
    * @return true if valid
    * @return false if valid
    */
   public boolean setPrice(double newPrice) {
      if (newPrice > 0) {
         price = newPrice;
         return true;
      }
      return false;
   }

   /**
    * Set number of shares
    * if shares less/and inclusively and multiple of 10
    * 
    * @param newShares number of shares
    * @return true if valid
    * @return false if valid
    */
   public boolean setShares(int newShares) {
      if (newShares >= 10 && newShares <= 1000 && newShares % 10 == 0) {
         shares = newShares;
         return true;
      }
      return false;
   }

   /**
    * calculates the Value
    * 
    * @return price*shares
    */
   public double calcValue() {
      return price * shares;
   }

   /**
    * Calculate commission
    *
    * @return rate
    * @return 500;
    */
   public double calcCommission() {
      double rate = CommissionRate * price * shares;
      if (rate <= 500) {
         return rate;
      }
      return 500;
   }

}