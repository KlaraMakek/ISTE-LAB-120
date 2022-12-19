/**
 * Boat
 * @author Klara Makek
 * @version 23.11.2022.
 * Course: ISTE-120
 * LAB 11
 */
/************** JAVADOC ************************/
public class SailBoat extends Boat {
    // attributes
    private int numSails;

    // constructor
    public SailBoat() {
        super();
        numSails = 1;
    }

    // constructor
    public SailBoat(String color, int length, int numSails) {
        super(color, length);
        setNumSails(numSails);
    }

    /**
     * gets the number of sails
     * 
     * @return number of sails
     */
    public int getNumSails() {
        return numSails;
    }

    /**
     * true/falls sets the number of the sails
     * 
     * @param numSails
     * @return true if 1 and/or 4 and/or
     */
    public boolean setNumSails(int numSails) {
        if (numSails >= 1 && numSails <= 4) {
            this.numSails = numSails;
            return true;
        }
        return false;
    }

    // calculates the price
    // return calculations
    public double calcPrice() {
        return length * 1000 + numSails * 2000;
    }

    /**
     * to string to get the text
     */
    public String toString() {
        return String.format("%s\tNumber of sails = %d \tPrice is = %.2f", super.toString(), numSails, calcPrice());
    }
}
