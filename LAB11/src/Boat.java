/**
 * Boat
 * @author Klara Makek
 * @version 23.11.2022.
 * Course: ISTE-120
 * LAB 11
 */
/************** JAVADOC ************************/
public class Boat {

    // attributes
    protected String color;
    protected int length;

    // constructor
    public Boat() {
        color = "white";
        length = 20;
    }

    // constructor
    public Boat(String color, int length) {
        setColor(color.toLowerCase());
        setLenght(length);
    }

    /**
     * set the length of the sail
     * 
     * @param length
     * @return true if more and/or 20 or less and/or 50
     */
    boolean setLenght(int length) {
        if (length >= 20 && length <= 50) {
            this.length = length;
            return true;
        }
        return false;

    }

    /**
     * sets the color of the sails
     * 
     * @param color
     * @return true if the color is correct
     */
    boolean setColor(String color) {
        if (color.equals("white") || color.equals("blue") || color.equals("red") || color.equals("yellow")) {
            this.color = color;
            return true;
        }
        return false;
    }

    /**
     * gets the color
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * gets the length
     * 
     * @return length
     */
    public int getLenght() {
        return length;
    }

    /**
     * to string to get the text
     */
    public String toString() {
        return String.format("Color = %s\tLength = %d", color, length);
    }

    /**
     * calculates the price
     * 
     * @return the calculations
     */
    public double calcPrice() {
        return length * 1000;
    }
}
