/**
 * Circle - class to model a circle
 * ISTE-120 Lab 14 - student starter code
 * @author  D. Patric
 * @version 2201
 */

public class Circle {
   // circle radius
   private double radius;

   /**
    * constructor
    * @param _radius the radius of the circle
    */
   public Circle(double _radius ) {
      // implement body here
   }

   // accessor

   public double getRadius() {
      return radius;
   }

   // mutator

   public void setRadius(double newRadius) {
   	// implement body here
   }

   // methods

   /**
    * area - compute and return the area of the circle
    * @return the area of the circle
    */
   public double area() {
      return Math.PI * radius * radius;
   }

   /**
    * stretchBy - stretches circle size by multiplying
    * the radius by the factor provided.
    * @param factor the stretch factor
    */
   public void stretchBy(double factor ) {
      // implement body here
   }

   /**
    * Return a string representation of a circle.
    * @return a string representing this circle
    */
   public String toString() {
     // implement body here
   }
}