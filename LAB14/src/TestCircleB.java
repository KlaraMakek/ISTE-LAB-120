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
public class TestCircleB {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the circle: ");
        Circle aCircle = null;

        try {

            double test = in.nextDouble();
            // Instantiate a Circle object
            aCircle = new Circle(test);

        } catch (InputMismatchException a) {
            System.out.println("InputMismatchException");
        } catch (NoSuchElementException b) { 
            System.out.println("CTRL+C entered - Program terminated.");
        } catch (ShapeException c) {
            System.out.println("ShapeException");
        } catch (Exception d) {
            System.out.println("Exemption");

        }
    }
}
