import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Circle
 * @author Klara Makek
 * @version 5.12.2022.
 * Course: ISTE-120
 * LAB 14
 */
 /**************JAVADOC************************/
public class TestCircleC {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Circle circle = null;
        boolean test2 = false;
        while (!test2) {
            try {
                // read a radius of the circle from command line
                System.out.print("Enter the circle: ");
                double radius = in.nextDouble();

                // Instantiate a Circle object
                circle = new Circle(radius);
                test2 = true;
            } catch (InputMismatchException a) {
                System.out.println("InputMismatchException");
            } catch (NoSuchElementException b) {
                System.out.println("NoSuchElementException");
            } catch (ShapeException c) {
                System.out.println("ShapeException");
            } catch (Exception d) {
                System.out.println("Exception");
            }
            in.nextLine();
        }
        // Print current status of the circle
        System.out.println(circle);
    }
}
