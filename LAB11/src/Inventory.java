import java.util.ArrayList;

/**
 * Boat part 3
 * @author Klara Makek
 * @version 23.11.2022.
 * Course: ISTE-120
 * LAB 11
 */
/************** JAVADOC ************************/
public class Inventory {
    public static void main(String[] args) {
        // array list
        ArrayList<Boat> inve = new ArrayList<>();

        // adds on
        inve.add(new PowerBoat("blue", 22, 60));
        inve.add(new SailBoat());
        inve.add(new SailBoat("red", 42, 3));
        inve.add(new PowerBoat("yellow", 35, 80));
        inve.add(new PowerBoat("red", 50, 120));
        inve.add(new SailBoat("blue", 33, 2));
        inve.add(new PowerBoat("white", 20, 10));

        // printing....
        System.out.println("Printing all boats: ");
        for (Boat b : inve) {
            System.out.println(b);
        }

        double totalPrice = 0; // price
        int mosExpIndex = 0; // expensive
        /**
         * calculates the things
         */
        for (int i = 0; i < inve.size(); i++) {
            totalPrice += inve.get(i).calcPrice();
            if (inve.get(i).calcPrice() > inve.get(mosExpIndex).calcPrice()) {
                mosExpIndex = i;
            }
        }
        // prints.....
        System.out.printf("%nTotal price of all boats is: %.2f%n", totalPrice);
        System.out.println("\nMost expensive boat: " + inve.get(mosExpIndex));
    }
}
