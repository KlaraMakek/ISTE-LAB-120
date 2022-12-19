/**
 * Circle
 * @author Klara Makek
 * @version 5.12.2022.
 * Course: ISTE-120
 * LAB 14
 */
 /**************JAVADOC************************/
public class TestCircleA {
    public static void main(String[] args) throws Exception {
        try {
            // read a radius of the circle from command line
            double radius = Double.parseDouble(args[0]);

            // Instantiate a Circle object
            Circle aCircle = new Circle(radius);

            // Print current status of the circle
            System.out.println(aCircle);
        } catch (ShapeException a) {
            System.out.println("ShapeException");
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException c) {
            System.out.println("NumberFormatException");
        } catch (Exception d) {
            System.out.println("Exception");
        }
    }
}
