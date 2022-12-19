/**
 * Boat
 * @author Klara Makek
 * @version 23.11.2022.
 * Course: ISTE-120
 * LAB 11
 */
/************** JAVADOC ************************/
public class PowerBoat extends Boat {
    // attributes
    private int engineSize;

    // constructor
    public PowerBoat() {
        super();
        engineSize = 5;
    }

    // constructor
    public PowerBoat(String color, int length, int engineSize) {
        super(color, length);
        setEngineSize(engineSize);
    }

    /**
     * true/false sets engine size
     * 
     * @param engineSize
     * @return true if engineSize and/or 5 or and/or 350
     */
    private boolean setEngineSize(int engineSize) {
        if (engineSize >= 5 && engineSize <= 350) {
            this.engineSize = engineSize;
            return true;
        }
        return false;
    }

    /**
     * gets the engin size
     * 
     * @return engine size
     */
    public int getEngineSize() {
        return engineSize;
    }

    /**
     * calculates the price
     * 
     * @return the calculations
     */
    public double calcPrice() {
        return 5000 + length * 300 + engineSize * 20;
    }

    /**
     * prints the string
     */
    public String toString() {
        return String.format("%s\tEngine size = %d \tPrice = %.2f", super.toString(), engineSize, calcPrice());
    }
}
