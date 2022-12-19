
/**
 * Circle - class to model a circle
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
public class Circle {
   // circle radius
   private double radius;

   /**
    * constructor
    * 
    * @param _radius the radius of the circle
    */
   public Circle(double inRadius) throws ShapeException {
      if (inRadius <= 0.0) {
         throw new ShapeException("Error");
      } else {
         radius = inRadius;
      }
   }

   // accessor

   public double getRadius() {
      return radius;
   }

   // mutator

   public void setRadius(double newRadius) throws Exception {
      if (newRadius <= 0.0) {
         throw new Exception("Error");
      } else {
         radius = newRadius;
      }
   }

   // methods

   /**
    * area - compute and return the area of the circle
    * 
    * @return the area of the circle
    */
   public double area() {
      return Math.PI * radius * radius;
   }

   /**
    * stretchBy - stretches circle size by multiplying
    * the radius by the factor provided.
    * 
    * @param factor the stretch factor
    */
   public void stretchBy(double factor) throws Exception {
      if (factor <= 0.0) {
         throw new Exception("Error");
      } else {
         radius = radius * factor;
      }
   }

   /**
    * Return a string representation of a circle.
    * 
    * @return a string representing this circle
    */
   public String toString() {
      return String.format("Circle: " + radius);

   }
}