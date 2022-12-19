/**
 * Boat
 * @author Klara Makek
 * @version 23.11.2022.
 * Course: ISTE-120
 * LAB 11
 */
/************** JAVADOC ************************/
public class TestSailBoat {
    public static void main(String[] args) {
        // test
        SailBoat test = new SailBoat();

        // prints...
        System.out.println(test);
        // prints...
        System.out.println("\nChanging sailboat's color to \"gray\"");
        if (!test.setColor("gray")) {
            System.out.println("Error: Boats can only be white, red, blue or yellow.");
        } // prints...
        System.out.println("\nChanging sailboat's color to \"yellow\"");
        if (!test.setColor("yellow")) {
            System.out.println("Error: Boats can only be white, red, blue or yellow.");
        }
        // prints...
        System.out.println("\nChanging sailboat's length to 51");
        if (!test.setLenght(51)) {
            System.out.println("Error. It can be only 20 to 50 feet.");
        } // prints...
        System.out.println("\nChanging sailboat's length to 49");
        if (!test.setLenght(49)) {
            System.out.println("Error. It can be only 20 to 50 feet.");
        }
        // prints...
        System.out.println("\nChanging sailboat's number of sails to 5.");
        if (!test.setNumSails(5)) {
            System.out.println("Error. It can be only 1 to 4 sails.");
        }
        // prints...
        System.out.println("\nChanging sailboat's number of sails to 2.");
        if (!test.setNumSails(2)) {
            System.out.println("Error. It can be only 1 to 4 sails.");
        }
    }
}
