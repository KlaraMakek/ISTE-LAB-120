/**
 * TestCircle - class to test the Circle class
 * ISTE-120 Lab 14 - student starter code
 * 
 * @author D. Patric
 * @version 2201
 */
/**
 * Circle
 * @author Klara Makek
 * @version 5.12.2022.
 * Course: ISTE-120
 * LAB 14
 */
 /**************JAVADOC************************/
public class TestCircle {
   public static void main(String[] args) throws Exception {
      // read a radius of the circle from command line
      double radius = Double.parseDouble(args[0]);

      // Instantiate a Circle object
      Circle aCircle = new Circle(radius);

      // Print current status of the circle
      System.out.println(aCircle);
   }
}