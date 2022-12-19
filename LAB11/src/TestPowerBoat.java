/**
 * Boat
 * @author Klara Makek
 * @version 23.11.2022.
 * Course: ISTE-120
 * LAB 11
 */
/************** JAVADOC ************************/
public class TestPowerBoat {
    public static void main(String[] args) {

        // test
        PowerBoat test = new PowerBoat();
        // prints...
        System.out.println(test);
        // prints...
        System.out.println("\nChanging powerboat's color to \"gray\"");
        if (!test.setColor("gray")) {
            System.out.println("Error: Boats can only be white, red, blue or yellow.");
        } // prints...
        System.out.println("\nChanging powerboat's color to \"yellow\"");
        if (!test.setColor("yellow")) {
            System.out.println("Error: Boats can only be white, red, blue or yellow.");
        }
        // prints...
        System.out.println("\nChanging powerboat's size to 420");
        if (!test.setLenght(420)) {
            System.out.println("Error. It can be only 5 to 350.");
        } // prints...
        System.out.println("\nChanging powerboat's length to 120");
        if (!test.setLenght(120)) {
            System.out.println("Error. It can be only 5 to 350.");
        }
    }
}
